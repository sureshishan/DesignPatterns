package com.suresh.patterns.singleton.serializable;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		DateUtil du1 = DateUtil.getInstance();

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(
				"C:\\JS\\SOAPPractice\\corepatterns\\src\\com\\suresh\\patterns\\singleton\\singleton_serial\\dateUtil.ser")));

		oos.writeObject(du1);
		DateUtil du2;

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(
				"C:\\JS\\SOAPPractice\\corepatterns\\src\\com\\suresh\\patterns\\singleton\\singleton_serial\\dateUtil.ser")));
		du2 = (DateUtil) ois.readObject();
		
		System.out.println(du1 == du2);
	}

}
