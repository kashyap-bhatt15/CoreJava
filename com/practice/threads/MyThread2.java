package com.practice.threads;

public class MyThread2 implements Runnable {

	@Override
	public void run() {
		for(int k = 10; k <= 100; k+=10) {
			System.out.println("k = " + k + " " + Thread.currentThread().getName() + " Priority " + Thread.currentThread().getPriority());
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " ended.");
	}

}
