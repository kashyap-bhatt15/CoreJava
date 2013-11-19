package com.practice.threads;

public class MyThread3App {

	public static void main(String[] args) {
		MyThread3 myThread3 = new MyThread3();
		Thread t1 = new Thread(myThread3,"Report");
		
		Thread t2 = new Thread(new MyThread3(), "Maintenance");
		
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program ended.....");
	}

}
