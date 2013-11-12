package com.practice.home;

public class Circle implements Shape {
	
	int radius;
	double area;

	/**
	 * 
	 */
	Circle() {
	}

	/**
	 * @param radius
	 */
	Circle(int radius) {
		this.radius = radius;
	}


	/**
	 * @return the radius
	 */
	private int getRadius() {
		return radius;
	}


	/**
	 * @param radius the radius to set
	 */
	@SuppressWarnings("unused")
	private void setRadius(int radius) {
		this.radius = radius;
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
		setArea(Math.pow(getRadius(), 2) * Math.PI);
	}
	
	@Override
	public String toString() {
		return "Radius: " + getRadius() + " Area: " + getArea();
	}

}
