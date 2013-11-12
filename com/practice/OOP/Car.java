package com.practice.OOP;

/*
 * Identifying Attributes: vinNumber, Name
 * Status Attributes: speed, engineStatus
 * Constructors
 * Getter and setters
 * Methods: 
 * Accelerate => Increase speed by 1, increase speed only if engine is on. Maximum allowed is 140. Warning after 120 MPH.
 * Decelerate => Decrease by 1, if engine is off. Speed can't be negative.
 * Accelerate(speed) => Increase speed by speed specified, Keep in mind other criteria.
 * Decelerate(speed) => Same as about but decrease, Keep in mind other criteria.
 */
class Car {
	private String vinNumber;
	private String name;
	private int speed;
	boolean engineOn;
	
	final static int maxSpeed = 140;
	final static int  minSpeed = 0;
	final static int warningSpeed = maxSpeed - 20;
	
	/*
	 * Default constructor
	 */
	Car() {
		setVinNumber("Unspecified");
		setName("Unspecified");
		setEngineOn(false);
		setSpeed(minSpeed);
	}
	
	/*
	 * Constructor that initialize car with Vin Number and its name.
	 */
	Car(String vinNumber, String name) {
		setVinNumber(vinNumber);
		setName(name);
		setEngineOn(false);
		setSpeed(minSpeed);
	}
	
	/*
	 * Constructor that initialize car with Vin Number and its name, speed and engineOn.
	 */
	Car(String vinNumber, String name, int speed, boolean engineOn) {
		setVinNumber(vinNumber);
		setName(name);
		setEngineOn(engineOn);
		setSpeed(speed);
	}
	
	/**
	 * @return the vinNumber
	 */
	private String getVinNumber() {
		return vinNumber;
	}
	
	/**
	 * @param vinNumber the vinNumber to set
	 */
	private void setVinNumber(String vinNumber) {
		this.vinNumber = vinNumber;
	}
	
	/**
	 * @return the name
	 */
	private String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	private void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the speed
	 */
	private int getSpeed() {
		return speed;
	}
	
	/**
	 * @param speed the speed to set
	 */
	private void setSpeed(int speed) {
		if(isEngineOn()) {
			if(speed <= maxSpeed && speed >= minSpeed) {
				if(speed > warningSpeed)
					System.out.println("You are going above " + warningSpeed + " MPH");
				this.speed = speed;
			}
			else if(speed < minSpeed) {
				// System.out.println("You are already stopped");
				this.speed = minSpeed;
			}
			else {
				System.out.println("Can't accelerate above 140 MPH");
				this.speed = maxSpeed;
			}
		}
		else
			this.speed = minSpeed;
	}
	
	/**
	 * @return the engineStatus
	 */
	boolean isEngineOn() {
		return engineOn;
	}
	
	/**
	 * @param engineStatus the engineStatus to set
	 */
	void setEngineOn(boolean engineStatus) {
		if(!engineStatus)
			setSpeed(minSpeed);
		this.engineOn = engineStatus;	
	}
	
	/*
	 * Accelerate/Increase the car speed by 1.
	 */
	void accelerate() {
		setSpeed(getSpeed() + 1);
	}
	
	/*
	 * Decelerate/Decrease the car speed by 1.
	 */
	void decelerate() {
		setSpeed(getSpeed() - 1);		
	}
	
	/*
	 * Accelerate/Increase the car speed by parameter speed.
	 */
	void accelerate(int speed) {
		setSpeed(getSpeed() + speed);
	}
	
	/*
	 * Decelerate/Decrease the car speed by parameter speed.
	 */
	void decelerate(int speed) {
		setSpeed(getSpeed() - speed);		
	}
	
	@Override
	public String toString() {
		return "Car Details - VinNumber: " + getVinNumber() + " Name: " + getName() + " Speed: " + getSpeed() + " Engine On?: " + isEngineOn();
	}
}