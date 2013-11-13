package com.practice.io;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathDemo1 {

	public static void main(String[] args) {
		Path path = Paths.get("src/fileToRead.txt");
		System.out.println(path);
		System.out.println(path.getFileName());
		System.out.println(path.getNameCount());
		System.out.println(path.getName(0));
		
		Path realPath = null;
		try {
			realPath = path.toRealPath(LinkOption.NOFOLLOW_LINKS);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(realPath);
	}
}