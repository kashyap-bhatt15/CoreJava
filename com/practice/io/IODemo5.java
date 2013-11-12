package com.practice.io;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class IODemo5 {

	public static void main(String[] args) {
		try(
				FileWriter fw = new FileWriter("src/WriteToFile.txt", true);
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			){
				char c = ' ';
				System.out.println("Enter char @ to save and close file....");
				c = (char) br.read();
				while(c != '@') {
					//fw.append(c);
					fw.write(c);
					c = (char) br.read();
				}
			} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
