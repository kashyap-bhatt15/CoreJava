package com.practice.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathDemo2 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * Check this code for files mentioned here if exceptions occur.
		 */
		
		Path src = Paths.get("src/fileToRead.txt");
		Path dest = Paths.get("src/fileCopiedWithPATH.txt");
		
		Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
		System.out.println("Files Copied");
		
		Path newDir = Paths.get("Files");
		Files.createDirectories(newDir);
		System.out.println("New Directory Created.");
		
		Path newName = Paths.get("renamedFileToRead.txt");
		
		Files.move(src, newDir.resolve(newName), StandardCopyOption.REPLACE_EXISTING);
		System.out.println("File  copied to New Directory");
		
		
		
		// Check 
		Path fileToDeletePath = Paths.get("Files/renamedFileToRead.txt");
		Files.delete(fileToDeletePath);
		
		
		
		
	}

}
