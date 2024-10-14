package com.xworkz.sweets.boot;

import com.xworkz.sweets.bridge.SweetInterface;

public class AshaSweets implements SweetInterface{

	@Override
	public String sweetName() {
		
		return "kaaju sandwich";
	}

	@Override
	public int costOfTheSweet() {
	
		return 780;
	}

}
