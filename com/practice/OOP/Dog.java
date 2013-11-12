package com.practice.OOP;

public class Dog {
	private String name;
	private int age;
	private String color;
	private boolean hungry = true;
	private int hungryCount;
	
	public Dog() {
		this.name = "homeless";
		this.age = 0;
		this.color = "No color";
	}

	public Dog(String name) {
		this.name = name;
	}
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.color = "No color";
	}
	
	public Dog(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	public Dog(String name, int age, String color) {
		this.name = name;
		this.age = age;
		this.color = color;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/*void show() {
		System.out.println("Name is " + name);
		System.out.println("Age is " + age);
		System.out.println("Color is " + color);
	}*/
	
	/**
	 * @return the hungry
	 */
	public boolean isHungry() {
		return hungry;
	}

	/**
	 * @param hungry the hungry to set
	 */
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
	}

	void eat() {
		hungryCount++;
		if (isHungry()) {
			System.out.println("Thanks! Nice food");
			setHungry(false);
			hungryCount = 0;
		}
		else {
			System.out.println("Not Hungry");
			hungry = (hungryCount >=3) ? true : false;
		}
	}
	
	void eat(String food) {
		hungryCount++;
		if (isHungry()) {
			System.out.println("Thanks! " + food + " was delicious");
			setHungry(false);
			hungryCount = 0;
		}
		else {
			System.out.println("Not Hungry");
			hungry = (hungryCount >=3) ? true : false;
		}
	}
	
	@Override
	public String toString() {
		String s;
		if (isHungry())
			s = "Hungry";
		else
			s = "Not Hungry";
		return "Name is " + getName() + ", Age is " + getAge() + ", Color is " + getColor() + " " + s;
	}
}
