package com.practice.io;

public class Customer implements Cloneable {
	private String name;
	private int age;
	
	
	public Customer() {
		super();
	}
	
	public Customer(String name, int age) {
		super();
		this.name = name;
		this.age = age;
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
	
	@Override
	public String toString() {
		return getName() + " "+ getAge();
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
