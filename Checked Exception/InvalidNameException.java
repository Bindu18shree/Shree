package com.xworkz.checkedexception.events;

public class InvalidNameException extends Exception{
	
	
	public InvalidNameException() {

		System.err.println("Please check your name, it must contain only 8 characters & it must not include any numbers & special characters.");
	}

}
