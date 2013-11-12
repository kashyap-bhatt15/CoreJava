package com.practice.basic;

public class FibonacciPrint {

	public static void main(String[] args) {
		int i = 0;
		int j = 1;
		int count = 0;
		int temp = 0;
		System.out.println(i);
		count++;
		
		while(count < 10) {
			System.out.println(j);
			temp = i;
			i = j;
			j = temp + j;
			count++;
		}
	}

}
