package com.xworkz.car.boot;

public class Car {
	
	public String name;
	
	public double price;
	
	public float mileage;
	
	public int power;
	
	public Brand brand;

	
	public Car(String name, double price, float mileage, int power, Brand brand) {
		
		this.name = name;
		this.price = price;
		this.mileage = mileage;
		this.power = power;
		this.brand = brand;
	}


	public String getName() {
		return name;
	}


	public double getPrice() {
		return price;
	}


	public float getMileage() {
		return mileage;
	}


	public int getPower() {
		return power;
	}
	
	public Brand getBrand() {
		return brand;
	}
}
