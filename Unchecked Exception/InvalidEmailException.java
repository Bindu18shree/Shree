package com.xworkz.details.events;

public class InvalidEmailException extends RuntimeException{
	
public InvalidEmailException() {
		
		System.err.println("Invalid email id, it must contain @gmail.com along with only 8 characters & one letter must be uppercase");
	}


}
