package com.xworkz.sneakers.runner;

import com.xworkz.sneakers.boot.Sneakers;

public class SneakersRunner {
	
	public static void main(String [] args) {
		
		Sneakers sneakers = new Sneakers();
		Sneakers sneakers1 = new Sneakers("Nike");
		Sneakers sneakers2 = new Sneakers("Nike", 3649.9870d);
		Sneakers sneakers3 = new Sneakers("Nike", 3649.9870d, 3.5f);
		Sneakers sneakers4 = new Sneakers("Nike", 3649.9870d, 3.5f, 'B');
		Sneakers sneakers5 = new Sneakers("Nike", 3649.9870d, 3.5f, 'B', 28);
		Sneakers sneakers6 = new Sneakers("Nike", 3649.9870d, 3.5f, 'B', 28, 560093);
		Sneakers sneakers7 = new Sneakers("Nike", 3649.9870d, 3.5f, 'B', 28, 560093, false);
		
		sneakers.shoes();
		sneakers.shoes("Puma");
		sneakers.shoes("Puma", 3649.870d);
		sneakers.shoes("Adidas", 3649.9870d, 4.5f);
		sneakers.shoes("Red Tape", 3649.9870d, 4.5f, 'B');
		sneakers.shoes("Nike", 3649.9870d, 4.5f, 'B', 27);
		sneakers.shoes("Nike", 3649.9870d, 3.5f, 'B', 28, 560097);
		sneakers.shoes("Puma", 2349.9480d, 5.5f, 'W', 27, 560097, true);
		
	}

}
