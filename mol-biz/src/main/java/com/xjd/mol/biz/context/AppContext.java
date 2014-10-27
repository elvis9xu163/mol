package com.xjd.mol.biz.context;

import java.util.Properties;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.ApplicationContext;

/**
 * <pre>
 * 应用上下文
 * 只能使用静态方法
 * </pre>
 * 
 * @author elvis.xu
 * @since 2014-9-16
 */

public class AppContext {

	protected static ApplicationContext springContext;
	protected static Properties properties;
	protected static Boolean isEnvProduct;

	public static void setSpringContext(ApplicationContext springContext) {
		AppContext.springContext = springContext;
	}

	public static ApplicationContext getSpringContext() {
		return springContext;
	}

	public static void setProperties(Properties properties) {
		AppContext.properties = properties;
	}

	public static Properties getProperties() {
		return properties;
	}

	public static String getProperty(String key) {
		if (properties != null) {
			return properties.getProperty(key);
		}
		return null;
	}

	public static long getPropertyLong(String key) {
		String prop = StringUtils.trim(getProperty(key));
		if (StringUtils.isEmpty(prop)) {
			throw new RuntimeException("The value of the property '" + key + "' does not set.");
		}
		try {
			return Long.valueOf(prop);
		} catch (NumberFormatException e) {
			throw new RuntimeException("The value of the property '" + key + "' must be Long: " + prop);
		}
	}

	public static boolean isEnvProduct() {
		return isEnvProduct;
	}
}
