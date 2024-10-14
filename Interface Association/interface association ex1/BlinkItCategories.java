package com.xworkz.blinkit.boot;

import com.xworkz.blinkit.bridge.BlinkIt;

public class BlinkItCategories {
	
	public BlinkIt blinkit;
	
	
	public BlinkIt display(BlinkIt blinkit) {
		this.blinkit = blinkit;
		return blinkit;
	}
	
	public BlinkIt execute(BlinkIt blinkit) {
		return blinkit;
	}
	
	

}
