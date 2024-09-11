package com.xworkz.stove.boot;

public class GasStoveRunner {
	
	public static void main(String [] args) {
		
		GasStove gasStove = new GasStove("Prestige",3774.56d, 4036423l, 3, 6239.92f, true);
			
			System.out.println("The brand of the gas stove :" +gasStove.getBrand());
			
			System.out.println("Price of the gas stove :" +gasStove.getPrice());
			
			System.out.println("Model number of the gas stove :" +gasStove.getModelNumber());
			
			System.out.println("Number of heating elements in the gas stove :" +gasStove.getHeatingElements());
			
			System.out.println("Weight of the gas stove in grams :" +gasStove.getWeight());
			
			System.out.println("Burner type of the gas stove is open :" +gasStove.isBurnerTypeOpenOrNot());
			
		}
	}


