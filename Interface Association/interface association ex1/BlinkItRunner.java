package com.xworkz.blinkit.runner;

import com.xworkz.blinkit.boot.*;
import com.xworkz.blinkit.bridge.BlinkIt;

public class BlinkItRunner {
	
	public static void main(String[] args) {
		
		BlinkIt chicken = new Chicken();
		
		BlinkIt groceries = new Groceries();
		
		BlinkItCategories categories = new BlinkItCategories();
		
		System.out.println(groceries.itemName());
		
		System.out.println(chicken.quantityInGrams());
		
		System.out.println(categories.display(groceries));
		
		System.out.println(categories.execute(chicken));
		
		
	}

}
