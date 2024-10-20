package com.xworkz.checkedexception.events;

public class PanVerificationException extends Exception{
	
	public PanVerificationException() {

		System.err.println("You are not eligible to apply your pan card,please check the requirements.");
	}

	public static void age() {

		System.err.println("You must be >18 and <50 to apply your pan card");
	}

	public static void password() {

		System.err.println(
				"Password is not valid,it must contain atleast 7 characters, 1 uppercase, 2 numbers and 1 special characters ");
	}

	public static void number() {

		System.err.println("Invalid phone number");
	}

	public static void name() {

		System.err.println(
				"Invalid name,it shouldn't contain any special characters and numbers and must contain 8 characters only ");
	}

	public static void email() {

		System.err.println("The Email you have provided is invalid.");
	}

	public static void batch() {

		System.err.println("Entered Invalid batch number.");
	}

}
