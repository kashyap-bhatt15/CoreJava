package com.practice.threads;

public class MyPrinter {
	synchronized public void print(String msg) {
		System.out.print("[" + msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("] " + Thread.currentThread().getName());
	}
}
