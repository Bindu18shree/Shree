package com.xworkz.breakfast.boot;

public class ClothingBoutique {
	
	public String nameOfTheBoutique;
	
	public String address;
	
	public int pincode;
	
	public long contactNumber;
	
	public float boutiqueOpensAt;
	
	public boolean isBoutiqueHasTraditionalOrWestern;
	
	public Saree saree;
	
	
	
	
	public ClothingBoutique(String nameOfTheBoutique, String address, int pincode, long contactNumber, float boutiqueOpensAt, boolean isBoutiqueHasTraditionalOrWestern, Saree saree) {
		
		
		this.nameOfTheBoutique = nameOfTheBoutique;
		
		this.address = address;
		
		this.pincode = pincode;
		
		this.contactNumber = contactNumber;
		
		this.boutiqueOpensAt = boutiqueOpensAt;
		
		this.isBoutiqueHasTraditionalOrWestern = isBoutiqueHasTraditionalOrWestern;
		
		this.saree = saree;
	}




	public String getNameOfTheBoutique() {
		return nameOfTheBoutique;
	}




	public String getAddress() {
		return address;
	}




	public int getPincode() {
		return pincode;
	}




	public long getContactNumber() {
		return contactNumber;
	}




	public float getBoutiqueOpensAt() {
		return boutiqueOpensAt;
	}




	public boolean isBoutiqueHasTraditionalOrWestern() {
		return isBoutiqueHasTraditionalOrWestern;
	}




	public Saree getSaree() {
		return saree;
	}
	

}
