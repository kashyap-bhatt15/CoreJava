package com.practice.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class EmployeeDeserialize {

	public static void main(String[] args) {
		List<?> list = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream("emp.ser");
			ois = new ObjectInputStream(fis);
			list = (List<?>) ois.readObject();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		System.out.println(list);
		System.out.println("============================");
		Employee e = null;
		for (Object employee : list) {
			e = (Employee) employee;
			System.out.println(e);
		}
	}

}
