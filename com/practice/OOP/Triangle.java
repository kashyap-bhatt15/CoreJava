package com.practice.OOP;

@SuppressWarnings("unused")
public class Triangle implements Shape {

	private int height;
	private int base;
	private double area;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	@Override
	public void calcArea() {
		this.area = (0.5 * this.base * this.height);
	}
}
