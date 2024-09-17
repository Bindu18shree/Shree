package com.xworkz.car.boot;

public class Thar {
	
	public float price;
	
	public Brand brand;

	public Thar(float price, Brand brand) {
		
		this.price = price;
		
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}
	
	public Brand getBrand() {
		return brand;
	}
}
