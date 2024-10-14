package com.xworkz.blinkit.boot;

import com.xworkz.blinkit.bridge.BlinkIt;

public class Groceries implements BlinkIt{

	@Override
	public String itemName() {
	
		return "Barley";
	}

	@Override
	public int quantityInGrams() {
		
		return 100;
	}

}
