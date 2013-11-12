package com.practice.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IODemo6 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		FileInputStream fis2 = null;
		FileOutputStream fos2 = null;
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			fis = new FileInputStream("src/fileToRead.txt");
			fis2= new FileInputStream("src/dog_house_grill.JPG");
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream("src/fileToRead_copy.txt");
			fos2 = new FileOutputStream("src/dog_house_grill_copy.JPG");
			
			bos = new BufferedOutputStream(fos);
			
			int c = 0;
			while((c = fis.read()) != -1)
				fos.write(c);
				
			System.out.println("TEXT File Copied");
			
			int c2 = 0;
			while((c2 = bis.read()) != -1)
				bos.write(c2);
			System.out.println("Image File Copied");
			
			fis.close();
			fos.close();
			fis2.close();
			fos2.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
