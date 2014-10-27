package com.xjd.mol.util;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;

public abstract class EnumUtil {

	public static boolean valid(Class<? extends Enum> enumClass, String value) {
		Method validMethod = null;
		for (Method m : enumClass.getDeclaredMethods()) {
			if ("validCode".equals(m.getName())) {
				validMethod = m;
				break;
			}
		}

		if (validMethod == null) {
			throw new RuntimeException("No 'validCode' method for enum '" + enumClass.getSimpleName() + "'.");
		}

		Class<?>[] paramTypes = validMethod.getParameterTypes();

		if (paramTypes.length != 1) {
			throw new RuntimeException("The 'validCode' method of '" + enumClass.getSimpleName() + "' can only have one parameter.");
		}

		Class<?> paramType = paramTypes[0];
		String v = StringUtils.trim(value);
		Object tv = v;

		if (paramType.equals(String.class)) {
			// DO NOTHING

		} else if (paramType.isPrimitive() || Number.class.isAssignableFrom(paramType)) {
			if (paramType.equals(char.class)) {
				if (v == null || v.length() != 1) {
					return false;
				}
				tv = v.charAt(0);
			} else {
				try {
					if (paramType.equals(byte.class) || paramType.equals(Byte.class)) {
						tv = Byte.parseByte(v);

					} else if (paramType.equals(short.class) || paramType.equals(Short.class)) {
						tv = Short.parseShort(v);

					} else if (paramType.equals(int.class) || paramType.equals(Integer.class)) {
						tv = Integer.parseInt(v);

					} else if (paramType.equals(long.class) || paramType.equals(Long.class)) {
						tv = Long.parseLong(v);

					} else if (paramType.equals(float.class) || paramType.equals(Float.class)) {
						tv = Float.parseFloat(v);

					} else if (paramType.equals(double.class) || paramType.equals(Double.class)) {
						tv = Double.parseDouble(v);
					}
				} catch (NumberFormatException e) {
					return false;
				}
			}
		} else {
			throw new RuntimeException("Not support parameter type '" + paramType.getName() + "' of 'validCode' method for enum '"
					+ enumClass.getSimpleName() + "'");
		}

		try {
			return (Boolean) validMethod.invoke(enumClass, tv);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
