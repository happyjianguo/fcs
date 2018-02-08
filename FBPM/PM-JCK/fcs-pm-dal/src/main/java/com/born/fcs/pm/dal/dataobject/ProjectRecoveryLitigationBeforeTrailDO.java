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
 * A data object class directly models database table <tt>project_recovery_litigation_before_trail</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/project_recovery_litigation_before_trail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class ProjectRecoveryLitigationBeforeTrailDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long projectRecoveryId;

	private Date openingTime;

	private Date noticeTime;

	private Date clerkArrivedTime;

	private String jurisdictionObjection;

	private String jurisdictionObjectionJudgment;

	private String jurisdictionObjectionAppeal;

	private String jurisdictionObjectionJudgmentSecond;

	private String evidenceExchange;

	private String appraisalApply;

	private String appraisalMaterial;

	private String appraisalAmount;

	private String investigatingApply;

	private String witnessesApply;

	private String increaseLitigationApply;

	private String memo;

	private String endNotice;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getProjectRecoveryId() {
		return projectRecoveryId;
	}
	
	public void setProjectRecoveryId(long projectRecoveryId) {
		this.projectRecoveryId = projectRecoveryId;
	}

	public Date getOpeningTime() {
		return openingTime;
	}
	
	public void setOpeningTime(Date openingTime) {
		this.openingTime = openingTime;
	}

	public Date getNoticeTime() {
		return noticeTime;
	}
	
	public void setNoticeTime(Date noticeTime) {
		this.noticeTime = noticeTime;
	}

	public Date getClerkArrivedTime() {
		return clerkArrivedTime;
	}
	
	public void setClerkArrivedTime(Date clerkArrivedTime) {
		this.clerkArrivedTime = clerkArrivedTime;
	}

	public String getJurisdictionObjection() {
		return jurisdictionObjection;
	}
	
	public void setJurisdictionObjection(String jurisdictionObjection) {
		this.jurisdictionObjection = jurisdictionObjection;
	}

	public String getJurisdictionObjectionJudgment() {
		return jurisdictionObjectionJudgment;
	}
	
	public void setJurisdictionObjectionJudgment(String jurisdictionObjectionJudgment) {
		this.jurisdictionObjectionJudgment = jurisdictionObjectionJudgment;
	}

	public String getJurisdictionObjectionAppeal() {
		return jurisdictionObjectionAppeal;
	}
	
	public void setJurisdictionObjectionAppeal(String jurisdictionObjectionAppeal) {
		this.jurisdictionObjectionAppeal = jurisdictionObjectionAppeal;
	}

	public String getJurisdictionObjectionJudgmentSecond() {
		return jurisdictionObjectionJudgmentSecond;
	}
	
	public void setJurisdictionObjectionJudgmentSecond(String jurisdictionObjectionJudgmentSecond) {
		this.jurisdictionObjectionJudgmentSecond = jurisdictionObjectionJudgmentSecond;
	}

	public String getEvidenceExchange() {
		return evidenceExchange;
	}
	
	public void setEvidenceExchange(String evidenceExchange) {
		this.evidenceExchange = evidenceExchange;
	}

	public String getAppraisalApply() {
		return appraisalApply;
	}
	
	public void setAppraisalApply(String appraisalApply) {
		this.appraisalApply = appraisalApply;
	}

	public String getAppraisalMaterial() {
		return appraisalMaterial;
	}
	
	public void setAppraisalMaterial(String appraisalMaterial) {
		this.appraisalMaterial = appraisalMaterial;
	}

	public String getAppraisalAmount() {
		return appraisalAmount;
	}
	
	public void setAppraisalAmount(String appraisalAmount) {
		this.appraisalAmount = appraisalAmount;
	}

	public String getInvestigatingApply() {
		return investigatingApply;
	}
	
	public void setInvestigatingApply(String investigatingApply) {
		this.investigatingApply = investigatingApply;
	}

	public String getWitnessesApply() {
		return witnessesApply;
	}
	
	public void setWitnessesApply(String witnessesApply) {
		this.witnessesApply = witnessesApply;
	}

	public String getIncreaseLitigationApply() {
		return increaseLitigationApply;
	}
	
	public void setIncreaseLitigationApply(String increaseLitigationApply) {
		this.increaseLitigationApply = increaseLitigationApply;
	}

	public String getMemo() {
		return memo;
	}
	
	public void setMemo(String memo) {
		this.memo = memo;
	}

	public String getEndNotice() {
		return endNotice;
	}
	
	public void setEndNotice(String endNotice) {
		this.endNotice = endNotice;
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