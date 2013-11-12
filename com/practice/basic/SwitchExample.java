package com.practice.basic;

import java.util.Scanner;

/*
 * Write a program to display the name of the day using
 * switch statement when a number from 1 to 7 is inputed. 
 */
public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int no = 0;

		System.out.print("Enter Number from 1 to 7:");
		no = scanner.nextInt();
		String stringDay = "";
		
		switch(no) {
		case 1:
			stringDay = "Monday";
			break;
		case 2:
			stringDay = "Tuesday";
			break;
		case 3:
			stringDay = "Wednesday";
			break;
		case 4:
			stringDay = "Thursday";
			break;
		case 5:
			stringDay = "Friday";
			break;
		case 6:
			stringDay = "Saturday";
			break;
		case 7:
			stringDay = "Sunday";
			break;
		default:
			System.out.println("Incorret number");
		}
		
		if(stringDay != "") {
			System.out.println("Day is "+ stringDay);
		}
		
		scanner.close();

	}

}
