package com.practice.threads;

public class TestPrinter {

	public static void main(String[] args) {
		MyPrinter target = new MyPrinter();
		PrintCaller obj1 = new PrintCaller(target, "Hello obj1");
		PrintCaller obj2 = new PrintCaller(target, "Synchronized by oject2");
		PrintCaller obj3 = new PrintCaller(target, "Hello obj2");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Program Ended.");

	}

}
