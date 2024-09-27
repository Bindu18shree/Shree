package com.xworkz.iron.runner;

import com.xworkz.iron.boot.SteamIron;

public class PhilipsRunner {
	
	public static void main(String[] args) {
		
		SteamIron steamiron = new SteamIron();
		
		steamiron.setModelName("GC2147/30");
		steamiron.setCost(3244.6545d);
		steamiron.setWattage(2400);
		steamiron.setUnitOfWattage('W');
		steamiron.setWeight(1.19f);
		steamiron.setIsIronScratchResistantOrNot(true);
		
		System.out.println("Model name of the iron :" +steamiron.getModelName());
		System.out.println("Cost of the iron :" +steamiron.getCost());
		System.out.println("Wattage of the iron :" +steamiron.getWattage());
		System.out.println("Unit of the wattage :" +steamiron.getUnitOfWattage());
		System.out.println("Weight of the iron in kg :" +steamiron.getWeight());
		System.out.println("Special feature of the iron is Scratch Resistant :" +steamiron.isIronScratchResistantOrNot());
		
	}

}
