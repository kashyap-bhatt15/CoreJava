package com.practice.basic;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeDemo {

	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		Employee john = new Employee(1, "John", "B", 29);
		Employee jane = new Employee(2, "John", "A", 52);
		Employee kanye = new Employee(3, "Kanye", "C", 42);
		Employee neil = new Employee(5, "Neil", "D", 18);
		Employee ann = new Employee(4, "Ann", "D", 26);
		employees.add(john);
		employees.add(jane);
		employees.add(kanye);
		employees.add(neil);
		employees.add(ann);
		
		System.out.println(employees);
		System.out.println("============= After sort comparable ===============================");		
		Collections.sort(employees);
		System.out.println(employees);
		System.out.println("============= After sort comparators ===============================");		
		
		Collections.sort(employees, new EmployeeComparator());
		System.out.println(employees);
	}

}
