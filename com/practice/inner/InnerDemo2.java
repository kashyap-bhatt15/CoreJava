package com.practice.inner;

//Inner class Example
public class InnerDemo2 {
	private int i = 100;
	static int j = 200;
	
	class NewInner {
		private int a = 10;
		// static int j = 20;
		
		/*static void method1() {	
		}*/
		
		void method1() {
			System.out.println("a = " + a);
			System.out.println("i = " + i);
			System.out.println("j = " + j);
		}
		
	}
	public static void main(String[] args) {
		// NewInner inn = new NewInner();
		InnerDemo2 id2 = new InnerDemo2();
		NewInner inn = id2.new NewInner();
		inn.method1();
		

	}

}
