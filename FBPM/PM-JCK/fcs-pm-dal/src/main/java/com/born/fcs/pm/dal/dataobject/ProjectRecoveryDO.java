/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;
import java.util.Date;

/**
 * A data object class directly models database table <tt>project_recovery</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectRecoveryDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private String projectCode;

	private Money recoveryAmount = new Money(0, 0);

	private long legalManagerId;

	private String legalManagerName;

	private String recoveryStatus;

	private Date statusUpdateTime;

	private Money recoveryPrincipalAmount = new Money(0, 0);

	private Money recoveryInterestAmount = new Money(0, 0);

	private Money recoveryInterestPenaltyAmount = new Money(0, 0);

	private Money recoveryCompensationAmount = new Money(0, 0);

	private Money recoveryOtherAmount = new Money(0, 0);

	private String litigationOn;

	private String debtorReorganizationOn;

	private Money estimateLoseAmount = new Money(0, 0);

	private Money apportionLoseAmount = new Money(0, 0);

	private Money loseCognizanceAmount = new Money(0, 0);

	private long closeFormId;

	private long applyUserId;

	private String applyUserAccount;

	private String applyUserName;

	private long applyDeptId;

	private String applyDeptCode;

	private String applyDeptName;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public Money getRecoveryAmount() {
		return recoveryAmount;
	}
	
	public void setRecoveryAmount(Money recoveryAmount) {
		if (recoveryAmount == null) {
			this.recoveryAmount = new Money(0, 0);
		} else {
			this.recoveryAmount = recoveryAmount;
		}
	}

	public long getLegalManagerId() {
		return legalManagerId;
	}
	
	public void setLegalManagerId(long legalManagerId) {
		this.legalManagerId = legalManagerId;
	}

	public String getLegalManagerName() {
		return legalManagerName;
	}
	
	public void setLegalManagerName(String legalManagerName) {
		this.legalManagerName = legalManagerName;
	}

	public String getRecoveryStatus() {
		return recoveryStatus;
	}
	
	public void setRecoveryStatus(String recoveryStatus) {
		this.recoveryStatus = recoveryStatus;
	}

	public Date getStatusUpdateTime() {
		return statusUpdateTime;
	}
	
	public void setStatusUpdateTime(Date statusUpdateTime) {
		this.statusUpdateTime = statusUpdateTime;
	}

	public Money getRecoveryPrincipalAmount() {
		return recoveryPrincipalAmount;
	}
	
	public void setRecoveryPrincipalAmount(Money recoveryPrincipalAmount) {
		if (recoveryPrincipalAmount == null) {
			this.recoveryPrincipalAmount = new Money(0, 0);
		} else {
			this.recoveryPrincipalAmount = recoveryPrincipalAmount;
		}
	}

	public Money getRecoveryInterestAmount() {
		return recoveryInterestAmount;
	}
	
	public void setRecoveryInterestAmount(Money recoveryInterestAmount) {
		if (recoveryInterestAmount == null) {
			this.recoveryInterestAmount = new Money(0, 0);
		} else {
			this.recoveryInterestAmount = recoveryInterestAmount;
		}
	}

	public Money getRecoveryInterestPenaltyAmount() {
		return recoveryInterestPenaltyAmount;
	}
	
	public void setRecoveryInterestPenaltyAmount(Money recoveryInterestPenaltyAmount) {
		if (recoveryInterestPenaltyAmount == null) {
			this.recoveryInterestPenaltyAmount = new Money(0, 0);
		} else {
			this.recoveryInterestPenaltyAmount = recoveryInterestPenaltyAmount;
		}
	}

	public Money getRecoveryCompensationAmount() {
		return recoveryCompensationAmount;
	}
	
	public void setRecoveryCompensationAmount(Money recoveryCompensationAmount) {
		if (recoveryCompensationAmount == null) {
			this.recoveryCompensationAmount = new Money(0, 0);
		} else {
			this.recoveryCompensationAmount = recoveryCompensationAmount;
		}
	}

	public Money getRecoveryOtherAmount() {
		return recoveryOtherAmount;
	}
	
	public void setRecoveryOtherAmount(Money recoveryOtherAmount) {
		if (recoveryOtherAmount == null) {
			this.recoveryOtherAmount = new Money(0, 0);
		} else {
			this.recoveryOtherAmount = recoveryOtherAmount;
		}
	}

	public String getLitigationOn() {
		return litigationOn;
	}
	
	public void setLitigationOn(String litigationOn) {
		this.litigationOn = litigationOn;
	}

	public String getDebtorReorganizationOn() {
		return debtorReorganizationOn;
	}
	
	public void setDebtorReorganizationOn(String debtorReorganizationOn) {
		this.debtorReorganizationOn = debtorReorganizationOn;
	}

	public Money getEstimateLoseAmount() {
		return estimateLoseAmount;
	}
	
	public void setEstimateLoseAmount(Money estimateLoseAmount) {
		if (estimateLoseAmount == null) {
			this.estimateLoseAmount = new Money(0, 0);
		} else {
			this.estimateLoseAmount = estimateLoseAmount;
		}
	}

	public Money getApportionLoseAmount() {
		return apportionLoseAmount;
	}
	
	public void setApportionLoseAmount(Money apportionLoseAmount) {
		if (apportionLoseAmount == null) {
			this.apportionLoseAmount = new Money(0, 0);
		} else {
			this.apportionLoseAmount = apportionLoseAmount;
		}
	}

	public Money getLoseCognizanceAmount() {
		return loseCognizanceAmount;
	}
	
	public void setLoseCognizanceAmount(Money loseCognizanceAmount) {
		if (loseCognizanceAmount == null) {
			this.loseCognizanceAmount = new Money(0, 0);
		} else {
			this.loseCognizanceAmount = loseCognizanceAmount;
		}
	}

	public long getCloseFormId() {
		return closeFormId;
	}
	
	public void setCloseFormId(long closeFormId) {
		this.closeFormId = closeFormId;
	}

	public long getApplyUserId() {
		return applyUserId;
	}
	
	public void setApplyUserId(long applyUserId) {
		this.applyUserId = applyUserId;
	}

	public String getApplyUserAccount() {
		return applyUserAccount;
	}
	
	public void setApplyUserAccount(String applyUserAccount) {
		this.applyUserAccount = applyUserAccount;
	}

	public String getApplyUserName() {
		return applyUserName;
	}
	
	public void setApplyUserName(String applyUserName) {
		this.applyUserName = applyUserName;
	}

	public long getApplyDeptId() {
		return applyDeptId;
	}
	
	public void setApplyDeptId(long applyDeptId) {
		this.applyDeptId = applyDeptId;
	}

	public String getApplyDeptCode() {
		return applyDeptCode;
	}
	
	public void setApplyDeptCode(String applyDeptCode) {
		this.applyDeptCode = applyDeptCode;
	}

	public String getApplyDeptName() {
		return applyDeptName;
	}
	
	public void setApplyDeptName(String applyDeptName) {
		this.applyDeptName = applyDeptName;
	}

	public Date getRawAddTime() {
		return rawAddTime;
	}
	
	public void setRawAddTime(Date rawAddTime) {
		this.rawAddTime = rawAddTime;
	}

	public Date getRawUpdateTime() {
		return rawUpdateTime;
	}
	
	public void setRawUpdateTime(Date rawUpdateTime) {
		this.rawUpdateTime = rawUpdateTime;
	}


	/**
     * @return
     *
     * @see java.lang.Object#toString()
     */
	@Override
    public String toString() {

        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}