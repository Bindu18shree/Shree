package com.xworkz.zoo.boot;

import com.xworkz.zoo.bridge.Zoo;

public class Birds implements Zoo{

	@Override
	public String nameOfZoo() {
		
		return "Bannerghata Biological Park";
	}

	@Override
	public int ticketCost() {
		
		return 100;
	}

}
