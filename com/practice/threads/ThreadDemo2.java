package com.practice.threads;

public class ThreadDemo2 {

	public static void main(String[] args) {
		MyThread2 myThread2 = new MyThread2();
		// myThread2.start();
		// myThread2.run();
		Thread thread = new Thread(myThread2);
		thread.start();
		
	}

}
