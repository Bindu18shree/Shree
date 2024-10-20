package com.xworkz.details.events;

public class AdhaarVerificationException extends RuntimeException {

	public AdhaarVerificationException() {

		System.err.println("You are not allowed to apply your adhaar card");
	}

	public static void age() {

		System.err.println("You should be more than 18 and less than 50 to apply your Adhaar card");
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
