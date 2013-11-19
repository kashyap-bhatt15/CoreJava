package com.practice.threads;

public class MyThread3 implements Runnable {

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		if(t.getName().equals("Report"))
			report();
		//else if(t.getName().equals("Maintenance"))
		else
			maintance();
		
	}
	
	public void maintance() {
		for(int i = 1; i<= 10; i++) {
			System.out.println("i: " + i + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
			/*try {
				//Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println(Thread.currentThread().getName() + " ended.");
	}
	
	public void report() {
		for(int j = 99; j>= 9; j-=10) {
			System.out.println("j: " + j + " " + Thread.currentThread().getName() + " " + Thread.currentThread().getPriority());
			/*try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}*/
		}
		System.out.println(Thread.currentThread().getName() + " ended.");
		
	}

}
