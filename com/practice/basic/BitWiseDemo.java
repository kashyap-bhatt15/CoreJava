package com.practice.basic;

public class BitWiseDemo {
	
	
	public static void main(String[] args) {
		int a = 0b11001110;
		int b = 0b011;
		int c = 0b001;
		
		System.out.println(a >>> 3);
		System.out.println(b >>> 1);
		System.out.println(c >>> 1);
	}

}
