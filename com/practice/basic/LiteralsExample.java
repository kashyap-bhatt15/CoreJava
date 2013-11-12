package com.practice.basic;

public class LiteralsExample {

	public static void main(String[] args) {

		/*
		 * .class literals
		 */
		System.out.println(String.class);
		System.out.println(Integer.class);
		
		System.out.println(LiteralsExample.class);
		@SuppressWarnings("unused")
		Class<String> s = String.class;
		
		/*
		 * In Java SE 7 and later, any number of underscore characters (_) can appear anywhere between digits in a numerical literal. 
		 */
		System.out.println(1234_5678_9012_3456L);
		System.out.println(999_99_9999L);
		System.out.println(3.14_15F);
		System.out.println(0xFF_EC_DE_5E);
		System.out.println(0xCAFE_BABE);
		System.out.println(0x7fff_ffff_ffff_ffffL);
		byte nybbles = 0b0010_0101;
		System.out.println(nybbles);
		long bytes = 0b11010010_01101001_10010100_10010010;
		System.out.println(bytes);
	}

}
