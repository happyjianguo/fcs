package com.born.fcs.am.ws.order.transferee;

import java.util.Date;

import com.born.fcs.pm.ws.order.base.FormOrderBase;

/**
 * 资产受让Order
 *
 *
 * @author Ji
 *
 */
public class FAssetsTransfereeApplicationOrder extends FormOrderBase {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4240615651983793596L;

	private Long id;

	private Long formId;

	private String projectCode;

	private String projectName;

	private Double transfereePrice;

	private Date transfereeTime;

	private String transferCompany;

	private String isTrusteeLiquidate;

	private Date liquidateTime;

	private Double liquidaterPrice;

	private String remark;

	private String attach;

	private int sortOrder;

	private Date rawAddTime;

	private Date rawUpdateTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFormId() {
		return formId;
	}

	public void setFormId(Long formId) {
		this.formId = formId;
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

	public Double getTransfereePrice() {
		return transfereePrice;
	}

	public void setTransfereePrice(Double transfereePrice) {
		this.transfereePrice = transfereePrice;
	}

	public Date getTransfereeTime() {
		return transfereeTime;
	}

	public void setTransfereeTime(Date transfereeTime) {
		this.transfereeTime = transfereeTime;
	}

	public String getTransferCompany() {
		return transferCompany;
	}

	public void setTransferCompany(String transferCompany) {
		this.transferCompany = transferCompany;
	}

	public String getIsTrusteeLiquidate() {
		return isTrusteeLiquidate;
	}

	public void setIsTrusteeLiquidate(String isTrusteeLiquidate) {
		this.isTrusteeLiquidate = isTrusteeLiquidate;
	}

	public Date getLiquidateTime() {
		return liquidateTime;
	}

	public void setLiquidateTime(Date liquidateTime) {
		this.liquidateTime = liquidateTime;
	}

	public Double getLiquidaterPrice() {
		return liquidaterPrice;
	}

	public void setLiquidaterPrice(Double liquidaterPrice) {
		this.liquidaterPrice = liquidaterPrice;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getAttach() {
		return attach;
	}

	public void setAttach(String attach) {
		this.attach = attach;
	}

	public int getSortOrder() {
		return sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
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

}
