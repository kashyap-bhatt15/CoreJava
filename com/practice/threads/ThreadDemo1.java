package com.practice.threads;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Program statrted----");
		long start = System.currentTimeMillis();
		
		MyThread myThread = new MyThread();
		myThread.start();		
		myThread.run();
		
		Thread.currentThread().setName("ThreadDemo1");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i + " , " + Thread.currentThread());
			// name, priority, group of thread.
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		long end = System.currentTimeMillis();
		System.out.println(" Program ended in " + (end - start) + " milliseconds.");
		Thread.currentThread().setName("MyThread");
	}
}