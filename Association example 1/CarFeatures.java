package com.xworkz.books.boot;

public class CarFeatures {
	
	public int seatingCapacity;
	
	public String color;
	
	public float touchScreenSystem;
	
	
	
	public CarFeatures(int seatingCapacity, String color, float touchScreenSystem) {
		
		this.seatingCapacity = seatingCapacity;
		
		this.color = color;
		
		this.touchScreenSystem = touchScreenSystem;
	}



	public int getSeatingCapacity() {
		return seatingCapacity;
	}



	public String getColor() {
		return color;
	}



	public float getTouchScreenSystem() {
		return touchScreenSystem;
	}



		
	

}
