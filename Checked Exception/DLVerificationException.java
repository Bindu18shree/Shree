package com.xworkz.checkedexception.events;

public class DLVerificationException extends Exception{
	
	public DLVerificationException() {

		System.err.println("You are not allowed to apply your DL");
	}

	public static void age() {

		System.err.println("Please meet the minimum age requirement to apply DL");
	}

	public static void password() {

		System.err.println(
				"Password is invalid,it must contain atleast 7 characters, 1 uppercase, 2 numbers and 1 special characters ");
	}

	public static void number() {

		System.err.println("Invalid contact number");
	}

	public static void name() {

		System.err.println(
				"Invalid name,it shouldn't contain any special characters and numbers and must contain 8 characters only ");
	}

	public static void email() {

		System.err.println("Please enter valid Email");
	}

	public static void batch() {

		System.err.println("You have entered the wrong batch,please do re-check");
	}

}
