package com.practice.basic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

@SuppressWarnings({ "unused", "resource" })
public class ExceptionDemo1 {

	public static void main(String[] args) {
		System.out.println("Program Started.");
		
		try {
			FileInputStream file = new FileInputStream("apple.txt");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

		
		try {
			test();
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program ended.");
		

	}

	static Scanner test() {
		Scanner scanner = new Scanner(System.in);
		String no1;
		String no2;
		System.out.println("Enter No 1. ");
		no1 = scanner.nextLine();
		System.out.println("Enter No 2.");
		no2 = scanner.nextLine();
		
		int ans = 0;
		
		try {
			ans = Integer.parseInt(no1) / Integer.parseInt(no2);
			
			System.out.println("no1 / no2  = " + ans );
		} catch(ArithmeticException e) {
			System.out.println(e);
		} finally {
			System.out.println("Inside finally");
		}
		return scanner;
	}

}
