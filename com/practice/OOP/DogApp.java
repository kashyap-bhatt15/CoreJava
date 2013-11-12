package com.practice.OOP;

public class DogApp {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		d1.setName("Astor");
		d1.setAge(1);
		d1.setColor("black");
		//d1.show();
		
		/*
		Dog d2 = new Dog("Mini",3);
		//d2.show();
		
		Dog d3 = new Dog();
		System.out.println(d3);
		
		System.out.println(d1);
		System.out.println(d2.toString());
		
		System.out.println(d1.getClass());
		System.out.println(d1.getName());
		
		Dog d4 = new Dog("Moti", "Blue");
		Dog d5 = new Dog("KK");
		
		System.out.println(d4);
		System.out.println(d5);
		*/
		d1.eat("fish");
		d1.eat();
		d1.eat();
		d1.eat();
		d1.eat();
		d1.eat();
		d1.eat();
		d1.eat();
		d1.eat();
		System.out.println(d1);
		
	}

}
