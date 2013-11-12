package com.practice.io;

import java.io.File;
import java.io.IOException;

public class IODemo7 {

	public static void main(String[] args) throws IOException {
		File file1 = new File("src/fileToRead.txt");
		File directory = new File("/Users/kashyapbhatt/Documents/codes/angular-practice");
		
		System.out.println(directory.isDirectory());
		System.out.println(file1.isFile());
		
		String [] list = null;
		if(directory.isDirectory()) {
			list = directory.list();
			
			for (String s : list) {
				
				File file2 = new File(directory + "/" + s);
				if(file2.isDirectory())
					System.out.print(s + " : Directory");
				else
					System.out.print(" File");
				System.out.println();
			}
		}
		
		File f2 = new File("/Users/kashyapbhatt/Documents/codes/angular-practice");
		OnlyExt onlyExt = new OnlyExt("html");
		String []list2 = f2.list(onlyExt);
		System.out.println("-----------------");
		for (String s : list2) {
			System.out.println(s);
		}
		
		System.out.println("== Absolute Path: " + file1.getAbsolutePath());
		System.out.println("File Name: " + file1.getName());
		System.out.println("Parent: " + file1.getParent());
		
		File f3 = new File("src/file1.txt");
		f3.createNewFile();
		f3.renameTo(new File("src/file1112.txt"));
		f3.deleteOnExit();
		

	}

}
