package com.xworkz.info.events;

public class LoginFailedException extends RuntimeException{
	
	public LoginFailedException() {
		
		System.err.println("Your Login has failed");
	}

}
