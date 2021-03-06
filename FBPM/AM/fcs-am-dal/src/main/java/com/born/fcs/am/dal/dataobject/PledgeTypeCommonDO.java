/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.fcs.am.dal.dataobject;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

// auto generated imports
import com.yjf.common.lang.util.money.Money;

/**
 * A data object class directly models database table
 * <tt>pledge_type_common</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access
 * Layer) code generation utility specially developed for <tt>paygw</tt>
 * project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may be
 * OVERWRITTEN by someone else. To modify the file, you should go to directory
 * <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and find the corresponding
 * configuration file (<tt>tables/pledge_type_common.xml</tt>). Modify the
 * configuration file according to your needs, then run
 * <tt>specialmer-dalgen</tt> to generate this file.
 *
 * @author peigen
 */
public class PledgeTypeCommonDO implements Serializable {
	/** Comment for <code>serialVersionUID</code> */
	private static final long serialVersionUID = -4282603875229233564L;
	
	//========== properties ==========
	
	private long commonId;
	
	private long assetsId;
	
	private long typeId;
	
	private double pledgeRate;
	
	private String evaluationCompany;
	
	private Money evaluationPrice = new Money(0, 0);
	
	private Money mortgagePrice = new Money(0, 0);
	
	private String longitude;
	
	private String latitude;
	
	private String assetRemarkInfo;
	
	private Date rawAddTime;
	
	private Date rawUpdateTime;
	
	//========== getters and setters ==========
	
	public long getCommonId() {
		return commonId;
	}
	
	public void setCommonId(long commonId) {
		this.commonId = commonId;
	}
	
	public long getAssetsId() {
		return assetsId;
	}
	
	public void setAssetsId(long assetsId) {
		this.assetsId = assetsId;
	}
	
	public long getTypeId() {
		return typeId;
	}
	
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	
	public double getPledgeRate() {
		return pledgeRate;
	}
	
	public void setPledgeRate(double pledgeRate) {
		this.pledgeRate = pledgeRate;
	}
	
	public String getEvaluationCompany() {
		return evaluationCompany;
	}
	
	public void setEvaluationCompany(String evaluationCompany) {
		this.evaluationCompany = evaluationCompany;
	}
	
	public Money getEvaluationPrice() {
		return evaluationPrice;
	}
	
	public void setEvaluationPrice(Money evaluationPrice) {
		if (evaluationPrice == null) {
			this.evaluationPrice = new Money(0, 0);
		} else {
			this.evaluationPrice = evaluationPrice;
		}
	}
	
	public Money getMortgagePrice() {
		return mortgagePrice;
	}
	
	public void setMortgagePrice(Money mortgagePrice) {
		if (mortgagePrice == null) {
			this.mortgagePrice = new Money(0, 0);
		} else {
			this.mortgagePrice = mortgagePrice;
		}
	}
	
	public String getLongitude() {
		return longitude;
	}
	
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	public String getLatitude() {
		return latitude;
	}
	
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	
	public String getAssetRemarkInfo() {
		return assetRemarkInfo;
	}
	
	public void setAssetRemarkInfo(String assetRemarkInfo) {
		this.assetRemarkInfo = assetRemarkInfo;
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
