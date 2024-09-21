package com.xworkz.vehicles.runner;

import com.xworkz.vehicles.boot.SportsCar;

public class VehicleRunner {
	
	public static void main(String [] args) {
		
		SportsCar sportscar = new SportsCar();
		
		sportscar.setNumberPlate("KL07AH9981");
		sportscar.setWheeler(4);
		sportscar.setFuelType('E');
		sportscar.setIsVehicleUnderLoanOrNot(false);
		sportscar.setName("Ferrari SF90 Stradale");
		sportscar.setPrice(75083400l);
		sportscar.setEngine(3990);
		sportscar.setBattery(7.9f);
		
		
		System.out.println("Number plate of the vehicle :" +sportscar.getNumberPlate());
		System.out.println("Fuel type(Electric) of the vehicle:" +sportscar.getFuelType());
		System.out.println("Vehicle is under loan :" +sportscar.isVehicleUnderLoanOrNot);
		System.out.println("Name of the Car :" +sportscar.getName());
		System.out.println("Price of the Sports Car :" +sportscar.getPrice());
		System.out.println("Engine Capacity(cc) of the Sports car :" +sportscar.getEngine());
		System.out.println("Battery(kWh) :" +sportscar.getBattery());
		
		
	}

}
