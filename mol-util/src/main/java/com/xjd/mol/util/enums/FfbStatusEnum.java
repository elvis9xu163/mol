package com.xjd.mol.util.enums;

/**
 * 付费宝状态
 */
public enum FfbStatusEnum {

	NORMAL("00", "正常")
	, INVALID("01", "无效")
	, FROZEN("02", "冻结")
	, CLOSE("03", "销户");

	String code;
	String desc;

	FfbStatusEnum(String code, String desc) {
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
		return FfbStatusEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static FfbStatusEnum valueOfCode(String code) {
		for (FfbStatusEnum e : FfbStatusEnum.values()) {
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
