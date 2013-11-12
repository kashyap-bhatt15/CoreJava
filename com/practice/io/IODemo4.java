package com.practice.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo4 {

	public static void main(String[] args) {
		try(
				FileOutputStream fos = new FileOutputStream("src/WriteToFile.txt");
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			){	
			char c = ' ';
			System.out.println("Enter char @ to save and close file....");
			c = (char) br.read();
			while(c != '@') {
				fos.write(c);
				c = (char) br.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
