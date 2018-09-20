package com.suresh.patterns.singleton;

public class DateUtil {

	private static volatile DateUtil instance = new DateUtil();

	private DateUtil() {

	}

	public static DateUtil getInstance() {
		if (instance == null) {
			synchronized (DateUtil.class) {
				if (instance == null) {
					instance = new DateUtil();
				}
			}
		}
		return instance;
	}
}

// This cannot be used in static context
