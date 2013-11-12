package com.practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo3 {

	public static void main(String[] args) {
		int c;
		
		try(
				FileInputStream fileInputStream = new FileInputStream("src/fileToRead.txt");
			) {
			while((c = fileInputStream.read()) != -1) {
				System.out.print((char) c);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
