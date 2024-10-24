package com.xworkz.logindetails.boot;

import com.xworkz.logindetails.events.*;

public class IncomeCertificateVerification {

	int upperCaseCount = 0;
	int emailUpperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public IncomeCertificateVerification(int age, String password, Long phoneNumber, String name, String email,
			Integer batch) {

		if (age > 18 && age < 50) {

			System.out.println("Your age is valid to apply the Adhaar card");
		} else {

			try {
				throw new InvalidAgeException();
			} catch (InvalidAgeException exception) {

				exception.printStackTrace();
			}
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

			System.out.println("You have entered the valid password.");

		}

		else {

			try {
				throw new InvalidPasswordException();
			} catch (InvalidPasswordException invalidpassword) {

				invalidpassword.printStackTrace();
			}
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("You have entered the valid contact number.");
		} else {

			try {
				throw new InvalidPhoneNumberException();
			} catch (InvalidPhoneNumberException invalidcontact) {

				invalidcontact.printStackTrace();
			}
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("You have entered the valid Name");
		}

		else {

			try {
				throw new InvalidNameException();
			} catch (InvalidNameException invalidname) {

				invalidname.printStackTrace();
			}
		}

		for (char emailUpperCase : email.toCharArray()) {

			if (Character.isUpperCase(emailUpperCase)) {

				emailUpperCaseCount++;

			}

		}

		if (email.contains("@gmail.com") && email.length() == 18 && emailUpperCaseCount == 1) {

			System.out.println("You have entered the valid email id");
		}

		else {

			try {
				throw new InvalidEmailException();
			} catch (InvalidEmailException invalidemail) {

				invalidemail.printStackTrace();
			}
		}

		if (batch.toString().contains("234")) {

			System.out.println("You have entered the valid batch number");
		}

		else {

			try {
				throw new InvalidBatchException();
			} catch (InvalidBatchException invalidbatch) {

				invalidbatch.printStackTrace();
			}
		}
	}

}