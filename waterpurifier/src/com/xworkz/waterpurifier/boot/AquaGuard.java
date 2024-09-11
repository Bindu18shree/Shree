package com.xworkz.waterpurifier.boot;

public class AquaGuard {
	
	String styleName;
	
	float price;
	
	int capacity;
	
	boolean isServiceRequiredForTwoYears;
	
	double itemWeight;
	
	long pincodeOfManufacturer;
	
	
	public AquaGuard(String styleName, float price, int capacity, boolean isServiceRequiredForTwoYears, double itemWeight, long pincodeOfManufacturer) {
		
    this.styleName = styleName;
    
    this.price = price;
    
    this.capacity = capacity;
    
    this.isServiceRequiredForTwoYears = isServiceRequiredForTwoYears;
    
    this.itemWeight = itemWeight;
    
    this.pincodeOfManufacturer = pincodeOfManufacturer;
	}
	
	public String getStyleName() {
		return styleName;
	}
	
	public float getPrice() {
		return price;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public boolean isServiceRequiredForTwoYears() {
		return isServiceRequiredForTwoYears;
	}
	
	public double getItemWeight() {
		return itemWeight;
	}
	
	public long getPincodeOfManufacturer() {
		return pincodeOfManufacturer;
	}

}
