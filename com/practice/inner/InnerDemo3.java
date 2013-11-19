package com.practice.inner;

// Local Inner class example
// Class file Name: InnerDemo3$1MyLocalInner.class
// 1 is order of method in which it appears.
@SuppressWarnings("unused")
public class InnerDemo3 {
	private int i = 100;
	static int j = 200;
	
	void method1() {
		int x = 1000;
		class MyLocalInner {
			private int a = 10;
			// static int b = 20;
			void method() {
				System.out.println("a = " + a);
				System.out.println("i = " + i);
				System.out.println("j = " + j);
				// x is local variable not static
				// also block level visibility of local variable
				// System.out.println("x = " + x);
			}
			
			
		}
		MyLocalInner obj = new MyLocalInner();
		obj.method();
	}
	
	
	public static void main(String[] args) {
		InnerDemo3 id3 = new InnerDemo3();
		id3.method1();
		

	}

}
