package com.born.fcs.pm.ws.enums;

import java.util.ArrayList;
import java.util.List;

/**
 * 还款方式
 * 
 * @author wuzj
 *
 */
public enum RepayWayEnum {
	
	ONE("ONE", "一次"),
	
	MULTI("MULTI", "多次");
	
	/** 枚举值 */
	private final String code;
	
	/** 枚举描述 */
	private final String message;
	
	/**
	 * 构造一个<code>RepayWayEnum</code>枚举对象
	 * 
	 * @param code
	 * @param message
	 */
	private RepayWayEnum(String code, String message) {
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
	 * @return RepayWayEnum
	 */
	public static RepayWayEnum getByCode(String code) {
		for (RepayWayEnum _enum : values()) {
			if (_enum.getCode().equals(code)) {
				return _enum;
			}
		}
		return null;
	}
	
	/**
	 * 获取全部枚举
	 * 
	 * @return List<RepayWayEnum>
	 */
	public static List<RepayWayEnum> getAllEnum() {
		List<RepayWayEnum> list = new ArrayList<RepayWayEnum>();
		for (RepayWayEnum _enum : values()) {
			list.add(_enum);
		}
		return list;
	}
	
	/**
	 * 获取全部枚举值
	 * 
	 * @return List<String>
	 */
	public static List<String> getAllEnumCode() {
		List<String> list = new ArrayList<String>();
		for (RepayWayEnum _enum : values()) {
			list.add(_enum.code());
		}
		return list;
	}
}
