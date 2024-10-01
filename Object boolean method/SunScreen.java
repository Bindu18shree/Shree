package com.xworkz.skincare.boot;

public class SunScreen {
	
	public String brand;
	public String infusedWith;
	public char vitamin;
	public int spf;
	public boolean isItLongLasting;
	public int netQuantity;
	public boolean isItWaterResistant;
	public String asin;
	public String countryOfOrigin;
	public float cost;
	
	
	public SunScreen(String brand, String infusedWith, char vitamin, int spf, boolean isItLongLasting, int netQuantity,
			boolean isItWaterResistant, String asin, String countryOfOrigin, float cost) {
	
		this.brand = brand;
		this.infusedWith = infusedWith;
		this.vitamin = vitamin;
		this.spf = spf;
		this.isItLongLasting = isItLongLasting;
		this.netQuantity = netQuantity;
		this.isItWaterResistant = isItWaterResistant;
		this.asin = asin;
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
		
		SunScreen sunscreen = (SunScreen) obj;
		
		return brand.equals(sunscreen.brand) && infusedWith.equals(sunscreen.infusedWith) && vitamin == sunscreen.vitamin
			   && spf == sunscreen.spf && isItLongLasting == sunscreen.isItLongLasting && netQuantity == sunscreen.netQuantity
			   && isItWaterResistant == sunscreen.isItWaterResistant && asin.equals(sunscreen.asin) && countryOfOrigin.equals(sunscreen.countryOfOrigin)
			   && cost == sunscreen.cost;
	}
}
