package com.xjd.mol.app.validate;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.xjd.mol.app.respcode.RespCode;
import com.xjd.mol.app.validate.constraints.Date;
import com.xjd.mol.app.validate.constraints.Date.DatePattern;

public class ValidationBean {

	@NotBlank(message = RespCode.RESP_0001)
	@Date(pattern = DatePattern.yyyyMMddHHmmss)
	private String timestamp;

	@NotBlank(message = RespCode.RESP_0001)
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$", message = RespCode.RESP_0002)
	private String mobile;

}