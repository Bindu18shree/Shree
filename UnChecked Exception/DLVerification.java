package com.xworkz.details.boot;

import com.xworkz.details.events.DLVerificationException;

public class DLVerification {

	int upperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public DLVerification(int age, String password, Long phoneNumber, String name, String email, Integer batch) {

		if (age > 18 && age < 50) {

			System.out.println("You are valid to apply your DL");
		} else {

			DLVerificationException.age();
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

			System.out.println("Password is valid");

		}

		else {

			DLVerificationException.password();
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("Valid contact number");
		} else {

			DLVerificationException.number();
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("Valid Name");
		}

		else {

			DLVerificationException.name();
		}

		for (char upperCase : email.toCharArray()) {

			if (Character.isUpperCase(upperCase)) {

				upperCaseCount++;
			}

		}

		if (email.contains("@gmail.com") && email.length() == 18 && upperCaseCount == 1) {

			System.out.println("Valid Email");
		}

		else {

			DLVerificationException.email();
		}

		if (batch.toString().contains("474")) {

			System.out.println("The batch is correct");
		}

		else {

			DLVerificationException.batch();
			throw new DLVerificationException();
		}
	}

}
