package com.practice.threads;

public class Consumer implements Runnable {

	Q q;
	Thread t;
	
	public Consumer(Q q) {
		this.q = q;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		while(true) {
			synchronized (q) {
				q.get();
			}
		}
	}

}
