package com.xworkz.checkedexception.boot;

import com.xworkz.checkedexception.events.PanVerificationException;

public class PanVerification {
	
	int upperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public PanVerification(int age, String password, Long phoneNumber, String name, String email, Integer batch) throws Exception{

		if (age > 18 && age < 50) {

			System.out.println("You are eligible to apply your pan card.");
		} else {

			PanVerificationException.age();
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

			PanVerificationException.password();
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("Contact number is valid");
		} else {

			PanVerificationException.number();
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("Name provided is valid");
		}

		else {

			PanVerificationException.name();
		}

		for (char upperCase : email.toCharArray()) {

			if (Character.isUpperCase(upperCase)) {

				upperCaseCount++;
			}

		}

		if (email.contains("@gmail.com") && email.length() == 18 && upperCaseCount == 1) {

			System.out.println("Entered valid email");
		}

		else {

			PanVerificationException.email();
		}

		if (batch.toString().contains("234")) {

			System.out.println("The batch is correct");
		}

		else {

			PanVerificationException.batch();
			throw new PanVerificationException();
		}
	}


}
