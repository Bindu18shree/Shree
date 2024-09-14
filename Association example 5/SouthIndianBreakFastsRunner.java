package com.xworkz.breakfast.runner;

import com.xworkz.breakfast.boot.Restaurant;
import com.xworkz.breakfast.boot.SouthIndianBreakFasts;

public class SouthIndianBreakFastsRunner {

	public static void main(String [] args) {
		
		Restaurant restaurant = new Restaurant("Go Native", "29AASFB5524C1ZE", 11224331001l, 7.35f, 10.350000d, 560041, true);
		
		SouthIndianBreakFasts southindianbreakfasts = new SouthIndianBreakFasts("Masala Dosa", 80.9523d, 1, 4.3f, true, 5886849155l, restaurant);
		
		System.out.println("South indian breakfast ordered :" +southindianbreakfasts.getDishName());
		
		System.out.println("Price of the breakfast :" +southindianbreakfasts.getPrice());
		
		System.out.println("Quantity ordered :" +southindianbreakfasts.getQuantity());
		
		System.out.println("Ratings provided by the customers who ordered that particular item :" +southindianbreakfasts.getRatings());
		
		System.out.println("The foods are prepared fresh in this restuarant :" +southindianbreakfasts.isBreakfastPreparedFreshOrNot());
		
		System.out.println("Order number :" +southindianbreakfasts.getOrderNumber());
		
		System.out.println("Name of the restaurant from where breakfast ordered :" +southindianbreakfasts.restaurant.getNameOfTheRestaurant());
		
		System.out.println("GST Number of the restaurant :" +southindianbreakfasts.restaurant.getGstNumber());
		
		System.out.println("FSSAI LIC Number of the restaurant :" +southindianbreakfasts.restaurant.getFssaiLicNumber());
		
		System.out.println("Restaurant opens at(AM) :" +southindianbreakfasts.restaurant.getRestaturantOpensAt());
		
		System.out.println("Restaurant closes at(PM) :" +southindianbreakfasts.restaurant.getRestaurantClosesAt());
		
		System.out.println("Pincode of the restaurant :" +southindianbreakfasts.restaurant.getPincode());
		
		System.out.println("The Restaurant has only Vegetarian Food :" +southindianbreakfasts.restaurant.isRestaurantVegOrNonVeg());
		
		
	}
}
