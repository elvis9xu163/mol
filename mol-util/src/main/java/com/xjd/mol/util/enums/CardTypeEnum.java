package com.xjd.mol.util.enums;

/**
 * 卡类型
 */
public enum CardTypeEnum {

	DEBIT("01", "借记账户")
	, CREDIT("02", "贷记账户")
	, QUASI_CREDIT("03", "准贷记账户")
	, DEBIT_CREDIT("04", "借贷合一账户")
	, PREPAID("05", "预付费账户")
	, SEMI_OPEN_PREPAID("06", "半开放预付费账户")

	;

	String code;
	String desc;

	CardTypeEnum(String code, String desc) {
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
		return CardTypeEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static CardTypeEnum valueOfCode(String code) {
		for (CardTypeEnum e : CardTypeEnum.values()) {
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
