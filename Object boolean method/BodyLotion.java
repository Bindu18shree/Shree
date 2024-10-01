package com.xworkz.skincare.boot;

public class BodyLotion {
	
	public String brand;
	public String infusedWith;
	public char vitamin;
	public boolean isSpfPresent;
	public int spf;
	public int netQuantity;
	public boolean isItDermatologicallyTested;
	public long telephoneNumberOfManufacturer;
	public String countryOfOrigin;
	public float cost;
	
	
	public BodyLotion(String brand, String infusedWith, char vitamin, boolean isSpfPresent, int spf, int netQuantity,
			boolean isItDermatologicallyTested, long telephoneNumberOfManufacturer, String countryOfOrigin,
			float cost) {
		
		this.brand = brand;
		this.infusedWith = infusedWith;
		this.vitamin = vitamin;
		this.isSpfPresent = isSpfPresent;
		this.spf = spf;
		this.netQuantity = netQuantity;
		this.isItDermatologicallyTested = isItDermatologicallyTested;
		this.telephoneNumberOfManufacturer = telephoneNumberOfManufacturer;
		this.countryOfOrigin = countryOfOrigin;
		this.cost = cost;
	}
	
	
    public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		BodyLotion bodylotion = (BodyLotion) obj;
		
		return brand.equals(bodylotion.brand) && infusedWith.equals(bodylotion.infusedWith) && vitamin == bodylotion.vitamin
			   && isSpfPresent == bodylotion.isSpfPresent && spf == bodylotion.spf && netQuantity == bodylotion.netQuantity 
			   && isItDermatologicallyTested == bodylotion.isItDermatologicallyTested && telephoneNumberOfManufacturer == bodylotion.telephoneNumberOfManufacturer 
			   && countryOfOrigin.equals(bodylotion.countryOfOrigin)&& cost == bodylotion.cost;
	}
}
