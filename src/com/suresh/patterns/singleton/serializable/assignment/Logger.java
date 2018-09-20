package com.suresh.patterns.singleton.serializable.assignment;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private volatile static Logger logger;

	private Logger() {

	}

	public static Logger getInstance() {
		if (logger == null) {
			synchronized (Logger.class) {
				if (logger == null) {
					logger = new Logger();
				}
			}
		}
		return logger;
	}

	public void log(String message) {
		System.out.println(message);
	}

	protected Object readResolve() {
		return logger;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
}
