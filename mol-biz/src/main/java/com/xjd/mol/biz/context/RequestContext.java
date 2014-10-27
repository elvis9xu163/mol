package com.xjd.mol.biz.context;

import java.util.HashMap;
import java.util.Map;

import com.xjd.mol.util.constants.RespCode;
import com.xjd.mol.util.exception.BusinessException;

public class RequestContext {

	public static final String USER = "user";
	public static final String SERVICE = "service";
	public static final String CLIENT_IP = "clientIp";

	protected static ThreadLocal<Map<String, Object>> requestThreadLocal = new ThreadLocal<Map<String, Object>>();

	private RequestContext() {
	}

	public static Map<String, Object> get() {
		Map<String, Object> map = requestThreadLocal.get();
		if (map == null) {
			map = new HashMap<String, Object>();
			requestThreadLocal.set(map);
		}
		return map;
	}

	public static void setUser(User user) {
		get().put(USER, user);
	}

	public static User getUser() {
		return (User) get().get(USER);
	}

	public static User checkAndGetUser() {
		User user = getUser();
		if (user == null) {
			throw new BusinessException(RespCode.RESP_0057);
		}
		return user;
	}

	public static void setService(HydraService service) {
		get().put(SERVICE, service);
	}

	public static HydraService getService() {
		return (HydraService) get().get(SERVICE);
	}

	public static void setClientIp(String ip) {
		get().put(CLIENT_IP, ip);
	}

	public static String getClientIp() {
		return (String) get().get(CLIENT_IP);
	}
}
