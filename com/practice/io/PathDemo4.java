package com.practice.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class PathDemo4 {

	public static void main(String[] args) {
		Path path = Paths.get("src/nio.txt");
		
		Scanner scanner = new Scanner(System.in);
		String line = null;
		Charset cs = Charset.forName("US-ASCII");
		BufferedWriter br = null; 
		try {
			br = Files.newBufferedWriter(path, cs);
			line = scanner.nextLine();
			while(line.length() > 0) {
				br.newLine();
				br.append(line);
				line = scanner.nextLine();
			}
			br.close();
		} catch(IOException e) {
			e.printStackTrace();
		}	
		scanner.close();
	}

}
