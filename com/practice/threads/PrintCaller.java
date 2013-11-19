package com.practice.threads;

public class PrintCaller implements Runnable {
	MyPrinter target;
	String msg;
	Thread t;
	
	PrintCaller(MyPrinter target, String msg){
		this.target = target;
		this.msg = msg;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		synchronized (target) {
			target.print(msg);
		}
	}

}
