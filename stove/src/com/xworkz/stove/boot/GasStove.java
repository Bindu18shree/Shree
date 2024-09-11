package com.xworkz.stove.boot;

public class GasStove {
	
	String brand;
	
	Double price;
	
	Long modelNumber;
	
	Integer heatingElements;
	
	Float weight;
	
	Boolean isBurnerTypeOpenOrNot;
	
	
	public GasStove(String brand, Double price, Long modelNumber, Integer heatingElements, Float weight, Boolean isBurnerTypeOpenOrNot) {
		
		this.brand = brand;
		
		this.price = price;
		
		this.modelNumber = modelNumber;
		
		this.heatingElements = heatingElements;
		
		this.weight = weight;
		
		this.isBurnerTypeOpenOrNot = isBurnerTypeOpenOrNot;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public Long getModelNumber() {
		return modelNumber;
	}
	
	public Integer getHeatingElements() {
		return heatingElements;
	}
	
	public Float getWeight() {
		return weight;
	}
	
	public Boolean isBurnerTypeOpenOrNot() {
		return isBurnerTypeOpenOrNot;
	}

}
