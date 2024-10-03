package com.xworkz.electronics.boot;

public final class WashingMachine extends Electronics {
	
	public static final String brand = "IFB";
	public static final int cost = 49987;
	
	public static final void run(int capacity) {
		
		
		System.out.println("Capacity of the washingmachine in kg :" +capacity);
	}
	
	// Constructor with protected modifier is accessible within the same package only by inheritance concept or by creating instance of a class.
	//It is not accessed in other package by any means
	protected WashingMachine() {
		
		
	}
	
	Electronics electronics = new Electronics();

}
