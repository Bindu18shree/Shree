package com.xworkz.vehicles.boot;

public class SportsCar extends Car{
	
	public double price;
	public int engine;
	public float battery;
	public char fuelType;
	
	
	public double getPrice() {
		return price;
	}
	public int getEngine() {
		return engine;
	}
	public float getBattery() {
		return battery;
	}
	public char getFuelType() {
		return fuelType;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	public void setEngine(int engine) {
		this.engine = engine;
	}
	public void setBattery(float battery) {
		this.battery = battery;
	}
	public void setFuelType(char fuelType) {
		this.fuelType = fuelType;
		super.fuelType = fuelType;
	}
	
	
	

}
