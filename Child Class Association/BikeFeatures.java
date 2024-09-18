package com.xworkz.bike.boot;

public class BikeFeatures extends Bike {
	
	public int mileage;
	
	public float fuelTankCapacity;
	
	public long standardWarranty;

	
	
	public int getMileage() {
		return mileage;
	}

	public float getFuelTankCapacity() {
		return fuelTankCapacity;
	}

	public long getStandardWarranty() {
		return standardWarranty;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public void setFuelTankCapacity(float fuelTankCapacity) {
		this.fuelTankCapacity = fuelTankCapacity;
	}

	public void setStandardWarranty(long standardWarranty) {
		this.standardWarranty = standardWarranty;
	}
}
