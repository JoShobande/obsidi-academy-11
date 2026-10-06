package com.bptn.course._06_vehicles;

  public class Car extends Vehicle implements FuelConsuming {
	 


	public Car(String make, String model, int year) {
		super(make, model, year);
//		this.refuel = refuel;
	}
	
	

	@Override
	public double refuel(double liters) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getFuelLevel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		
	}

}
