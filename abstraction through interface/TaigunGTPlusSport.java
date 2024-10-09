package com.xworkz.volkswagencars.boot;

public class TaigunGTPlusSport implements Taigun, TaigunGTLine {

	
	public String getModel() {
		
		return model;
	}

	
	public float getEngine() {
	
		return engine;
	}

	
	public int getDisplacement() {

		return displacement;
	}
	
	
	public TaigunGTPlusSport() {
		this(17.4989d);
	}
	
	public TaigunGTPlusSport(double cost) {
		System.out.println("Cost of the Taigun GT Plus sport :" +cost);
	}

}
