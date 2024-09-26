package com.xworkz.sneakers.boot;

public class Sneakers {
	
	//Constructor Overloading
	public Sneakers() {
		
	}
	
	public Sneakers(String brand) {

	}
	
	public Sneakers(String brand, double price) {
		
	}
	
	public Sneakers(String brand, double price, float size) {
		
	}
	
	public Sneakers(String brand, double price, float size, char color) {
		
	}
	
	public Sneakers(String brand, double price, float size, char color, int offerPercent) {
		
	}
	
	public Sneakers(String brand, double price, float size, char color, int offerPercent, long manufacturerPincode) {
	
	}
	
	public Sneakers(String brand, double price, float size, char color, int offerPercent, long manufacturerPincode, boolean isSneakersForUnisex) {
		
	}
	
	
	//Method Overloading
	public String shoes() {
		
		return "This is no argumental method";
	}
	
	public String shoes(String brand) {
		System.out.println("The brand of the shoes : " +brand);
		return brand;
	}
	
	public double shoes(String brand, double price) {
		System.out.println("Price of the shoes :" +price);
		return price;
	}
	
	public float shoes(String brand, double price, float size) {
		System.out.println("size of the shoes :" +size);
		return size;
	}
	
	public char shoes(String brand, double price, float size, char color) {
		System.out.println("color of the shoes :" +color);
		return color;
	}
	
	public int shoes(String brand, double price, float size, char color, int offerPercent) {
		System.out.println("Offer percentage for the shoes :" +offerPercent );
		return offerPercent;
	}
	
	public long shoes(String brand, double price, float size, char color, int offerPercent, long manufacturerPincode) {
		System.out.println("Pincode of the manufacturer :" +manufacturerPincode);
		return manufacturerPincode;
	}
	
	public boolean shoes(String brand, double price, float size, char color, int offerPercent, long manufacturerPincode, boolean isSneakersForUnisex) {
		System.out.println("Shoes is unisex :" +isSneakersForUnisex);
		return isSneakersForUnisex;
	}
	
}
