package com.xworkz.checkedexception.boot;

import com.xworkz.checkedexception.events.*;

public class DLVerification {
	
	int upperCaseCount = 0;
	int emailUpperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public DLVerification(int age, String password, Long phoneNumber, String name, String email, Integer batch) throws Exception{

		if (age > 18 && age < 50) {

			System.out.println("Your age is valid to apply your DL");
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

			System.out.println("Password is valid");

		}

		else {

			throw new InvalidPasswordException();
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("Valid contact number");
		} else {

			throw new InvalidPhoneNumberException();
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("Valid Name");
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

			System.out.println("Valid Email");
		}

		else {

			throw new InvalidEmailException();
		}

		if (batch.toString().contains("474")) {

			System.out.println("The batch is correct");
		}

		else {

			
			throw new InvalidBatchException();
		}
	}


}
