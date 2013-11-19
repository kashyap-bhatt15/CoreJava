package com.practice.inner;

import com.practice.inner.InnerDemo2.NewInner;

//import com.practice.inner.InnerDemo1.MyInner;

public class TestInnerApp {

	public static void main(String[] args) {
		// MyInner myInner = new MyInner();
		InnerDemo1.MyInner myInner2 = new InnerDemo1.MyInner();
		
		myInner2.method1();
		// myInner2.method2();
		InnerDemo1.MyInner.method2();
		
		
		// Two different way to create an object of NewInner class
		// One requires import while
		// Second doesn't require one.
		InnerDemo2 id2 = new InnerDemo2();
		NewInner inn = id2.new NewInner();
		InnerDemo2.NewInner inn2 = new InnerDemo2().new NewInner();
		inn.method1();
		inn2.method1();
		
	}

}
