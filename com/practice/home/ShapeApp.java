package com.practice.home;

public class ShapeApp {
	public static void main(String[] args) {
		Square s = new Square(10);		
		Triangle t = new Triangle(10,10);
		Circle c = new Circle(10);
		
		s.calcArea();
		t.calcArea();
		c.calcArea();
		
		System.out.println(s);
		System.out.println(t);
		System.out.println(c);
	}
	

}
