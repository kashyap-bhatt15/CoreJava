package com.practice.OOP;

public class Employee extends Person {
	private int empId;
	private float salary;
	private String department;
	
	public Employee () {
		super();
	}
	public Employee(int empId, float salary, String department) {
		super();
		this.empId = empId;
		this.salary = salary;
		this.department = department;
	}
	
	public Employee(String name, String address, String email,
			String phone, int empId, float salary, String department) {
		super(name, address, email, phone);
		this.empId = empId;
		this.salary = salary;
		this.department = department;
	}

	/**
	 * @return the empId
	 */
	int getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	void setEmpId(int empId) {
		this.empId = empId;
	}
	/**
	 * @return the salary
	 */
	float getSalary() {
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	void setSalary(float salary) {
		this.salary = salary;
	}
	/**
	 * @return the department
	 */
	String getDepartment() {
		return department;
	}
	/**
	 * @param department the department to set
	 */
	void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nEmployee Id: "+ getEmpId() + " Salary: "+ getSalary() + " Department: " +  getDepartment());
	}
}
