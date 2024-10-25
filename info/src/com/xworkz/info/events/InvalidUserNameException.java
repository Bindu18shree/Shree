package com.xworkz.info.events;

public class InvalidUserNameException extends Exception{
	
	public InvalidUserNameException() {

		System.err.println(
				"Please check your name, it must contain only 8 characters & it must not include any numbers & special characters.");
	}

}
