package com.xworkz.electronics.runner;

import com.xworkz.electronics.boot.WashingMachine;

public class ElectronicsRunner {
	
	public static void main(String[] args) {
		
	System.out.println("brand :" +WashingMachine.brand);
	
	System.out.println("cost :" +WashingMachine.cost);
	
	WashingMachine.run(5);
	}

}
