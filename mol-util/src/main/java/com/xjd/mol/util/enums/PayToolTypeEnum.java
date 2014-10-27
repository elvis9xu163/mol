package com.xjd.mol.util.enums;

/**
 * 支付工具类型
 */
public enum PayToolTypeEnum {

	FFB("00", "付费宝")
	, BANK_CARD("01", "银行卡")
	, FFT_CARD("04", "付费通卡");

	String code;
	String desc;

	PayToolTypeEnum(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	public String toString() {
		return PayToolTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static PayToolTypeEnum valueOfCode(String code) {
		for (PayToolTypeEnum e : PayToolTypeEnum.values()) {
			if (e.getCode().equals(code)) {
				return e;
			}
		}
		return null;
	}

	public static boolean validCode(String code) {
		if (valueOfCode(code) == null) {
			return false;
		}
		return true;
	}
}
