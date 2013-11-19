package com.practice.inner;

// Anonymous Class Example
// InnerDemo4$1.class
// 1 is order of inner class
public class InnerDemo4 {

	public static void main(String[] args) {
		Ball b = new Ball() {

			@Override
			public void hitMe() {
				System.out.println("Congratulations ! You hit it!");
				
			}	
		};
		b.hitMe();
	}
}

interface Ball {
	public void hitMe();
}


class Test implements Ball {

	@Override
	public void hitMe() {
		System.out.println("HitMe inside Test class");
	}
	
}
