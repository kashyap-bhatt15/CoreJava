package com.practice.basic;

public class BalanceNotEnoughException extends Exception {

	private static final long serialVersionUID = 1L;
	private static final String message = "Balance Not Enough Exception Occured.. Balance can't be less than 0.";
	
	public BalanceNotEnoughException() {
	}
	
	@Override
	public String toString() {
		return message;
	}


}
