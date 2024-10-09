package com.xworkz.volkswagencars.runner;

import com.xworkz.volkswagencars.boot.TaigunGTPlusSport;

public class TaigunRunner {
	
	public static void main(String[] args) {
		
		TaigunGTPlusSport taigungtplus = new TaigunGTPlusSport();
		
		System.out.println("Model of the Taigun GT plus and Taigun GT line:" +taigungtplus.getModel());
		
		System.out.println("Engine(TSI) of the Taigun GT plus and Taigun GT line:" +taigungtplus.getEngine());
		
		System.out.println("Displacement(cc) of Taigun GT plus and Taigun GT line:"+taigungtplus.getDisplacement());
		
		
	}

}
