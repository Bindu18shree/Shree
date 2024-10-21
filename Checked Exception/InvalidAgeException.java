package com.xworkz.checkedexception.events;

public class InvalidAgeException extends Exception{
	
	public InvalidAgeException(){

		System.err.println("Your age should be more than 18 and less than 50 ");
	}

	
}
