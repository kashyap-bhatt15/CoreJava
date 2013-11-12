package com.practice.OOP;

public class Circle implements Shape {
	
	private int radius;
	@SuppressWarnings("unused")
	private double area;

	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	@Override
	public void calcArea() {
		this.area = (Math.PI * this.radius);

	}

}
