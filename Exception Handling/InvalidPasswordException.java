package com.xworkz.logindetails.events;

public class InvalidPasswordException extends Exception {

	public InvalidPasswordException() {

		System.err.println(
				"Incorrect password, it must include only 7 characters along with one letter uppercase, two numbers & one special character.");
	}

}
