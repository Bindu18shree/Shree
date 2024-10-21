package com.xworkz.details.events;

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException() {

		System.err.println("Your age should be more than 18 and less than 50 ");
	}
}
