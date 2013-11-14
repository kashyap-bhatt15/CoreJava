package com.practice.io;

public class CustomerApp {

	public static void main(String[] args) throws CloneNotSupportedException {
		Customer john = new Customer("John Doe", 25);
		Customer jane = john;
		
		System.out.println(john);
		System.out.println(jane);
		System.out.println("=====================================");
		
		jane.setName("Jane Doe");
		jane.setAge(12);
		System.out.println(jane);
		System.out.println(john);
		
		System.out.println("=====================================");
		Customer jane1 = new Customer();
		jane1 = jane;
		System.out.println(jane);
		System.out.println(jane1);
		
		jane1.setName("TTTTT");
		System.out.println("=====================================");
		System.out.println(jane);
		System.out.println(jane1);
		
		john.setName("John Doe");
		Customer jane2 = (Customer) john.clone();
		jane2.setName("Jane Doe");
		System.out.println("=====================================");
		System.out.println(john);
		System.out.println(jane2);
		
	}

}
