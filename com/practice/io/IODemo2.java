package com.practice.io;

import java.io.FileInputStream;
import java.io.IOException;

public class IODemo2 {

	public static void main(String[] args) {
		int c;
		FileInputStream fileInputStream = null;
		try {
			// FileInputStream fileInputStream = new FileInputStream("/Users/kashyapbhatt/Documents/codes/java/core-practice/src/fileToRead.txt");
			fileInputStream = new FileInputStream("src/fileToRead.txt");
			while((c = fileInputStream.read()) != -1) {
				System.out.print((char) c);
			}
				
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(fileInputStream != null)
					fileInputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
