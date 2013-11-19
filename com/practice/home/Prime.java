package com.practice.home;

import java.util.ArrayList;

public class Prime {
	private int number;
	private ArrayList<Integer> primes = new ArrayList<>();
	private int range;
	
	public Prime() {
		super();
	}

	public Prime(ArrayList<Integer> primes) {
		super();
		this.primes = primes;
	}

	public Prime(int number) {
		super();
		this.number = number;
	}

	int getNumber() {
		return number;
	}

	void setNumber(int number) {
		this.number = number;
	}

	ArrayList<Integer> getPrimes() {
		return primes;
	}

	void setPrimes(ArrayList<Integer> primes) {
		this.primes = primes;
	}
	
	public int getRange() {
		return range;
	}

	public void setRange(int range) {
		this.range = range;
	}
	
	public boolean isPrime() {
		boolean isPrime = true;
		if (this.number == 1)
			isPrime = false;
		else {
			for(int i = 2; i < this.number; i++) {
				if(this.number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		return isPrime;
	}
	
	public boolean isPrimeAgain() {
		boolean isPrime = true;
		if(number == 1)
			isPrime = false;
		else if(number % 2 == 0 && number != 2)
			isPrime = false;
		else {
			for(int i = 3; i < number; i+=2) {
				if(number % i == 0) {
					isPrime = false;
					break;
				}
			}
		}
		
		return isPrime;
	}
}
