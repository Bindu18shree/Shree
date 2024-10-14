package com.xworkz.saree.boot;

import com.xworkz.saree.bridge.Saree;

public class PartySaree implements Saree{

	@Override
	public String brand() {
		
		return "Swatantra";
	}

	@Override
	public float price() {
		
		return 2965.780f;
	}

}
