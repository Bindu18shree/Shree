package com.xworkz.waterpurifier.boot;

public class Runner {
	
	public static void main(String [] args) {
		
		AquaGuard aquaguard = new AquaGuard("Aura 2X Life(RO+UV)",15974.90f, 7, false, 6.67532d, 400013l);
		
		System.out.println("The style name of the Water purifier :" +aquaguard.getStyleName());
		
		System.out.println("Price of the water purifier :" +aquaguard.getPrice());
		
		System.out.println("Capacity of the purifier in litres :" +aquaguard.getCapacity());
		
		System.out.println("Service is not required for 2 years after buying water purifier :" +aquaguard.isServiceRequiredForTwoYears());
		
		System.out.println("water purifier weight in kg :" +aquaguard.getItemWeight());
		
		System.out.println("Pincode of the manufacturer of the purifier :" +aquaguard.getPincodeOfManufacturer());
	}

}
