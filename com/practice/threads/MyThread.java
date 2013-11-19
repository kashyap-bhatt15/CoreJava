package com.practice.threads;

public class MyThread extends Thread {

	public MyThread(String string) {
		super(string);
	}

	@Override
	public void run() {
		for(int j = 19; j < 29; j++) {
			// System.out.println("Current Thread Name: " + Thread.currentThread().getName());
			System.out.println("j = " + j + " , " + Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
}