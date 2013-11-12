package com.practice.basic;

public class ExceptionDemo3 {
	double balance = 0.0;
	public static void main(String[] args) {
		ExceptionDemo3 account = new ExceptionDemo3();
		System.out.println("Deposit : 100$ ");
		System.out.println("Balance : " + account.deposit(100));
		
		System.out.println("Deposit : 200$ ");
		System.out.println("Balance : " + account.deposit(200));
		
		System.out.println("Withdraw: 400$ ");
		try {
			System.out.println("Balance : " + account.withdraw(400));
		} catch (BalanceNotEnoughException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Withdraw : 300$ ");
		try {
			System.out.println("Balance : " + account.withdraw(300));
		} catch (BalanceNotEnoughException e) {
			e.printStackTrace();
		}		
	}
	
	double withdraw(double amount) throws BalanceNotEnoughException {
			if(amount > balance)
				throw new BalanceNotEnoughException();
			else
				balance -= amount;
		return balance;
	}
	
	double deposit(double amount) {
		balance += amount;
		return balance;
	}

}
