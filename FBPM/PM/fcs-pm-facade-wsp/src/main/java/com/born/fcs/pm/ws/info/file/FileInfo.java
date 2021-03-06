package com.born.fcs.pm.ws.info.file;

import com.born.fcs.pm.ws.enums.FileTypeEnum;
import com.born.fcs.pm.ws.info.common.BaseToStringInfo;

import java.util.Date;
import java.util.List;

/**
 * 档案清单
 *
 *
 * @author hehao
 *
 */
public class FileInfo extends BaseToStringInfo {

    private static final long serialVersionUID = 6585784286999542254L;
    private long fileId;

    private long formId;


    private List<FileInputListInfo> fileListInfos;

    private String fileCode;

    private String oldFileCode;

    private String type;
    
    private FileTypeEnum fileType;

    private String projectCode;

    private String projectName;

    private long customerId;

    private String customerName;

    private long busiManagerId;

    private long busiManagerName;

    private Date filingTime;

    private String handOverDept;

    private String handOverMan;

    private Date handOverTime;

    private String principalMan;

    private String viceManager;

    private String receiveDept;

    private String receiveMan;

    private Date receiveTime;

    private String status;

    private Date rawAddTime;

    private Date rawUpdateTime;

    private Date firstLoanTime;

    private String fileCheckStatus;

    private String deptCode;

    private String deptName;

    private Date updateTime;

    private String remark;

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDeptCode() {
        return deptCode;
    }

    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getFileCheckStatus() {
        return fileCheckStatus;
    }

    public void setFileCheckStatus(String fileCheckStatus) {
        this.fileCheckStatus = fileCheckStatus;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getFileId() {
        return fileId;
    }

    public void setFileId(long fileId) {
        this.fileId = fileId;
    }


    public String getFileCode() {
        return fileCode;
    }

    public void setFileCode(String fileCode) {
        this.fileCode = fileCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public long getBusiManagerId() {
        return busiManagerId;
    }

    public void setBusiManagerId(long busiManagerId) {
        this.busiManagerId = busiManagerId;
    }

    public long getBusiManagerName() {
        return busiManagerName;
    }

    public void setBusiManagerName(long busiManagerName) {
        this.busiManagerName = busiManagerName;
    }

    public Date getFilingTime() {
        return filingTime;
    }

    public void setFilingTime(Date filingTime) {
        this.filingTime = filingTime;
    }

    public String getHandOverDept() {
        return handOverDept;
    }

    public void setHandOverDept(String handOverDept) {
        this.handOverDept = handOverDept;
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

    public String getPrincipalMan() {
        return principalMan;
    }

    public void setPrincipalMan(String principalMan) {
        this.principalMan = principalMan;
    }

    public String getViceManager() {
        return viceManager;
    }

    public void setViceManager(String viceManager) {
        this.viceManager = viceManager;
    }

    public String getReceiveDept() {
        return receiveDept;
    }

    public void setReceiveDept(String receiveDept) {
        this.receiveDept = receiveDept;
    }

    public String getReceiveMan() {
        return receiveMan;
    }

    public void setReceiveMan(String receiveMan) {
        this.receiveMan = receiveMan;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public List<FileInputListInfo> getFileListInfos() {
        return fileListInfos;
    }

    public void setFileListInfos(List<FileInputListInfo> fileListInfos) {
        this.fileListInfos = fileListInfos;
    }

    public Date getFirstLoanTime() {
        return firstLoanTime;
    }

    public void setFirstLoanTime(Date firstLoanTime) {
        this.firstLoanTime = firstLoanTime;
    }

    public long getFormId() {
        return formId;
    }

    public void setFormId(long formId) {
        this.formId = formId;
    }

    public String getOldFileCode() {
        return oldFileCode;
    }

    public void setOldFileCode(String oldFileCode) {
        this.oldFileCode = oldFileCode;
    }

	public FileTypeEnum getFileType() {
		return fileType;
	}

	public void setFileType(FileTypeEnum fileType) {
		this.fileType = fileType;
	}
}
