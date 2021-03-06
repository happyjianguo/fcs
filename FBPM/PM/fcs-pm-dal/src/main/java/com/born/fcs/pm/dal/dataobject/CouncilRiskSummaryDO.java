/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.pm.dal.dataobject;

import java.io.Serializable;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import java.util.Date;

/**
 * A data object class directly models database table <tt>council_risk_summary</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/council_risk_summary.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class CouncilRiskSummaryDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long summaryId;

	private long councilId;

	private String summary;

	private String needConfirm;

	private String confirmManIds;

	private String confirmManNames;

	private String isConfirm;

	private long confirmManId;

	private String confirmManName;

	private String confirmResult;

	private String confirmRemark;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getSummaryId() {
		return summaryId;
	}
	
	public void setSummaryId(long summaryId) {
		this.summaryId = summaryId;
	}

	public long getCouncilId() {
		return councilId;
	}
	
	public void setCouncilId(long councilId) {
		this.councilId = councilId;
	}

	public String getSummary() {
		return summary;
	}
	
	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getNeedConfirm() {
		return needConfirm;
	}
	
	public void setNeedConfirm(String needConfirm) {
		this.needConfirm = needConfirm;
	}

	public String getConfirmManIds() {
		return confirmManIds;
	}
	
	public void setConfirmManIds(String confirmManIds) {
		this.confirmManIds = confirmManIds;
	}

	public String getConfirmManNames() {
		return confirmManNames;
	}
	
	public void setConfirmManNames(String confirmManNames) {
		this.confirmManNames = confirmManNames;
	}

	public String getIsConfirm() {
		return isConfirm;
	}
	
	public void setIsConfirm(String isConfirm) {
		this.isConfirm = isConfirm;
	}

	public long getConfirmManId() {
		return confirmManId;
	}
	
	public void setConfirmManId(long confirmManId) {
		this.confirmManId = confirmManId;
	}

	public String getConfirmManName() {
		return confirmManName;
	}
	
	public void setConfirmManName(String confirmManName) {
		this.confirmManName = confirmManName;
	}

	public String getConfirmResult() {
		return confirmResult;
	}
	
	public void setConfirmResult(String confirmResult) {
		this.confirmResult = confirmResult;
	}

	public String getConfirmRemark() {
		return confirmRemark;
	}
	
	public void setConfirmRemark(String confirmRemark) {
		this.confirmRemark = confirmRemark;
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
