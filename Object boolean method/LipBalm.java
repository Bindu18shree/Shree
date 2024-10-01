package com.xworkz.skincare.boot;

public class LipBalm {
	
	public String brand;
	public String flavour;
	public int cost;
	public long modelNumber;
	public String asin;
	public float netQuantity;
	public String globalTradeIdentificationNumber;
	public boolean isItGlossyFinish;
	public String countryOfOrigin;
	public float ratings;
	
	public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		LipBalm lipbalm = (LipBalm) new Object();
		
		return brand.equals(lipbalm.brand) && flavour.equals(lipbalm.flavour) && cost == lipbalm.cost && modelNumber == lipbalm.modelNumber
			   && asin.equals(lipbalm.asin) && netQuantity == lipbalm.netQuantity && globalTradeIdentificationNumber.equals(lipbalm.globalTradeIdentificationNumber)
			   && isItGlossyFinish == lipbalm.isItGlossyFinish && countryOfOrigin.equals(lipbalm.countryOfOrigin)
			   && ratings == lipbalm.ratings;
		
	}

}
