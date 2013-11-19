package com.practice.threads;

public class Q {
	int myInt;
	
	boolean valueSet = false;

	public void put(int i) {
		while(valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		myInt = i;
		System.out.println("Put : " + i);
		valueSet = true;
		notify();
		
	}

	public void get() {
		while(!valueSet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Got : " + myInt);
		valueSet = false;
		notify();
	}

}
