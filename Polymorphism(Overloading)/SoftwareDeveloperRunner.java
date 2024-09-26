package com.xworkz.developer.runner;

import com.xworkz.developer.boot.SoftwareDeveloper;

public class SoftwareDeveloperRunner {
	
	public static void main(String[] args) {
		
		SoftwareDeveloper softwaredeveloper = new SoftwareDeveloper();
		
		softwaredeveloper.developer("Madhu");
		softwaredeveloper.developer("Madhu", 'P');
		softwaredeveloper.developer("Madhu", 'P', 5);
		softwaredeveloper.developer("Madhu", 'P', 5, 80000.00d);
		softwaredeveloper.developer("Madhu", 'P', 5, 80000.00d, 7865437899l);
		softwaredeveloper.developer("Madhu", 'P', 5, 80000.00d, 7865437899l, true);
	}

}
