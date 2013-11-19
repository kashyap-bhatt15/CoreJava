package com.practice.threads;

public class Producer implements Runnable {
	Q q;
	Thread t;
	
	public Producer(Q q) {
		this.q = q;
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		int i = 0;
		while(true) {
			synchronized (q) {
				q.put(i++);
			}
			
		}
	}
}
