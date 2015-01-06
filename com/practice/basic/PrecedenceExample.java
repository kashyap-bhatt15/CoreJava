package com.practice.basic;

public class PrecedenceExample {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		System.out.println(a+b+c);//6
		System.out.println("-----------------------");
		System.out.println(a+b-c);//0
		System.out.println("-----------------------");
		System.out.println(a+b*c);//7
		System.out.println("-----------------------");
		System.out.println(a/b*c);//3/2
		System.out.println("-----------------------");
		int ans;
		ans = a / (b * c);
		//ans = a /6;
		//ans = 0;
		
		System.out.println(ans);//6
		
		System.out.println("-----------------------");
		
		System.out.println("-----------------------");
		
		System.out.println("-----------------------");
		
		System.out.println("-----------------------");
	}

}
