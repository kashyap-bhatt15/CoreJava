package com.practice.OOP;

public class Person {
	private String name;
	private String address;
	private String email;
	protected String phone;
	

	/**
	 * Default constructor
	 */
	public Person() {
		// TODO
	}

	public Person(String name, String address, String email, String phone) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
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
	 * @return the address
	 */
	String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the email
	 */
	String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the phone
	 */
	String getPhone() {
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "Name: " + getName() + " Email: " + getEmail() + " Phone: " + getPhone() + " Address: " + getAddress();
	}

}
