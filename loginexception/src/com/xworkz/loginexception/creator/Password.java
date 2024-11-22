package com.xworkz.loginexception.creator;

import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidPasswordException;
import com.xworkz.loginexception.event.LoginFailedException;

public class Password {

    int upperCaseCount = 0;
    int specialCharCount = 0;
    String specialCharacters = "!@#$%^&*";

    public void passwordOfUSer(LoginDto loginDto){

        String userPassword = loginDto.getPassword();

        for (char c : userPassword.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCaseCount++;
            }
        }
        for (char specialChar : userPassword.toCharArray()) {
            if (specialCharacters.contains(Character.toString(specialChar))) {
                specialCharCount++;
            }
        }
        if (userPassword.length() == 8 && upperCaseCount == 1 && specialCharCount == 1) {
            System.out.println("Valid password.");
        }
        else {

            try {
                throw new InvalidPasswordException();
            } catch (InvalidPasswordException e) {

                System.err.println("Invalid Password, it must include only 8 characters with 1 uppercase & specialcharacter");

            } catch (LoginFailedException login){

                System.err.println("Login Failed");
            }
        }
    }
}
