package com.practice.basic;

public class OddNumberException extends RuntimeException {

	private static final long serialVersionUID = 7628856112038986963L;
	private static final String message = "Odd Number Exception occured... Even Number Excepted.";
	
	public OddNumberException() {
		
	}
	
	@Override
	public String toString() {
		return message;
	}

}
