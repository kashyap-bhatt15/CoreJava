package com.practice.io;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
	
	private static final long serialVersionUID = 2L;
	private int empId;
	private transient String name;
	private int age;
	private EmployeeDepartment dept;
	private Date hireDate;
	private String address;
	
	public Employee() {
		super();
	}
	
	public Employee(int empId, String name, int age, EmployeeDepartment dept, Date hireDate) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.hireDate = hireDate;
	}
	
	
	public Employee(int empId, String name, int age, EmployeeDepartment dept,
			Date hireDate, String address) {
		super();
		this.empId = empId;
		this.name = name;
		this.age = age;
		this.dept = dept;
		this.hireDate = hireDate;
		this.address = address;
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
	 * @return the name
	 */
	String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the dept
	 */
	EmployeeDepartment getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	void setDept(EmployeeDepartment dept) {
		this.dept = dept;
	}
	/**
	 * @return the hireDate
	 */
	Date getHireDate() {
		return hireDate;
	}
	/**
	 * @param hireDate the hireDate to set
	 */
	void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return getEmpId() + " " + getName() + " " +  getAge() + " " + getDept() + " " + getHireDate();
	}
}
