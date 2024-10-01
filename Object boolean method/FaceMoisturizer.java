package com.xworkz.skincare.boot;

public class FaceMoisturizer {
	
	public boolean isItOilFreeMoisturizer;
	public String brand;
	public float netQuantity;
	public double cost;
	public String productBenefits;
	public String ingredients;
	public boolean isItForUnisex;
	public String modelNumber;
	public String asin;
	public String countryOfOrigin;
	
	
	public void setIsItOilFreeMoisturizer(boolean isItOilFreeMoisturizer) {
		this.isItOilFreeMoisturizer = isItOilFreeMoisturizer;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setNetQuantity(float netQuantity) {
		this.netQuantity = netQuantity;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setProductBenefits(String productBenefits) {
		this.productBenefits = productBenefits;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public void setIsItForUnisex(boolean isItForUnisex) {
		this.isItForUnisex = isItForUnisex;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public void setAsin(String asin) {
		this.asin = asin;
	}
	public void setCountryOfOrigin(String countryOfOrigin) {
		this.countryOfOrigin = countryOfOrigin;
	}
	
	
	public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		FaceMoisturizer facemoisturizer = (FaceMoisturizer) obj;
		
		return isItOilFreeMoisturizer == facemoisturizer.isItOilFreeMoisturizer && brand.equals(facemoisturizer.brand) 
			   && netQuantity == facemoisturizer.netQuantity && cost == facemoisturizer.cost 
			   && productBenefits.equals(facemoisturizer.productBenefits) && ingredients.equals(facemoisturizer.ingredients)
			   && isItForUnisex == facemoisturizer.isItForUnisex && modelNumber.equals(facemoisturizer.modelNumber)
			   && asin.equals(facemoisturizer.asin) && countryOfOrigin.equals(facemoisturizer.countryOfOrigin);
	}
}
