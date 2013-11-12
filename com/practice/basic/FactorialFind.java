package com.practice.basic;

import java.util.Scanner;

public class FactorialFind {

	public static void main(String[] args) {
		int number;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please enter number to find Factorial");
		number = scanner.nextInt();
		
		int factorial = 1;
		for(int i = number; i >= 1; i--) {
			factorial = factorial * i;
		}
		System.out.println(factorial);
		
		scanner.close();

	}

}
