package com.born.fcs.am.ws.info.pledgetypeattribute;

import java.util.Date;

import com.born.fcs.am.ws.info.pledgenetwork.PledgeNetworkCustomInfo;

public class PledgeTypeAttributeNetworkInfo extends PledgeNetworkCustomInfo {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4539723903017349489L;

	private long attributeId;

	private long assetsId;

	private long typeId;

	private String attributeKey;

	private String attributeValue;

	private String customType;

	private Date rawAddTime;

	private Date rawUpdateTime;

	public long getAttributeId() {
		return attributeId;
	}

	public void setAttributeId(long attributeId) {
		this.attributeId = attributeId;
	}

	public long getTypeId() {
		return typeId;
	}

	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}

	public String getAttributeKey() {
		return attributeKey;
	}

	public void setAttributeKey(String attributeKey) {
		this.attributeKey = attributeKey;
	}

	public String getAttributeValue() {
		return attributeValue;
	}

	public void setAttributeValue(String attributeValue) {
		this.attributeValue = attributeValue;
	}

	public String getCustomType() {
		return customType;
	}

	public void setCustomType(String customType) {
		this.customType = customType;
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

	public long getAssetsId() {
		return assetsId;
	}

	public void setAssetsId(long assetsId) {
		this.assetsId = assetsId;
	}

}
