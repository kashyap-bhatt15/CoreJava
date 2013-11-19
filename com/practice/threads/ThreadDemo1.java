package com.practice.threads;

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Program statrted----");
		long start = System.currentTimeMillis();
		
		MyThread myThread = new MyThread("MyThread1");
		System.out.println("MyThread is Alive " + myThread.isAlive());
		myThread.start();		
		System.out.println("MyThread is Alive " + myThread.isAlive());
		//myThread.run();
		
		MyThread2 myThread2 = new MyThread2();
		Thread thread = new Thread(myThread2,"MyThread22");
		thread.start();
		
		// Thread.currentThread().setName("ThreadDemo1");
		
		for(int i = 0; i < 10; i++) {
			System.out.println("i = " + i + " , " + Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
			// name, priority, group of thread.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
		
		try {
			myThread.join();
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("MyThread is Alive " + myThread.isAlive());
		long end = System.currentTimeMillis();
		System.out.println(" Program ended in " + (end - start) + " milliseconds.");
		Thread.currentThread().setName("MyThread");
	}
}