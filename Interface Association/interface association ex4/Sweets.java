package com.xworkz.sweets.boot;

import com.xworkz.sweets.bridge.SweetInterface;

public class Sweets {
	
	public SweetInterface interface1;
	

	public SweetInterface display(SweetInterface interface1) {
		this.interface1 = interface1;
		return interface1;
	}
	
	public SweetInterface execute(SweetInterface interface1) {
		 return interface1;
	}

}
