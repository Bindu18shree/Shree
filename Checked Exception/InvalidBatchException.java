package com.xworkz.checkedexception.events;

public class InvalidBatchException extends Exception{
	
	public InvalidBatchException() {
		
		System.err.println("You have entered the wrong batch number");
	}

}