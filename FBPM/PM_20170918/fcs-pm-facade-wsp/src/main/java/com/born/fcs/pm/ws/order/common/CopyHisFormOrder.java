package com.born.fcs.pm.ws.order.common;

import com.born.fcs.pm.ws.order.base.ProcessOrder;

/**
 * 
 * 复制历史表单
 *
 * @author wuzj
 *
 */
public class CopyHisFormOrder extends ProcessOrder {
	
	private static final long serialVersionUID = 2178481634823086305L;
	
	/** 表单ID */
	protected long formId;
	
	/** 复制的业务类型 */
	protected String busiType;
	
	protected String busiTypeName;
	
	/** 手机 */
	protected String userMobile;
	
	/** email */
	protected String userEmail;
	
	/** 部门ID */
	protected long deptId;
	
	/** 部门编号 */
	protected String deptCode;
	
	/** 部门名称 */
	protected String deptName;
	
	/** 部门路径 deptId.deptId. */
	protected String deptPath;
	
	/** 部门路径名称 deptPathName/deptPathName/ */
	protected String deptPathName;
	
	@Override
	public void check() {
		validateGreaterThan(formId, "表单ID");
		validateHasText(busiType, "业务类型");
		validateHasText(busiTypeName, "业务类型");
	}
	
	public long getFormId() {
		return this.formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}
	
	public String getBusiType() {
		return this.busiType;
	}
	
	public void setBusiType(String busiType) {
		this.busiType = busiType;
	}
	
	public String getBusiTypeName() {
		return this.busiTypeName;
	}
	
	public void setBusiTypeName(String busiTypeName) {
		this.busiTypeName = busiTypeName;
	}
	
	public String getUserMobile() {
		return this.userMobile;
	}
	
	public void setUserMobile(String userMobile) {
		this.userMobile = userMobile;
	}
	
	public String getUserEmail() {
		return this.userEmail;
	}
	
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public long getDeptId() {
		return this.deptId;
	}
	
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptCode() {
		return this.deptCode;
	}
	
	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}
	
	public String getDeptName() {
		return this.deptName;
	}
	
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getDeptPath() {
		return this.deptPath;
	}
	
	public void setDeptPath(String deptPath) {
		this.deptPath = deptPath;
	}
	
	public String getDeptPathName() {
		return this.deptPathName;
	}
	
	public void setDeptPathName(String deptPathName) {
		this.deptPathName = deptPathName;
	}
	
}
