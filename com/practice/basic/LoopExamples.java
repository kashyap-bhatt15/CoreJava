package com.practice.basic;

import java.util.Scanner;

public class LoopExamples {

	public static void main(String[] args) {
		int counter;
		System.out.println("== For Loop ==");
		for(counter = 1; counter <= 5; counter++) {
			System.out.println("Counter is " + counter);
		}
		
		System.out.println("== While Loop ==");
		while(counter < 10) {
			counter++;
			System.out.println("Counter is " + counter);
		}
		
		System.out.println("== Do while Loop ==");
		do {
			System.out.println("Counter is " + counter);
			counter--;
		}while(counter > 5);
		
		System.out.println("== For Each Loop also exists. ==");
		
		writeTables();
	}

	private static void writeTables() {
		int counter;
		Scanner scanner = new Scanner(System.in);
		int num;
		System.out.println("Enter a number");
		num = scanner.nextInt();
		for(counter=1;counter<=10;counter++) {
			System.out.println(num + " * " + counter + " = " + (num*counter));	
		}
		scanner.close();
	}
}
