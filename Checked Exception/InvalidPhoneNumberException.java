package com.xworkz.checkedexception.events;

public class InvalidPhoneNumberException extends Exception{
	
	public InvalidPhoneNumberException() {

		System.err.println("Invalid phone number, it must include 10 numbers & must start with digit 9");
	}
}
