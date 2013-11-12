package com.practice.io;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class IODemo8 {
	public static void main(String[] args) throws IOException {
		File f1 = new File("src/fileToRead.txt");
		File f2 = new File("src/fileToRead_copy_ApacheIO");
		
		FileUtils.copyFile(f1,f2);
		System.out.println("File Copied");
	}

}
