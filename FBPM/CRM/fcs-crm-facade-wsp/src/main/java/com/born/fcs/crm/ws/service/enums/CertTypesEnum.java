package com.born.fcs.crm.ws.service.enums;

import com.yjf.common.lang.enums.CertTypeEnum;

/**
 * 证件类型
 * */
public enum CertTypesEnum {
	
	/** 身份证 */
	IDENTITY_CARD("IDENTITY_CARD", "身份证"),
	/** 军官证 */
	ARMY_IDENTITY_CARD("ARMY_IDENTITY_CARD", "军官证"),
	
	STUDENT_CARD("STUDENT_CARD", "学生证"),
	/** 护照 */
	PASSPORT("PASSPORT", "护照"),
	/** 其它证件 */
	OTHER("OTHER", "其它证件");
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 
	 * @param code 枚举值
	 * @param message 枚举描述
	 */
	private CertTypesEnum(String code, String message) {
		this.code = code;
		this.message = message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String getCode() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * @return Returns the code.
	 */
	public String code() {
		return code;
	}
	
	/**
	 * @return Returns the message.
	 */
	public String message() {
		return message;
	}
	
	/**
	 * 通过枚举<code>code</code>获得枚举
	 * 
	 * @param code
	 * @return CertTypeEnum
	 */
	public static CertTypesEnum getByCode(String code) {
		for (CertTypesEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<CertTypeEnum>
	 */
	public static java.util.List<CertTypesEnum> getAllEnum() {
		java.util.List<CertTypesEnum> list = new java.util.ArrayList<CertTypesEnum>(values().length);
		for (CertTypesEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public static java.util.List<String> getAllEnumCode() {
		java.util.List<String> list = new java.util.ArrayList<String>(values().length);
		for (CertTypesEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
	
	/**
	 * 通过code获取msg
	 * @param code 枚举值
	 * @return
	 */
	public static String getMsgByCode(String code) {
		if (code == null) {
			return null;
		}
		CertTypesEnum _enum = getByCode(code);
		if (_enum == null) {
			return null;
		}
		return _enum.getMessage();
	}
	
	/**
	 * 获取枚举code
	 * @param _enum
	 * @return
	 */
	public static String getCode(CertTypesEnum _enum) {
		if (_enum == null) {
			return null;
		}
		return _enum.getCode();
	}
}
