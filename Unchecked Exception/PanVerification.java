package com.xworkz.details.boot;

import com.xworkz.details.events.*;

public class PanVerification {

	int upperCaseCount = 0;
	int emailUpperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public PanVerification(int age, String password, Long phoneNumber, String name, String email, Integer batch) {

		if (age > 18 && age < 50) {

			System.out.println("You are eligible to apply your pan card.");
		} else {

			throw new InvalidAgeException();
		}

		for (char c : password.toCharArray()) {

			if (Character.isUpperCase(c)) {

				upperCaseCount++;
			}

		}

		for (char ch : password.toCharArray()) {

			if (Character.isDigit(ch)) {

				numberCount++;
			}
		}

		for (char specialChar : password.toCharArray()) {

			if (specialCharacters.contains(Character.toString(specialChar))) {

				specialCharCount++;
			}
		}

		if (password.length() == 7 && upperCaseCount == 1 && numberCount == 2 && specialCharCount == 1) {

			System.out.println("Valid password");

		}

		else {

			throw new InvalidPasswordException();
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("Contact number is valid");
		} else {

			throw new InvalidPhoneNumberException();
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("Name provided is valid");
		}

		else {

			throw new InvalidNameException();
		}

		for (char upperCase : email.toCharArray()) {

			if (Character.isUpperCase(upperCase)) {

				emailUpperCaseCount++;
			}

		}

		if (email.contains("@gmail.com") && email.length() == 18 && emailUpperCaseCount == 1) {

			System.out.println("Entered valid email id");
		}

		else {

			throw new InvalidEmailException();
		}

		if (batch.toString().contains("234")) {

			System.out.println("The batch is correct");
		}

		else {

			throw new InvalidBatchException();
		}
	}

}
