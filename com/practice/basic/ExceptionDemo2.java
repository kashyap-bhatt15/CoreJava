package com.practice.basic;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {
		System.out.println("Program Started");
		try {
			test();
		} catch(OddNumberException e) {
			e.printStackTrace();
		}
		System.out.println("Program Ended");
	}
	
	@SuppressWarnings("resource")
	static void test() {
		Scanner scanner = new Scanner(System.in);
		int no = 0;
		System.out.println("Enter even no: ");
		no = scanner.nextInt();
		System.out.println("No = " + no); 
		if(no % 2 != 0)
			throw new OddNumberException();
		scanner.close();
	}

}
