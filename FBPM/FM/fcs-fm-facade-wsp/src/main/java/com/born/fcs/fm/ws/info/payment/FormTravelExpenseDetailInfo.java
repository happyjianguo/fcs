package com.born.fcs.fm.ws.info.payment;

import java.util.Date;

import com.born.fcs.pm.ws.info.common.BaseToStringInfo;
import com.yjf.common.lang.util.money.Money;

public class FormTravelExpenseDetailInfo extends BaseToStringInfo {

	private static final long serialVersionUID = 2005377048215506242L;
	
	/** 主表主键 */
	private Long travelId;
	/** 主键 */
	private Long detailId;
	/** 创建时间 */
	private Date rawAddTime;
	/** 修改时间 */
	private Date rawUpdateTime;

	private Date startTime;

	private Date endTime;

	private String days;

	private String startPlace;

	private String endPlace;

	private Money trafficAmount = new Money(0, 0);

	private Money hotelAmount = new Money(0, 0);

	private Money taxAmount = new Money(0, 0);

	private Money mealsAmount = new Money(0, 0);

	private Money allowanceAmount = new Money(0, 0);
	
	private Money otherAmount = new Money(0, 0);
	
	private Money totalAmount = new Money(0, 0);

	private String deptId;
	
	private String deptName;
	
	private Money balanceAmount = new Money(0, 0);
	
	public String getDeptId() {
		return deptId;
	}

	public Money getBalanceAmount() {
		return balanceAmount;
	}

	public void setBalanceAmount(Money balanceAmount) {
		this.balanceAmount = balanceAmount;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setDeptId(String deptId) {
		this.deptId = deptId;
	}

	public Money getOtherAmount() {
		return otherAmount;
	}

	public void setOtherAmount(Money otherAmount) {
		this.otherAmount = otherAmount;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getDays() {
		return days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getStartPlace() {
		return startPlace;
	}

	public void setStartPlace(String startPlace) {
		this.startPlace = startPlace;
	}

	public String getEndPlace() {
		return endPlace;
	}

	public void setEndPlace(String endPlace) {
		this.endPlace = endPlace;
	}

	public Money getTrafficAmount() {
		return trafficAmount;
	}

	public void setTrafficAmount(Money trafficAmount) {
		this.trafficAmount = trafficAmount;
	}

	public Money getHotelAmount() {
		return hotelAmount;
	}

	public void setHotelAmount(Money hotelAmount) {
		this.hotelAmount = hotelAmount;
	}

	public Money getTaxAmount() {
		return taxAmount;
	}

	public void setTaxAmount(Money taxAmount) {
		this.taxAmount = taxAmount;
	}

	public Money getMealsAmount() {
		return mealsAmount;
	}

	public void setMealsAmount(Money mealsAmount) {
		this.mealsAmount = mealsAmount;
	}

	public Money getAllowanceAmount() {
		return allowanceAmount;
	}

	public void setAllowanceAmount(Money allowanceAmount) {
		this.allowanceAmount = allowanceAmount;
	}

	public Money getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Money totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Long getTravelId() {
		return travelId;
	}

	public void setTravelId(Long travelId) {
		this.travelId = travelId;
	}

	public Long getDetailId() {
		return detailId;
	}

	public void setDetailId(Long detailId) {
		this.detailId = detailId;
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
