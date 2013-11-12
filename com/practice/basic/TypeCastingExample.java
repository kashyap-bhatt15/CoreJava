package com.practice.basic;

public class TypeCastingExample {

	public static void main(String[] args) {
		byte b = 10;
		short s = 150;
		int i = 25;
		float f = 3.5f;
		long l = 0;
		
		// Error in following casting
		// b = s; 
		// Very Important
		b = (byte) s;
		System.out.println(b);
		
		f = i;
		System.out.println(f);

		// Error in following casting
		// i = f;
		
		System.out.println(i);
		
		// Error in following casting
		// l = f;
		System.out.println(l);		
	}

}
