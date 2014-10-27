package com.xjd.mol.util.validate;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotBlank;

import com.xjd.mol.util.constants.RespCode;
import com.xjd.mol.util.validate.constraints.Date;
import com.xjd.mol.util.validate.constraints.Date.DatePattern;

public class ValidationBean {

	@NotBlank(message = RespCode.RESP_0005)
	private String userId;

	@NotBlank(message = RespCode.RESP_0005)
	private String orderId;

	@NotBlank(message = RespCode.RESP_0005)
	private String loginName;

	@NotBlank(message = RespCode.RESP_0005)
	private String bankCardUser;

	@NotBlank(message = RespCode.RESP_0005)
	private String valcode;

	@NotBlank(message = RespCode.RESP_0005)
	@Date(pattern = DatePattern.yyyyMMddHHmmss)
	private String timestamp;

	@NotBlank(message = RespCode.RESP_0005)
	@Pattern(regexp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(170)|(18[^4,\\D]))\\d{8}$", message = RespCode.RESP_0006)
	private String mobile;

	@NotBlank(message = RespCode.RESP_0005)
	private String certNo;

	@NotBlank(message = RespCode.RESP_0005)
	private String realName;

	@NotBlank(message = RespCode.RESP_0005)
	private String bankCardType;

	@NotBlank(message = RespCode.RESP_0005)
	private String fftCardNo;

	@NotBlank(message = RespCode.RESP_0005)
	private String bankCardNo;

	@NotBlank(message = RespCode.RESP_0005)
	private String payToolCardNo;

	@NotBlank(message = RespCode.RESP_0005)
	private String pwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String newPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String payPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String newPayPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String fftCardPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String fftCardNewPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String payToolPwd;

	@NotBlank(message = RespCode.RESP_0005)
	private String expireMonth;

	@NotBlank(message = RespCode.RESP_0005)
	private String cvn2;

	@NotBlank(message = RespCode.RESP_0005)
	private String payToolType;

	@NotBlank(message = RespCode.RESP_0005)
	private String serviceName;

	@NotBlank(message = RespCode.RESP_0005)
	private String serviceVersion;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getValcode() {
		return valcode;
	}

	public void setValcode(String valcode) {
		this.valcode = valcode;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getNewPwd() {
		return newPwd;
	}

	public void setNewPwd(String newPwd) {
		this.newPwd = newPwd;
	}

	public String getCertNo() {
		return certNo;
	}

	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPayPwd() {
		return payPwd;
	}

	public void setPayPwd(String payPwd) {
		this.payPwd = payPwd;
	}

	public String getFftCardNo() {
		return fftCardNo;
	}

	public void setFftCardNo(String fftCardNo) {
		this.fftCardNo = fftCardNo;
	}

	public String getFftCardPwd() {
		return fftCardPwd;
	}

	public void setFftCardPwd(String fftCardPwd) {
		this.fftCardPwd = fftCardPwd;
	}

	public String getFftCardNewPwd() {
		return fftCardNewPwd;
	}

	public void setFftCardNewPwd(String fftCardNewPwd) {
		this.fftCardNewPwd = fftCardNewPwd;
	}

	public String getBankCardUser() {
		return bankCardUser;
	}

	public void setBankCardUser(String bankCardUser) {
		this.bankCardUser = bankCardUser;
	}

	public String getBankCardType() {
		return bankCardType;
	}

	public void setBankCardType(String bankCardType) {
		this.bankCardType = bankCardType;
	}

	public String getBankCardNo() {
		return bankCardNo;
	}

	public void setBankCardNo(String bankCardNo) {
		this.bankCardNo = bankCardNo;
	}

	public String getExpireMonth() {
		return expireMonth;
	}

	public void setExpireMonth(String expireMonth) {
		this.expireMonth = expireMonth;
	}

	public String getCvn2() {
		return cvn2;
	}

	public void setCvn2(String cvn2) {
		this.cvn2 = cvn2;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPayToolCardNo() {
		return payToolCardNo;
	}

	public void setPayToolCardNo(String payToolCardNo) {
		this.payToolCardNo = payToolCardNo;
	}

	public String getPayToolPwd() {
		return payToolPwd;
	}

	public void setPayToolPwd(String payToolPwd) {
		this.payToolPwd = payToolPwd;
	}

	public String getPayToolType() {
		return payToolType;
	}

	public void setPayToolType(String payToolType) {
		this.payToolType = payToolType;
	}

	public String getNewPayPwd() {
		return newPayPwd;
	}

	public void setNewPayPwd(String newPayPwd) {
		this.newPayPwd = newPayPwd;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceVersion() {
		return serviceVersion;
	}

	public void setServiceVersion(String serviceVersion) {
		this.serviceVersion = serviceVersion;
	}

}
