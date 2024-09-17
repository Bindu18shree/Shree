package com.xworkz.fruits.boot;

public class Fruit extends Plant {
	
	
	public void name(String fruitName) {
		System.out.println("Name of the fruit :" +fruitName);
	}
	
	public void quantity(int quantityOfTheFruit) {
		System.out.println("Quantity :" +quantityOfTheFruit);
	}
	
	public void fat(float totalFat) {
		System.out.println("Total fat(g) present in fruit per 100 grams :" +totalFat);
	}
	
	public void protein(double totalProtein) {
		System.out.println("Total protien(g) present in fruit per 100 grams :" +totalProtein);
	}
	
	public void calories(int totalCalories) {
		System.out.println("Calories present per 100 grams :" +totalCalories);
	}
}
