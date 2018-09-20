package com.suresh.patterns.singleton;

public class Test {

	public static void main(String[] args) {
		// DateUtil dateUtil = new DateUtil();
		DateUtil du1 = DateUtil.getInstance();
		
		
		DateUtil du2 = DateUtil.getInstance();
		System.out.println(du1 == du2);
	}

}

// Lazy initialization

//Eager Initialization will be helpful if you are pretty sure that your DateUtil will be used at least once in your application.