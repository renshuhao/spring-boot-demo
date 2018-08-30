package com.wealthlake.sb_demo.common.domain;

/**
 * 结果码(如需扩展结果码，请实现ResultCodeEnum接口，自定义一个)
 * 
 * @author puzhihong
 * 
 */
public enum ResultCode implements ResultCodeEnum {
	
	/**
	 * 通用的返回码
	 */
	COMMON_SUCCESS("000000", "成功"),
	COMMON_BUSINESS_EXCEPTION("000997", "业务异常"),
	COMMON_SYSTEM_EXCEPTION("000998", "系统异常"),
	COMMON_SYSTEM_ERROR("000999", "系统错误");

	/**
	 * 结果码
	 */
	private String code;

	/**
	 * 描述
	 */
	private String description;

	private ResultCode(String code, String description) {
		this.code = code;
		this.description = description;
	}

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public String getDescription() {
		return description;
	}

}
