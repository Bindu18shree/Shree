package com.xworkz.breakfast.boot;

public class SouthIndianBreakFasts {
	
	public String dishName;
	
	public Double price;
	
	public Integer quantity;
	
	public Float ratings;
	
	public Boolean isBreakfastPreparedFreshOrNot;
	
	public Long orderNumber;
	
	public Restaurant restaurant;
	
	
	public SouthIndianBreakFasts(String dishName, Double price, Integer quantity, Float ratings, Boolean isBreakfastPreparedFreshOrNot, Long orderNumber, Restaurant restaurant) {
		
		this.dishName = dishName;
		
		this.price = price;
		
		this.quantity = quantity;
		
		this.ratings = ratings;
		
		this.isBreakfastPreparedFreshOrNot = isBreakfastPreparedFreshOrNot;
		
		this.orderNumber = orderNumber;
		
		this.restaurant = restaurant;
	}


	public Boolean getIsBreakfastPreparedFreshOrNot() {
		return isBreakfastPreparedFreshOrNot;
	}


	public Restaurant getRestaurant() {
		return restaurant;
	}


	public String getDishName() {
		return dishName;
	}


	public Double getPrice() {
		return price;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public Float getRatings() {
		return ratings;
	}


	public Boolean isBreakfastPreparedFreshOrNot() {
		return isBreakfastPreparedFreshOrNot;
	}


	public Long getOrderNumber() {
		return orderNumber;
	}

}
