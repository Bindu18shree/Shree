package com.xworkz.mobiles.boot;

public class Mobile {
	
	// Constructor Overloading
	public Mobile() {
		
	}
	
	public Mobile(String brand) {
	
	}
	
	public Mobile(String brand, int model) {
		
	}
	
	public Mobile(String brand, int model, char color) {
		
	}
	
	public Mobile(String brand, int model, char color, double price) {
		
	}
	
	public Mobile(String brand, int model, char color, double price, float screenSize) {
		
	}
	
	public Mobile(String brand, int model, char color, double price, float screenSize, boolean isUSBCableProvided) {
		
	}
	
	// Method Overloading
	public void iPhone() {
		System.out.println("This is no argumental method");
	}
	
	public String iPhone(String brand) {
		return brand;
	}
	
	public int iPhone(String brand, int model) {
		return model;
	}
	
	public char iPhone(String brand, int model, char color) {
		return color;
	}
	
	public double iPhone(String brand, int model, char color, double price) {
		return price;
	}
	
	public float iPhone(String brand, int model, char color, double price, float screenSize) {
		return screenSize;
	}
	
	public boolean iPhone(String brand, int model, char color, double price, float screenSize, boolean isUSBCableProvided) {
		return isUSBCableProvided;
	}
}
