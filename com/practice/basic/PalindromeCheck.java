package com.practice.basic;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {
		int number = 0;
		int reverseNumber = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check for palindrome");
		number = scanner.nextInt();
		reverseNumber = getReverseNumber(number);
		if(number == reverseNumber) {
			System.out.println("Palindorme number");
		}
		else
			System.out.println("Not a palindrome");
		scanner.close();
	}

	private static int getReverseNumber(int number) {
		int divison;
		divison = number;
		int reverseNumber = 0;
		
		while(divison > 0) {
			reverseNumber = reverseNumber * 10;
			reverseNumber = reverseNumber + (divison%10);
			divison = divison / 10;
			//System.out.println(reverseNumber);
		}
		return reverseNumber;
	}
}
