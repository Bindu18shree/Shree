package com.xworkz.breakfast.boot;

public class Restaurant {
	
	String nameOfTheRestaurant;
	
	String gstNumber;
	
	Long fssaiLicNumber;
	
	Float restaturantOpensAt;
	
	Double restaurantClosesAt;
	
	Integer pincode;
	
	Boolean isRestaurantVegOrNonVeg;
	
	
	
	public Restaurant(String nameOfTheRestaurant, String gstNumber, Long fssaiLicNumber, Float restaurantOpensAt, Double restaurantClosesAt, Integer pincode, Boolean isRestaurantVegOrNonVeg) {
		
		
		this.nameOfTheRestaurant = nameOfTheRestaurant;
		
		this.gstNumber = gstNumber;
		
		this.fssaiLicNumber = fssaiLicNumber;
		
		this.restaturantOpensAt = restaurantOpensAt;
		
		this.restaurantClosesAt = restaurantClosesAt;
		
		this.pincode = pincode;
		
		this.isRestaurantVegOrNonVeg = isRestaurantVegOrNonVeg;
	}



	public String getNameOfTheRestaurant() {
		return nameOfTheRestaurant;
	}



	public String getGstNumber() {
		return gstNumber;
	}



	public Long getFssaiLicNumber() {
		return fssaiLicNumber;
	}



	public Float getRestaturantOpensAt() {
		return restaturantOpensAt;
	}



	public Double getRestaurantClosesAt() {
		return restaurantClosesAt;
	}



	public Integer getPincode() {
		return pincode;
	}



	public Boolean isRestaurantVegOrNonVeg() {
		return isRestaurantVegOrNonVeg;
	}
}
