package com.practice.OOP;

public class CarApp {

	public static void main(String[] args) {
		Car car = new Car("2452352454", "TOYOTA", 10, true);
		
		car.accelerate(131);
		System.out.println(car);

		car.decelerate(140);
		
		car.setEngineOn(true);
		car.accelerate(60);
		
		System.out.println(car);
	}
}
