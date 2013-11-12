package com.practice.basic;

import java.util.Scanner;

public class ControlStatements {
	/*
	 * Write a program to calculate the commission of a salesman.
	 * The commission is 10% of sales amount if sales amount is
	 * greater than 20K. 5% if sales amount is < 20000.
	 * Display a commission when sales amount is inputed via keyboard.
	 */
	/*
	 * Write a program to calculate the conveyance allowance give to an employee.
	 * For permanent employees the conveyance allowance is 20% of sales made if 
	 * the sales amount is greater than 20000 else 15% of sales made. For temporary 
	 * employees the conveyance allowance is 10% of sales made disregard of sales amount.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		float salesAmount = 0.0f;
		String employeeType = "p";

		float commission = 0.0f;
		float conveyanceAllowance = 0.0f;
		
		System.out.print("Enter Sales Amount:");
		salesAmount = scanner.nextFloat();
		
		System.out.print("Enter employee type: p for permanent & t for temporary");
		employeeType = scanner.next();
		
		commission = calculateCommission(salesAmount);
		System.out.println("Commision is " + commission);
		
		conveyanceAllowance = calculateConveyance(salesAmount, employeeType);
		System.out.println("Conveyance Allowance is " + conveyanceAllowance);
		
		
		scanner.close();
	}

	/*
	 * Write a program to calculate the conveyance allowance give to an employee.
	 * For permanent employees the conveyance allowance is 20% of sales made if 
	 * the sales amount is greater than 20000 else 15% of sales made. For temporary 
	 * employees the conveyance allowance is 10% of sales made disregard of sales amount.
	 */
	private static float calculateConveyance(float salesAmount,
			String employeeType) {
		// Can be computed using logical operator &
		if(employeeType.equals("p")) {
			if(salesAmount >= 20000) {
				return (0.20f * salesAmount);
			}
			else {
				return (0.15f * salesAmount);
			}
		}
		else {
				return ((float) 0.10 * salesAmount);
		}
	}

	/*
	 * Write a program to calculate the commission of a salesman.
	 * The commission is 10% of sales amount if sales amount is
	 * greater than 20K. 5% if sales amount is < 20000.
	 * Display a commission when sales amount is inputed via keyboard.
	 */
	private static float calculateCommission(float salesAmount) {
		if(salesAmount >= 20000) {
			return(0.10f * salesAmount);
		}
		else {
			return(0.05f * salesAmount);
		}
	}

}
