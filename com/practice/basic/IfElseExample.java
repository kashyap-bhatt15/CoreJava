package com.practice.basic;

import java.util.Scanner;

/*
 * Input marks for 3 subject for a student. Display total and average marks.
 * Display grades as follows.
 * Average marks >=70 >=60 >=50 >=35 <35
 * Grade          A    B    C    D    F
 */
public class IfElseExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float marks1 = 0.0f;
		float marks2 = 0.0f;
		float marks3 = 0.0f;
		
		float average = 0.0f;
		// float total = 0.0f;
		
		String grade = "";
		
		System.out.print("Enter Marks1:");
		marks1 = scanner.nextFloat();
		
		System.out.print("Enter Marks2:");
		marks2 = scanner.nextFloat();
		
		System.out.print("Enter Marks3:");
		marks3 = scanner.nextFloat();
		
		System.out.println("Total is "+ (marks1 + marks2 + marks3));
		
		average = (marks1 + marks2 + marks3)/3;
		System.out.println("Average is "+ average);
		
		grade = calculateGrade(average);
		 
		System.out.println("Grade is " + grade);
		
		scanner.close();

	}

	private static String calculateGrade(float average) {
		String grade;
		if(average >= 70.0f) {
			grade = "A";
		}
		else if ((average <=70.0f) && (average >= 60.0f)) {
			grade = "B";
		}
		else if ((average <=60.0f) && (average >= 50.0f)) {
			grade = "C";
		}
		else if ((average <=50.0f) && (average >= 35.0f)) {
			grade = "D";
		}
		else {
			grade = "F";
		}
		return grade;
	}

}
