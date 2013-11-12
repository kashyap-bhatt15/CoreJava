package com.practice.basic;

public class StringBufferBuiderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb = new StringBuilder("RANDOM TEZT");
		sb.append(" South");
		System.out.println(sb);
		System.out.println("Capacity of sb = " + sb.capacity() + " characters");
	}

}
