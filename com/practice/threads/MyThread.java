package com.practice.threads;

public class MyThread extends Thread {

	@Override
	public void run() {
		for(int j = 0; j < 10; j++) {
			// System.out.println("Current Thread Name: " + Thread.currentThread().getName());
			System.out.println("j = " + j + " , " + Thread.currentThread().getName());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}