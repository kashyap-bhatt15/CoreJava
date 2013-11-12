package com.practice.basic;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		int firstCompare = o1.getFirstName().compareTo(o2.getFirstName()); 
		if(firstCompare > 0)
			return 1;
		else if(firstCompare < 0)
			return -1;
		else
			return o1.getLastName().compareTo(o2.getLastName());
	}
}
