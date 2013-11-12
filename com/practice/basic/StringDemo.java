package com.practice.basic;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = new String("Apple");
		
		String s2 = "Google";
		
		s2 = "Googly";
		
		System.out.println(s2);
		
		System.out.println(s1.length());
		System.out.println(s1 + " Orange");
		//s1 = s1 + " Orange";
		
		System.out.println(s1.length());

		String s3 = "Apple";
		String s4 = "Apple";
		
		String s5 = new String("Apple");
		
		if(s3 == s4)
			System.out.println("Equal s3 & s4");
		else
			System.out.println("Not Equal s3 & s4");
		
		if(s3 == s5)
			System.out.println("Equal s3 & s5");
		else
			System.out.println("Not Equal s3 & s5");
		
		
		String s6 = new String("APPLE");
		if(s5.equals(s6))
			System.out.println("s5 & s6: Equal");
		else
			System.out.println("s5 & s6: Not Equal");
		
		if(s5.equalsIgnoreCase(s6))
			System.out.println("s5 & s6 Ignore Case: Equal");
		else
			System.out.println("s5 & s6 Ignore Case: Not Equal");
		
		
		System.out.println("Length of s6: " + s6.length());
		System.out.println("Char at 2: " + s6.charAt(1));
		String s7 = s5.concat(s6);
		
		System.out.println("s5 + s6" + s7);
		
		char c1[] = {'a','b','c'};
		
		String s8 = String.copyValueOf(c1);
		System.out.println("copy of c1" + s8);
		
		String s9 = "  K B   ";
		System.out.println(s9.trim());
		
		int i1 = s7.indexOf('a');
		System.out.println(i1);
		
		Double d = 123.00;		
		System.out.println(String.valueOf(d));

				
	}

}
