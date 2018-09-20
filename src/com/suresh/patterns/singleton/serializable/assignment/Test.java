package com.suresh.patterns.singleton.serializable.assignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Logger logger = Logger.getInstance();
		logger.log("It should be printed..!");

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File(
				"C:\\JS\\SOAPPractice\\corepatterns\\src\\com\\suresh\\patterns\\singleton\\singleton_serial\\logger.ser")));
		oos.writeObject(logger);

		Logger logger2;

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File(
				"C:\\JS\\SOAPPractice\\corepatterns\\src\\com\\suresh\\patterns\\singleton\\singleton_serial\\logger.ser")));
		
		logger2 = (Logger) ois.readObject();
		
		System.out.println(logger == logger2);
		
		
		try {
			Logger logger3 = (Logger) logger.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("You cannot clone. As it is singleTon class.");
		}
		
		oos.close();
		ois.close();
		
	}
}
