package com.xworkz.details.events;

public class InvalidPhoneNumberException extends RuntimeException{
	
	public InvalidPhoneNumberException() {

		System.err.println("Invalid phone number, it must include 10 numbers & must start with digit 9");
	}

}
