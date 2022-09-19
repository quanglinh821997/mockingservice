package com.microtech.common.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;
import java.util.Map;
import java.util.Objects;

public class DataUtils {
	private static final Logger logger = LoggerFactory.getLogger(DataUtils.class);

	public static boolean notNullOrEmpty(String text) {
		return !nullOrEmpty(text);
	}

	public static boolean nullOrEmpty(CharSequence cs) {
		int strLen;
		if (cs == null || (strLen = cs.length()) == 0) {
			return true;
		}
		for (var i = 0; i < strLen; i++) {
			if (!Character.isWhitespace(cs.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	public static boolean notNullOrEmpty(Collection collection) {
		return !nullOrEmpty(collection);
	}

	public static boolean nullOrEmpty(Collection objects) {
		return objects == null || objects.isEmpty();
	}


	public static boolean nullOrEmpty(Map<?, ?> map) {
		return map == null || map.isEmpty();
	}

	public static boolean notNullOrEmpty(Map<?, ?> map) {
		return !nullOrEmpty(map);
	}

	public static boolean notNull(Object object) {
		return !nullObject(object);
	}

	public static boolean nullObject(Object object) {
		return object == null;
	}

	public static String parseToString(Object value) {
		return parseToString(value, "");
	}

	public static String parseToString(Object value, String defaultVal) {
		try {
			if (Objects.isNull(value)) throw new NullPointerException();
			return String.valueOf(value);
		} catch (Exception e) {
			return defaultVal;
		}
	}

	public static Double parseToDouble(Object value, Double defaultVal) {
		try {
			String str = parseToString(value);
			if (nullOrEmpty(str)) {
				return null;
			}
			return Double.parseDouble(str);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return defaultVal;
		}
	}


	public static Long parseToLong(Object value, Long defaultVal) {
		try {
			String str = parseToString(value);
			if (nullOrEmpty(str)) {
				return null;
			}
			return Long.parseLong(str);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return defaultVal;
		}
	}

	public static boolean isNullOrEmpty(final Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}


	public static boolean isNull(Long value) {
		return (value == null);
	}

	public static boolean isNull(Object value) {
		return (value == null);
	}

	public static boolean isNullOrEmpty(CharSequence cs) {
		return nullOrEmpty(cs);
	}

}
