package com.xworkz.fruits.runner;

import com.xworkz.fruits.boot.Fruit;

public class FlowerRunner {
	
	public static void main(String [] args) {
		
		Fruit fruit = new Fruit();
		
		fruit.name("Kiwi");
		fruit.quantity(100);
		fruit.fat(0.5f);
		fruit.protein(1.09999d);
		fruit.calories(61);
		fruit.nameOfThePlant("Actinidia delicosa");
		fruit.reaches(9);
		fruit.length(12.5f);
		
	}

}
