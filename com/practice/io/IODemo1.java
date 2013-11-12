package com.practice.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo1 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i = 0;
		char c = ' ';
		float f = 0.0f;
		BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
	
		System.out.print("Enter one Integer: ");
		i = Integer.parseInt(bufferReader.readLine());
		System.out.print("Enter one Character: ");
		c = (char) bufferReader.read();
		
		System.out.print("Enter one Float Number: ");
		// Will throw an error if pressed enter after entering character because of read() in previous
		// line instead of readLine()
		f = Float.parseFloat(bufferReader.readLine());
		
		System.out.println(i);
		System.out.println(c);
		System.out.println(f);
		

	}

}
