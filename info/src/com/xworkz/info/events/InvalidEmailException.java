package com.xworkz.info.events;

public class InvalidEmailException extends Exception{
	
public InvalidEmailException() {
		
		System.err.println("Invalid email id, it must contain @gmail.com along with only 8 characters & one letter must be uppercase");
	}

}
