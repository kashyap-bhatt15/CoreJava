package com.practice.inner;


// Nested Inner Class example
@SuppressWarnings("static-access")
// Class file name: InnerDemo1.class
public class InnerDemo1 {
	
	private int i = 100;
	static int j = 200;
	
	// Inner class file name: InnerDemo1$MyInner.class
	static class MyInner {
		private int a = 10;
		static int b = 20;
		
		void method1() {
			InnerDemo1 idemo1 = new InnerDemo1();
			
			System.out.println("a = " + a);
			System.out.println("b = " + b);
			System.out.println("i = " + idemo1.i);
			System.out.println("j = " + j);
		}
		
		static void method2() {
			// System.out.println("a = " + a);
			MyInner myInner = new MyInner();
			System.out.println("a = " + myInner.a);
			System.out.println("b = " + b);
		}
		
		public static void main(String[] args) {
			System.out.println("Inside Inner Main Method");
		}
	}
	
	public static void main(String[] args) {
		MyInner i = new MyInner();
		i.method1();
		i.method2();
		//MyInner.method2();
	}
	
	public void outerMethod() {
		MyInner m = new MyInner();
		System.out.println("a = " + m.a);
		System.out.println("b = " + m.b);
		// System.out.println("a = " + a);
		// System.out.println("b = " + b);
		m.method1();
	}

}
