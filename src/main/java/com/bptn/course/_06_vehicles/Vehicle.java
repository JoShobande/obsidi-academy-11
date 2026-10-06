package com.bptn.course._06_vehicles;

public abstract class Vehicle {
	String make;
	String model;
	int year;
	boolean isEngineOn = false;
	
	Vehicle(String make, String model, int year){
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	void displayBasicInfo() {
		System.out.println("this car is a " + this.make + "model is " + this.model + " year is: " + this.year);
	}
	
	public abstract void startEngine();
	public abstract void stopEngine();
	public abstract void drive();
	
	
}
