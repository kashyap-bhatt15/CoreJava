package com.practice.basic;

import java.util.Scanner;

public class ClassStructureExample {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int num1 = 10;
		int num2 = 20;
		int ans = 0;
		
		ans = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
		System.out.println(num1 + " + " + num2 + " = " + num1 + num2);
		System.out.println(num1 + " + " + num2 + " = " + ans);
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter 1st number:");
		num1 = scanner.nextInt();
		System.out.print("Enter 2nd number:");
		num2 = scanner.nextInt();
		ans = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + ans);

		scanner.close();
	}

}
