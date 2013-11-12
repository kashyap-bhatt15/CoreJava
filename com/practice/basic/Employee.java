package com.practice.basic;


// Comparator operator for comparing two fields.
// Comparable operator for comparing only one field.
public class Employee implements Comparable<Employee> {
	private int empId;
	private String firstName;
	private String lastName;
	private int age;
	
	public Employee() {
		super();
	}

	public Employee(int empId, String firstName, String lastName, int age) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}

	int getEmpId() {
		return empId;
	}
	
	void setEmpId(int empId) {
		this.empId = empId;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	int getAge() {
		return age;
	}
	
	void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getEmpId() + ", "+ getFirstName() + ", "+ getLastName() + ", "+ getAge(); 
	}

	@Override
	public int compareTo(Employee o) {
		if(this.age > o.age)
			return 1;
		else if(this.age < o.age) 
			return -1;
		else
			return this.age - o.age;
	}

	public int compare(Employee o1, Employee o2) {	
		int firstCompare = o1.firstName.compareTo(o2.firstName); 
		if(firstCompare > 0)
			return 1;
		else if(firstCompare < 0)
			return -1;
		else
			return o1.lastName.compareTo(o2.lastName);	
	}
}
