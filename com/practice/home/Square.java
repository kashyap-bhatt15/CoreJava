package com.practice.home;

public class Square implements Shape {
	private int length;
	private double area;

	
	/**
	 * 
	 */
	Square() {
	}

	/**
	 * @param length
	 * @param area
	 */
	Square(int length) {
		this.length = length;
	}

	/**
	 * @return the length
	 */
	private int getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	@SuppressWarnings("unused")
	private void setLength(int length) {
		this.length = length;
	}

	/**
	 * @return the area
	 */
	private double getArea() {
		return area;
	}

	/**
	 * @param area the area to set
	 */
	private void setArea(double area) {
		this.area = area;
	}
	
	@Override
	public void calcArea() {
		setArea(Math.pow(getLength(), 2));
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Length: " + getLength() + " Area: " + getArea();
	}

}
