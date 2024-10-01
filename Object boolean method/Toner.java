package com.xworkz.skincare.boot;

public class Toner {
	
	public String brand;
	public double cost;
	public int netQuantity;
	public String modelNumber;
	public String asin;
	public float productLength;
	public float productWidth;
	public float productHeight;
	public boolean isItParabeenFree;
	public boolean isItForAllSKinTypes;
	
	
	public Toner(String brand, double cost, int netQuantity, String modelNumber, String asin, float productLength,
			float productWidth, float productHeight, boolean isItParabeenFree, boolean isItForAllSKinTypes) {
		
		this.brand = brand;
		this.cost = cost;
		this.netQuantity = netQuantity;
		this.modelNumber = modelNumber;
		this.asin = asin;
		this.productLength = productLength;
		this.productWidth = productWidth;
		this.productHeight = productHeight;
		this.isItParabeenFree = isItParabeenFree;
		this.isItForAllSKinTypes = isItForAllSKinTypes;
	}
	
	
	public boolean equals(Object obj) {
		 
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		Toner toner = (Toner) obj;
		
		return brand.equals(toner.brand) && cost == toner.cost && netQuantity == toner.netQuantity 
			   && modelNumber.equals(toner.modelNumber) && asin.equals(toner.asin) 
			   && productLength == toner.productLength && productWidth == toner.productWidth 
			   && productHeight == toner.productHeight && isItParabeenFree == toner.isItParabeenFree 
			   && isItForAllSKinTypes == toner.isItForAllSKinTypes ;
			   
	}
}
