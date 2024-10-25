package com.xworkz.info.boot;

import com.xworkz.info.events.*;

public class HallTicketVerification {

	int upperCaseCount = 0;
	int emailUpperCaseCount = 0;
	int numberCount = 0;
	int specialCharCount = 0;
	String specialCharacters = "!@#$%^&*";

	public HallTicketVerification(String password, Long phoneNumber, String name, String email, Integer batch)
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

			} catch (InvalidPasswordException exception) {

				exception.printStackTrace();

			} catch (LoginFailedException e) {

				e.printStackTrace();
			}
		}

		String contactNumber = phoneNumber.toString();

		if (contactNumber.length() == 10 && contactNumber.startsWith("9")) {

			System.out.println("You have entered the valid contact number.");
		} else {

			try {

				throw new InvalidPhoneNumberException();

			} catch (InvalidPhoneNumberException invalid) {

				invalid.printStackTrace();

			} catch (LoginFailedException login) {

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

			catch (InvalidUserNameException invalidname) {

				invalidname.printStackTrace();

			}

			catch (LoginFailedException e) {

				e.printStackTrace();
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

			} catch (InvalidEmailException invalidEmail) {

				invalidEmail.printStackTrace();
			}

			catch (LoginFailedException failed) {

				failed.printStackTrace();
			}
		}

		if (batch.toString().contains("294")) {

			System.out.println("You have entered the valid batch number");
		}

		else {

			try {

				throw new InvalidBatchException();

			} catch (InvalidBatchException invalidBatch) {

				invalidBatch.printStackTrace();
			}

			catch (LoginFailedException except) {

				except.printStackTrace();
			}
		}
	}

}
