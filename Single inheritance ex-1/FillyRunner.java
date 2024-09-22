package com.xworkz.donkey.runner;

import com.xworkz.donkey.boot.Foal;

public class FillyRunner {
	
	public static void main(String [] args) {
		
		Foal foal = new Foal();
		
		System.out.println("Color of the Filly :" +foal.getColor());
		System.out.println("Filly is female :" +foal.isFillyMaleOrFemale());
		System.out.println("Age of the Foal :" +foal.getAge());
		System.out.println("Color of the Foal :" +foal.getColor());
		System.out.println("Foal is male :" +foal.isFoalMaleOrFemale());
	}

}
