package com.xworkz.info.boot;

import com.xworkz.info.events.*;

public class DLVerification {

	int upperCaseCount = 0;
	int emailUpperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public DLVerification(String password, Long phoneNumber, String name, String email, Integer batch)
			throws Exception {

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

			} catch (InvalidPasswordException | LoginFailedException exception) {

				exception.printStackTrace();
			} finally {

				System.out.println("Please check your connection and try again later");
			}
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("You have entered the valid contact number.");
		} else {

			try {

				throw new InvalidPhoneNumberException();

			} catch (InvalidPhoneNumberException | LoginFailedException login) {

				login.printStackTrace();
			}
		}

		if (name.length() == 8 && name.matches("^[a-zA-Z]+$")) {

			System.out.println("You have entered the valid Name");
		}

		else {

			try {

				throw new InvalidUserNameException();
			}

			catch (InvalidUserNameException | LoginFailedException e) {

				e.printStackTrace();
			} finally {

				System.out.println("Please check your connection and try again later");
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

			} catch (InvalidEmailException | LoginFailedException failed) {

				failed.printStackTrace();
			} finally {

				System.out.println("Please check your connection and try again later");
			}

		}

		if (batch.toString().contains("234")) {

			System.out.println("You have entered the valid batch number");
		}

		else {

			try {

				throw new InvalidBatchException();

			} catch (InvalidBatchException | LoginFailedException loginfailed) {

				loginfailed.printStackTrace();
			} finally {

				System.out.println("Please check your connection and try again later");
			}

		}
	}

}
