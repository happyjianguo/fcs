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
 * A data object class directly models database table <tt>f_loan_use_apply_receipt</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_loan_use_apply_receipt.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FLoanUseApplyReceiptDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private String projectCode;

	private long applyId;

	private String applyType;

	private Money applyAmount = new Money(0, 0);

	private Money actualAmount = new Money(0, 0);

	private Date actualLoanTime;

	private Money actualDepositAmount = new Money(0, 0);

	private Money liquidityLoanAmount = new Money(0, 0);

	private Money fixedAssetsFinancingAmount = new Money(0, 0);

	private Money acceptanceBillAmount = new Money(0, 0);

	private Money creditLetterAmount = new Money(0, 0);

	private String busiSubType;

	private String busiSubTypeName;

	private long capitalChannelId;

	private String capitalChannelCode;

	private String capitalChannelType;

	private String capitalChannelName;

	private long capitalSubChannelId;

	private String capitalSubChannelCode;

	private String capitalSubChannelType;

	private String capitalSubChannelName;

	private String voucherUrl;

	private String otherUrl;

	private String remark;

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

	public long getApplyId() {
		return applyId;
	}
	
	public void setApplyId(long applyId) {
		this.applyId = applyId;
	}

	public String getApplyType() {
		return applyType;
	}
	
	public void setApplyType(String applyType) {
		this.applyType = applyType;
	}

	public Money getApplyAmount() {
		return applyAmount;
	}
	
	public void setApplyAmount(Money applyAmount) {
		if (applyAmount == null) {
			this.applyAmount = new Money(0, 0);
		} else {
			this.applyAmount = applyAmount;
		}
	}

	public Money getActualAmount() {
		return actualAmount;
	}
	
	public void setActualAmount(Money actualAmount) {
		if (actualAmount == null) {
			this.actualAmount = new Money(0, 0);
		} else {
			this.actualAmount = actualAmount;
		}
	}

	public Date getActualLoanTime() {
		return actualLoanTime;
	}
	
	public void setActualLoanTime(Date actualLoanTime) {
		this.actualLoanTime = actualLoanTime;
	}

	public Money getActualDepositAmount() {
		return actualDepositAmount;
	}
	
	public void setActualDepositAmount(Money actualDepositAmount) {
		if (actualDepositAmount == null) {
			this.actualDepositAmount = new Money(0, 0);
		} else {
			this.actualDepositAmount = actualDepositAmount;
		}
	}

	public Money getLiquidityLoanAmount() {
		return liquidityLoanAmount;
	}
	
	public void setLiquidityLoanAmount(Money liquidityLoanAmount) {
		if (liquidityLoanAmount == null) {
			this.liquidityLoanAmount = new Money(0, 0);
		} else {
			this.liquidityLoanAmount = liquidityLoanAmount;
		}
	}

	public Money getFixedAssetsFinancingAmount() {
		return fixedAssetsFinancingAmount;
	}
	
	public void setFixedAssetsFinancingAmount(Money fixedAssetsFinancingAmount) {
		if (fixedAssetsFinancingAmount == null) {
			this.fixedAssetsFinancingAmount = new Money(0, 0);
		} else {
			this.fixedAssetsFinancingAmount = fixedAssetsFinancingAmount;
		}
	}

	public Money getAcceptanceBillAmount() {
		return acceptanceBillAmount;
	}
	
	public void setAcceptanceBillAmount(Money acceptanceBillAmount) {
		if (acceptanceBillAmount == null) {
			this.acceptanceBillAmount = new Money(0, 0);
		} else {
			this.acceptanceBillAmount = acceptanceBillAmount;
		}
	}

	public Money getCreditLetterAmount() {
		return creditLetterAmount;
	}
	
	public void setCreditLetterAmount(Money creditLetterAmount) {
		if (creditLetterAmount == null) {
			this.creditLetterAmount = new Money(0, 0);
		} else {
			this.creditLetterAmount = creditLetterAmount;
		}
	}

	public String getBusiSubType() {
		return busiSubType;
	}
	
	public void setBusiSubType(String busiSubType) {
		this.busiSubType = busiSubType;
	}

	public String getBusiSubTypeName() {
		return busiSubTypeName;
	}
	
	public void setBusiSubTypeName(String busiSubTypeName) {
		this.busiSubTypeName = busiSubTypeName;
	}

	public long getCapitalChannelId() {
		return capitalChannelId;
	}
	
	public void setCapitalChannelId(long capitalChannelId) {
		this.capitalChannelId = capitalChannelId;
	}

	public String getCapitalChannelCode() {
		return capitalChannelCode;
	}
	
	public void setCapitalChannelCode(String capitalChannelCode) {
		this.capitalChannelCode = capitalChannelCode;
	}

	public String getCapitalChannelType() {
		return capitalChannelType;
	}
	
	public void setCapitalChannelType(String capitalChannelType) {
		this.capitalChannelType = capitalChannelType;
	}

	public String getCapitalChannelName() {
		return capitalChannelName;
	}
	
	public void setCapitalChannelName(String capitalChannelName) {
		this.capitalChannelName = capitalChannelName;
	}

	public long getCapitalSubChannelId() {
		return capitalSubChannelId;
	}
	
	public void setCapitalSubChannelId(long capitalSubChannelId) {
		this.capitalSubChannelId = capitalSubChannelId;
	}

	public String getCapitalSubChannelCode() {
		return capitalSubChannelCode;
	}
	
	public void setCapitalSubChannelCode(String capitalSubChannelCode) {
		this.capitalSubChannelCode = capitalSubChannelCode;
	}

	public String getCapitalSubChannelType() {
		return capitalSubChannelType;
	}
	
	public void setCapitalSubChannelType(String capitalSubChannelType) {
		this.capitalSubChannelType = capitalSubChannelType;
	}

	public String getCapitalSubChannelName() {
		return capitalSubChannelName;
	}
	
	public void setCapitalSubChannelName(String capitalSubChannelName) {
		this.capitalSubChannelName = capitalSubChannelName;
	}

	public String getVoucherUrl() {
		return voucherUrl;
	}
	
	public void setVoucherUrl(String voucherUrl) {
		this.voucherUrl = voucherUrl;
	}

	public String getOtherUrl() {
		return otherUrl;
	}
	
	public void setOtherUrl(String otherUrl) {
		this.otherUrl = otherUrl;
	}

	public String getRemark() {
		return remark;
	}
	
	public void setRemark(String remark) {
		this.remark = remark;
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