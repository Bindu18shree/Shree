package com.xworkz.saree.boot;

import com.xworkz.saree.bridge.Saree;

public class SareeTypes {
	
	public Saree saree;
	
	
	public Saree display(Saree saree) {
		this.saree = saree;
		return saree;
	}
	
	
	public Saree execute(Saree saree) {
		return saree;
	}

}
