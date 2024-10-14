package com.xworkz.zoo.boot;

import com.xworkz.zoo.bridge.Zoo;

public class Animals implements Zoo{

	@Override
	public String nameOfZoo() {
	
		return "Mysore Zoo";
	}

	@Override
	public int ticketCost() {
		
		return 100;
	}

}
