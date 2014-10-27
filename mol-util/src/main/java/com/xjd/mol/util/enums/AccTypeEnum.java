package com.xjd.mol.util.enums;

/**
 * 账户类型
 */
public enum AccTypeEnum {

	BANK_CARD("01", "银行卡")
	, BANK_BOOK("02", "存折")
	, IC_CARD("03", "IC卡")
	, FFT_CARD("04", "付费通卡")

	;

	String code;
	String desc;

	AccTypeEnum(String code, String desc) {
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
		return AccTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static AccTypeEnum valueOfCode(String code) {
		for (AccTypeEnum e : AccTypeEnum.values()) {
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
