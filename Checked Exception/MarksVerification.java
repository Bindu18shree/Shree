package com.xworkz.checkedexception.boot;

import com.xworkz.checkedexception.events.MarksVerificationException;

public class MarksVerification {

		int upperCaseCount = 0;
		int numberCount = 0;
		int specialCharCount = 0;
		String specialCharacters = "!@#$%^&*";

		public MarksVerification(int age, String password, Long phoneNumber, String name, String email, Integer batch) throws Exception{

			if (age > 6 && age < 10) {

				System.out.println("You are valid to join the 1st std");
			} else {

				MarksVerificationException.age();
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

				MarksVerificationException.password();
			}

			String contactNumber = phoneNumber.toString();

			if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

				System.out.println("Valid contact number");
			} else {

				MarksVerificationException.number();
			}

			if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

				System.out.println("Valid Name");
			}

			else {

				MarksVerificationException.name();
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

				MarksVerificationException.email();
			}

			if (batch.toString().contains("28")) {

				System.out.println("The batch is correct");
			}

			else {

				MarksVerificationException.batch();
				throw new MarksVerificationException();
			}
		}

	}

