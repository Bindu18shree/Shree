package com.xworkz.skincare.boot;

public class FaceMask {
	
	public String brand;
	public float cost;
	public int netQuantity;
	public String modelNumber;
	public String asin;
	public String infusedWith;
	public int ahaPercentagePresent;
	public int bhaPercentagePresent;
	public String productBenefits;
	public String upc;
	
	
	public FaceMask(String brand, float cost, int netQuantity, String modelNumber, String asin, String infusedWith,
			int ahaPercentagePresent, int bhaPercentagePresent, String productBenefits, String upc) {
		
		this.brand = brand;
		this.cost = cost;
		this.netQuantity = netQuantity;
		this.modelNumber = modelNumber;
		this.asin = asin;
		this.infusedWith = infusedWith;
		this.ahaPercentagePresent = ahaPercentagePresent;
		this.bhaPercentagePresent = bhaPercentagePresent;
		this.productBenefits = productBenefits;
		this.upc = upc;
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
			
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		FaceMask facemask = (FaceMask) new Object();
		
		return brand.equals(facemask.brand) && cost == facemask.cost && netQuantity == facemask.netQuantity 
			   && modelNumber.equals(facemask.modelNumber) && asin.equals(facemask.asin) && infusedWith.equals(facemask.infusedWith)
			   && ahaPercentagePresent == facemask.ahaPercentagePresent && bhaPercentagePresent == facemask.bhaPercentagePresent
			   && productBenefits.equals(facemask.productBenefits) && upc.equals(facemask.upc);
	}
}
