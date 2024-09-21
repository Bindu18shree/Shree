package com.xworkz.vehicles.boot;

public class Car extends Vehicle {
	
	public String name;
	public String numberPlate;
	public double price;
	public char fuelType;
	public boolean isVehicleUnderLoanOrNot;
	
	
	public String getName() {
		return name;
	}
	public String getNumberPlate() {
		return numberPlate;
	}
	public double getPrice() {
		return price;
	}
	public char getFuelType() {
		return fuelType;
	}
	public boolean isVehicleUnderLoanOrNot() {
		return isVehicleUnderLoanOrNot;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
		super.numberPlate = numberPlate;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setFuelType(char fuelType) {
		super.fuelType = fuelType;
	}
	public void setIsVehicleUnderLoanOrNot(boolean isVehicleUnderLoanOrNot) {
		this.isVehicleUnderLoanOrNot = isVehicleUnderLoanOrNot;
		super.isVehicleUnderLoanOrNot = isVehicleUnderLoanOrNot;
	}
}
