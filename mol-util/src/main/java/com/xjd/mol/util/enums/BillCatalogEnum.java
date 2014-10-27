package com.xjd.mol.util.enums;

/**
 * 账单类型
 */
public enum BillCatalogEnum {

	ELECTRICITY_BILL("0000", "电费")
	, WATER_BILL("0001", "水费")
	, GAS_BILL("0002", "燃气费")
	, BROADBAND_BILL("0003", "宽带/固话费")
	, CABLE_BILL("0004", "有线电视费")
	, MOBILE_BILL("0005", "手机账单")
	, MOBILE_RECHARGE("1001", "手机充值")
	, FFB_RECHARGE("1002", "付费宝充值")
	, FFB_TRANSFER("1003", "付费宝转账")
	, FFT_CARD_TRANSFER("1004", "预付费卡转账")
	, BANK_CARD_TRANSFER("1005", "银行卡转账");

	String code;
	String desc;

	BillCatalogEnum(String code, String desc) {
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
		return BillCatalogEnum.class.getSimpleName() + "[code=" + code + ", desc=" + desc + "]";
	}

	public static BillCatalogEnum valueOfCode(String code) {
		for (BillCatalogEnum e : BillCatalogEnum.values()) {
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
