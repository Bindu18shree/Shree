package com.xworkz.dolls.runner;

import com.xworkz.dolls.boot.*;

public class BarbieRunner {
	
	public static void main(String[] args) {
		
		Barbie barbie = new BarbieDoll();
		
		BarbieDoll barbiedoll = (BarbieDoll) barbie;
		
		barbiedoll.modelNumber("HJR93-0");
		barbiedoll.price("Barbie", 413.7896d);
		barbiedoll.weight("Barbie", 413.7894d, 125.65f);
		barbiedoll.batteryRequirement("Barbie", 413.7894d, 125.65f,false);
		barbiedoll.puzzlePieces("Barbie", 413.7894d, 125.65f, false, 1);
		barbiedoll.recommendedAge("Barbie", 413.789d, 125.65f, false, 1, 32);	
	}

}
