package com.practice.basic;

import java.util.Scanner;

public class MethodsExample {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		
		printAddition();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number 1");
		a = scanner.nextInt();
		System.out.println("Enter number 2");
		b = scanner.nextInt();
		
		printAddition(a , b);
		
		System.out.println("Enter number 3");
		printAddition(a, b, scanner.nextInt());
		
		printAddition(10, 10.0f);
		
		scanner.close();
	}

	static void printAddition() {
		System.out.println("Sum of 10 and 20 is "+ (10+20));
	}
	
	static void printAddition(int a, int b) {
		System.out.println("Sum is " + (a+b));
	}
	
	static void printAddition(int a, int b, int c) {
		System.out.println("Sum of three numbers is "+ (a + b + c));
	}
	
	static void printAddition(int a, float b) {
		System.out.println("Sum of integer and float is " + (a+b));
	}
	
	/*
	 * Method overloading has nothing to do with return type
	 * Method with same name, parameters but different return type will not be overloaded.
	static int printAddition(int a, int b) {
		return a + b;
	}
	*/

}
