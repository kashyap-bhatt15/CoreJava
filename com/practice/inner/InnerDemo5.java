package com.practice.inner;


//Anonymous Class Example
public class InnerDemo5 {

	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread executed.");
			}
		});
		t.start();
	}
}