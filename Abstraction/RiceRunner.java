package com.xworkz.rice.runner;

import com.xworkz.rice.boot.RiceVarieties;

public class RiceRunner {
	
	public static void main(String[] args) {
		
		RiceVarieties varieties = new RiceVarieties();
		
		varieties.costOfSonaMasuriRicePerKg = 45;
		
		varieties.costOfBasmatiRicePerKg = 280.89f;
		
		varieties.costOfRedricePerKg = 62.986d;
		
		varieties.costOfBrownRicePerKg = 139;
		
		varieties.sonamasuriRice();
		
		varieties.basmatiRice();
		
		varieties.redRice();
		
		varieties.brownRice();
		
		varieties.kolamRice();
		
		varieties.boiledRice();
		
		varieties.wildRice();
		
		varieties.sushiRice();
		
		varieties.richInCarbs();
		
		varieties.richInVitaminsB();
	 
		
	}

}
