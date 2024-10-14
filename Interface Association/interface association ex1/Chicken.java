package com.xworkz.blinkit.boot;

import com.xworkz.blinkit.bridge.BlinkIt;

public class Chicken implements BlinkIt{

	@Override
	public String itemName() {
		
		return "Chicken Curry cut boneless";
	}

	@Override
	public int quantityInGrams() {
		
		return 500;
	}

}
