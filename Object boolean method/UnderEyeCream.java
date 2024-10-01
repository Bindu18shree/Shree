package com.xworkz.skincare.boot;

public class UnderEyeCream {
	
	public String brand;
	public boolean isItForAllSkinTypes;
	public int price;
	public float netQuantity;
	public boolean isItParabenFree;
	public boolean isItSulphateFree;
	public boolean isItVegan;
	public String expiryDate;
	public String countryOfOrigin;
	public long manufacturerPincode;
	
	
	public UnderEyeCream(String brand, boolean isItForAllSkinTypes, int price, float netQuantity,
			boolean isItParabenFree, boolean isItSulphateFree, boolean isItVegan, String expiryDate,
			String countryOfOrigin, long manufacturerPincode) {
	
		this.brand = brand;
		this.isItForAllSkinTypes = isItForAllSkinTypes;
		this.price = price;
		this.netQuantity = netQuantity;
		this.isItParabenFree = isItParabenFree;
		this.isItSulphateFree = isItSulphateFree;
		this.isItVegan = isItVegan;
		this.expiryDate = expiryDate;
		this.countryOfOrigin = countryOfOrigin;
		this.manufacturerPincode = manufacturerPincode;
	}
	
	
    public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
			
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		UnderEyeCream undereyecream = (UnderEyeCream) obj;
		
		return brand.equals(undereyecream.brand) && isItForAllSkinTypes == undereyecream.isItForAllSkinTypes && price == undereyecream.price 
			   && netQuantity == undereyecream.netQuantity && isItParabenFree == undereyecream.isItParabenFree && isItSulphateFree == undereyecream.isItSulphateFree
			   && isItVegan == undereyecream.isItVegan && expiryDate.equals(undereyecream.expiryDate) 
			   && countryOfOrigin.equals(undereyecream.countryOfOrigin) && manufacturerPincode == undereyecream.manufacturerPincode;
	}
}
