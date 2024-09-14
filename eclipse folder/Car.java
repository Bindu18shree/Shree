package com.xworkz.books.boot;

public class Car {
	
	public String nameOfTheCar;
	
	public double price;
	
	public int cargoVolume;
	
	public float engine;
	
	public CarFeatures carFeatures;
	
	public Car(String nameOfTheCar, double price, int cargoVolume, float engine, CarFeatures carFeatures) {
		
		this.nameOfTheCar = nameOfTheCar;
		
		this.price = price;
		
		this.cargoVolume = cargoVolume;
		
		this.engine = engine;
		
		this.carFeatures = carFeatures;
	}

	public CarFeatures getCarFeatures() {
		return carFeatures;
	}

	public String getNameOfTheCar() {
		return nameOfTheCar;
	}

	public double getPrice() {
		return price;
	}

	public int getCargoVolume() {
		return cargoVolume;
	}

	public float getEngine() {
		return engine;
	}

	

}
