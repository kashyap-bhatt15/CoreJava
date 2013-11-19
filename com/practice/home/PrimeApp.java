package com.practice.home;

public class PrimeApp {

	public static void main(String[] args) {
		Prime prime = new Prime(2);
		System.out.println(prime.isPrime());
		
		prime.setNumber(4);
		System.out.println(prime.isPrime());
		
		prime.setNumber(5);
		System.out.println(prime.isPrime());
		
		prime.setNumber(6);
		System.out.println(prime.isPrime());
		
		prime.setNumber(7);
		System.out.println(prime.isPrime());
		
		prime.setNumber(9);
		System.out.println(prime.isPrime());
		
		prime.setNumber(89);
		System.out.println(prime.isPrimeAgain());
		
		prime.setNumber(95);
		System.out.println(prime.isPrimeAgain());
		
		prime.setNumber(2);
		System.out.println(prime.isPrimeAgain());
	}

}
