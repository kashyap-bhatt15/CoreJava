package com.practice.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmployeeSerialize {

	public static void main(String[] args) throws IOException {
		Employee e1 = new Employee(111,"John Doe", 25, EmployeeDepartment.SALES, new Date());
		Employee e2 = new Employee(112, "Jonathan", 32, EmployeeDepartment.PURCHASE, new Date());
		Employee e3 = new Employee(113, "Tom Brady", 44, EmployeeDepartment.IT, new Date());
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream("emp.ser");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			/*oos.close();
			fos.close();*/
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			oos.close();
			fos.close();
		}
		
		System.out.println("Employee Serialized");
		
		/*System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		*/
	}

}
