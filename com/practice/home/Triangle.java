package com.practice.home;

public class Triangle implements Shape {
	private int base;
	private int height;
	private double area;
	
	/**
	 * 
	 */
	Triangle() {
	}
	
	/**
	 * @param base
	 * @param height
	 * @param area
	 */
	Triangle(int base, int height) {
		this.base = base;
		this.height = height;
	}

	/**
	 * @return the base
	 */
	private int getBase() {
		return base;
	}
	/**
	 * @param base the base to set
	 */
	@SuppressWarnings("unused")
	private void setBase(int base) {
		this.base = base;
	}
	/**
	 * @return the height
	 */
	private int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	@SuppressWarnings("unused")
	private void setHeight(int height) {
		this.height = height;
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
		setArea(getBase() * getHeight() * 0.5);
	}
	
	@Override
	public String toString() {
		return "Base: " + getBase() + " Height: " + getHeight() + " Area: " + getArea();
	}

}
