package com.born.fcs.pm.biz.service.fund;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rop.thirdparty.com.google.common.collect.Lists;

import com.born.fcs.pm.biz.exception.ExceptionFactory;
import com.born.fcs.pm.biz.service.base.BaseProcessService;
import com.born.fcs.pm.dal.dataobject.FRefundApplicationDO;
import com.born.fcs.pm.dal.dataobject.FRefundApplicationFeeDO;
import com.born.fcs.pm.dal.dataobject.ProjectDO;
import com.born.fcs.pm.domain.context.FcsPmDomainHolder;
import com.born.fcs.pm.integration.bpm.result.WorkflowResult;
import com.born.fcs.pm.ws.enums.CommonAttachmentTypeEnum;
import com.born.fcs.pm.ws.enums.base.FcsResultEnum;
import com.born.fcs.pm.ws.info.common.FormInfo;
import com.born.fcs.pm.ws.info.common.ProjectRelatedUserInfo;
import com.born.fcs.pm.ws.info.fund.FRefundApplicationFeeInfo;
import com.born.fcs.pm.ws.order.bpm.FlowVarField;
import com.born.fcs.pm.ws.order.bpm.WorkflowStartOrder;
import com.born.fcs.pm.ws.order.bpm.enums.FlowVarTypeEnum;
import com.born.fcs.pm.ws.order.common.WorkFlowBeforeProcessOrder;
import com.born.fcs.pm.ws.result.base.FcsBaseResult;
import com.born.fcs.pm.ws.service.fund.RefundApplicationService;
import com.yjf.common.lang.util.ListUtil;
import com.yjf.common.lang.util.money.Money;

/**
 * 退费申请审核流程处理
 * 
 * @author Ji
 *
 * 2016-5-23 下午17:58:00
 */
@Service("refundApplicationProcessService")
public class RefundApplicationProcessServiceImpl extends BaseProcessService {
	@Autowired
	RefundApplicationService refundApplicationService;
	
	@Override
	public FcsBaseResult startBeforeProcess(WorkFlowBeforeProcessOrder order) {
		FcsBaseResult result = new FcsBaseResult();
		try {
			long formId = order.getFormInfo().getFormId();
			FRefundApplicationDO applyDO = FRefundApplicationDAO.findByFormId(formId);
			if (applyDO == null) {
				throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "退费申请单未找到");
			}
			//自定义待办任务名称
			WorkflowStartOrder startOrder = (WorkflowStartOrder) FcsPmDomainHolder.get()
				.getAttribute("startOrder");
			if (startOrder != null) {
				startOrder.setCustomTaskName(applyDO.getProjectName() + "-退费申请");
			}
			result.setSuccess(true);
		} catch (Exception e) {
			result.setSuccess(false);
			result.setMessage(e.getMessage());
			logger.error("退费申请流程启动前置处理出错 ： {}", e);
		}
		return result;
	}
	
	@Override
	public void startAfterProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		refundApplicationService.syncForecast(formInfo.getFormId(), false);
	}
	
	@Override
	public void endFlowProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		
		FRefundApplicationDO applyDO = FRefundApplicationDAO.findByFormId(formInfo.getFormId());
		if (applyDO == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "退费申请单未找到");
		}
		
		Money sumAmount = Money.zero();//本次申请退费总额
		
		List<FRefundApplicationFeeInfo> feeInfoList = refundApplicationService
			.findByRefundId(applyDO.getRefundId());
		if (ListUtil.isNotEmpty(feeInfoList)) {
			for (FRefundApplicationFeeInfo fRefundApplicationFeeInfo : feeInfoList) {
				sumAmount = sumAmount.add(fRefundApplicationFeeInfo.getRefundAmount());
			}
		}
		//更新project表中已收费金额总和
		ProjectDO project = projectDAO.findByProjectCode(applyDO.getProjectCode());
		if (project != null) {
			project.setChargedAmount(project.getChargedAmount().subtract(sumAmount));
			project.setRefundAmount(project.getRefundAmount().add(sumAmount));
			projectDAO.update(project);
		}
		//更新预测数据
		refundApplicationService.syncForecast(formInfo.getFormId(), true);
	}
	
	@Override
	public void manualEndFlowProcess(FormInfo formInfo, WorkflowResult workflowResult) {
		FRefundApplicationDO applyDO = FRefundApplicationDAO.findByFormId(formInfo.getFormId());
		if (applyDO == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "退费申请单未找到");
		}
		//		if (applyDO.getProjectType().equals("FINANCIAL_PRODUCT")) {//理财类项目
		//			financialProjectService.changeStatus(applyDO.getProjectCode(),
		//				FinancialProjectStatusEnum.CAPITAL_APPLY_WAITING);
		//		}
	}
	
	@Override
	public List<FlowVarField> makeWorkFlowVar(FormInfo formInfo) {
		FRefundApplicationDO applyDO = FRefundApplicationDAO.findByFormId(formInfo.getFormId());
		if (applyDO == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "退费申请单未找到");
		}
		List<FlowVarField> fields = Lists.newArrayList();
		//风险经理ID
		ProjectRelatedUserInfo riskManager = projectRelatedUserService.getRiskManager(applyDO
			.getProjectCode());
		FlowVarField riskManagerId = new FlowVarField();
		
		riskManagerId.setVarName("RiskManagerID");
		riskManagerId.setVarType(FlowVarTypeEnum.STRING);
		if (null != riskManager) {
			riskManagerId.setVarVal(String.valueOf(riskManager.getUserId()));
			
		} else {
			riskManagerId.setVarVal("0");
		}
		fields.add(riskManagerId);
		//是否有相应签报和会议纪要
		FlowVarField proof = new FlowVarField();
		
		List<FRefundApplicationFeeDO> listAppFeeDO = FRefundApplicationFeeDAO
			.findByRefundId(applyDO.getRefundId());
		String isQbOrHyjy = "NO";
		if (listAppFeeDO != null && listAppFeeDO.size() > 0) {
			for (FRefundApplicationFeeDO fRefundApplicationFeeDO : listAppFeeDO) {
				if (fRefundApplicationFeeDO.getFormChange() != null
					|| fRefundApplicationFeeDO.getRiskCouncilSummary() != null
					|| fRefundApplicationFeeDO.getProjectApproval() != null) {
					isQbOrHyjy = "IS";
					break;
				}
			}
		}
		proof.setVarName("proof");
		proof.setVarType(FlowVarTypeEnum.STRING);
		proof.setVarVal(isQbOrHyjy);
		fields.add(proof);
		
		return fields;
	}
	
	//删除
	@Override
	public void deleteAfterProcess(FormInfo formInfo) {
		FRefundApplicationDO applyDO = FRefundApplicationDAO.findByFormId(formInfo.getFormId());
		
		if (applyDO == null) {
			throw ExceptionFactory.newFcsException(FcsResultEnum.HAVE_NOT_DATA, "退费申请单未找到");
		}
		List<FRefundApplicationFeeDO> listAppFeeDO = FRefundApplicationFeeDAO
			.findByRefundId(applyDO.getRefundId());
		FRefundApplicationDAO.deleteByFormId(formInfo.getFormId());
		for (FRefundApplicationFeeDO fRefundApplicationFeeDO : listAppFeeDO) {
			FRefundApplicationFeeDAO.deleteById(fRefundApplicationFeeDO.getId());
		}
		//附件管理附件删除
		commonAttachmentDAO.deleteByBizNoModuleType("PM_" + applyDO.getFormId(),
			CommonAttachmentTypeEnum.REFUND_APPLICATION.code());
	}
}
