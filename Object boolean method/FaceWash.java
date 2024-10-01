package com.xworkz.skincare.boot;

public class FaceWash {
	
	public String brand;
	public int netQuantity;
	public float mrp;
	public double offerPrice;
	public int offerPercent;
	public String modelNumber;
	public String asin;
	public boolean isItForAllSkinTypes;
	public boolean isItUnscented;
	public String productBenefits;
	
	
	public boolean equals(Object obj) {
		
		if(this == obj ) {
			 
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		FaceWash facewash = (FaceWash) obj;
		
		return brand.equals(facewash.brand) && netQuantity == facewash.netQuantity && mrp == facewash.mrp 
		       && offerPrice == facewash.offerPrice && offerPercent == facewash.offerPercent 
		       && modelNumber.equals(facewash.modelNumber) && asin.equals(facewash.asin) 
		       && isItForAllSkinTypes == facewash.isItForAllSkinTypes && isItUnscented == facewash.isItUnscented 
		       && productBenefits.equals(facewash.productBenefits);
	}
	

}
