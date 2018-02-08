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
 * A data object class directly models database table <tt>f_file_output</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/f_file_output.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
public class FFileOutputDO implements Serializable{
	/** Comment for <code>serialVersionUID</code> */
    private static final long serialVersionUID = -4282603875229233564L;

    //========== properties ==========

	private long id;

	private long fileId;

	private long formId;

	private String fileCode;

	private String oldFileCode;

	private String projectCode;

	private String projectName;

	private long customerId;

	private String customerName;

	private long applyManId;

	private String applyMan;

	private Date applyTime;

	private String applyDeptCode;

	private String applyDept;

	private String outputReason;

	private String outputDetailIds;

	private String outputDetail;

	private long handOverManId;

	private String handOverMan;

	private Date handOverTime;

	private String receiveDept;

	private long receiveManId;

	private String receiveMan;

	private String handOverDept;

	private Date receiveTime;

	private String fileFormType;

	private String attachment;

	private Date rawAddTime;

	private Date rawUpdateTime;

    //========== getters and setters ==========

	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}

	public long getFileId() {
		return fileId;
	}
	
	public void setFileId(long fileId) {
		this.fileId = fileId;
	}

	public long getFormId() {
		return formId;
	}
	
	public void setFormId(long formId) {
		this.formId = formId;
	}

	public String getFileCode() {
		return fileCode;
	}
	
	public void setFileCode(String fileCode) {
		this.fileCode = fileCode;
	}

	public String getOldFileCode() {
		return oldFileCode;
	}
	
	public void setOldFileCode(String oldFileCode) {
		this.oldFileCode = oldFileCode;
	}

	public String getProjectCode() {
		return projectCode;
	}
	
	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectName() {
		return projectName;
	}
	
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public long getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public long getApplyManId() {
		return applyManId;
	}
	
	public void setApplyManId(long applyManId) {
		this.applyManId = applyManId;
	}

	public String getApplyMan() {
		return applyMan;
	}
	
	public void setApplyMan(String applyMan) {
		this.applyMan = applyMan;
	}

	public Date getApplyTime() {
		return applyTime;
	}
	
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}

	public String getApplyDeptCode() {
		return applyDeptCode;
	}
	
	public void setApplyDeptCode(String applyDeptCode) {
		this.applyDeptCode = applyDeptCode;
	}

	public String getApplyDept() {
		return applyDept;
	}
	
	public void setApplyDept(String applyDept) {
		this.applyDept = applyDept;
	}

	public String getOutputReason() {
		return outputReason;
	}
	
	public void setOutputReason(String outputReason) {
		this.outputReason = outputReason;
	}

	public String getOutputDetailIds() {
		return outputDetailIds;
	}
	
	public void setOutputDetailIds(String outputDetailIds) {
		this.outputDetailIds = outputDetailIds;
	}

	public String getOutputDetail() {
		return outputDetail;
	}
	
	public void setOutputDetail(String outputDetail) {
		this.outputDetail = outputDetail;
	}

	public long getHandOverManId() {
		return handOverManId;
	}
	
	public void setHandOverManId(long handOverManId) {
		this.handOverManId = handOverManId;
	}

	public String getHandOverMan() {
		return handOverMan;
	}
	
	public void setHandOverMan(String handOverMan) {
		this.handOverMan = handOverMan;
	}

	public Date getHandOverTime() {
		return handOverTime;
	}
	
	public void setHandOverTime(Date handOverTime) {
		this.handOverTime = handOverTime;
	}

	public String getReceiveDept() {
		return receiveDept;
	}
	
	public void setReceiveDept(String receiveDept) {
		this.receiveDept = receiveDept;
	}

	public long getReceiveManId() {
		return receiveManId;
	}
	
	public void setReceiveManId(long receiveManId) {
		this.receiveManId = receiveManId;
	}

	public String getReceiveMan() {
		return receiveMan;
	}
	
	public void setReceiveMan(String receiveMan) {
		this.receiveMan = receiveMan;
	}

	public String getHandOverDept() {
		return handOverDept;
	}
	
	public void setHandOverDept(String handOverDept) {
		this.handOverDept = handOverDept;
	}

	public Date getReceiveTime() {
		return receiveTime;
	}
	
	public void setReceiveTime(Date receiveTime) {
		this.receiveTime = receiveTime;
	}

	public String getFileFormType() {
		return fileFormType;
	}
	
	public void setFileFormType(String fileFormType) {
		this.fileFormType = fileFormType;
	}

	public String getAttachment() {
		return attachment;
	}
	
	public void setAttachment(String attachment) {
		this.attachment = attachment;
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