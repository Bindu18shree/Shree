package com.xworkz.bike.runner;

import com.xworkz.bike.boot.BikeFeatures;
import com.xworkz.bike.boot.Engine;

public class BikeRunner {
	
	public static void main(String [] args) {
		
		BikeFeatures bikefeatures = new BikeFeatures();
		
		bikefeatures.setName("Royal Enfield Classic 360");
		bikefeatures.setPrice(199499.09f);
		bikefeatures.setMileage(35);
		bikefeatures.setFuelTankCapacity(12.5f);
		bikefeatures.setStandardWarranty(30000l);
		
		Engine engine = new Engine();
		
		engine.setEngineCapacity(349);
		engine.setBikeFeatures(bikefeatures);
		
		System.out.println("Name of the Bike :" +engine.getBikeFeatures().getName());
		System.out.println("Price :" +engine.getBikeFeatures().getPrice());
		System.out.println("Mileage(kmpl) :" +engine.getBikeFeatures().getMileage());
		System.out.println("Fuel Tank Capacity(litres) :" +engine.getBikeFeatures().getFuelTankCapacity());
		System.out.println("Standard Warranty(km) :" +engine.getBikeFeatures().getStandardWarranty());
		System.out.println("Engine Capacity(cc) :" +engine.getEngineCapacity());
	}

}
