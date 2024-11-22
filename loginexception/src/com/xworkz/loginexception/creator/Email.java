package com.xworkz.loginexception.creator;

import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidEmailException;
import com.xworkz.loginexception.event.InvalidUserNameException;
import com.xworkz.loginexception.event.LoginFailedException;

public class Email {

    public void emailOfTheUSer(LoginDto loginDto){

        String userEmail = loginDto.getEmail();


        if (userEmail.length()<20 && userEmail.contains("@gmail.com")){

            System.out.println("Valid email");
        }

        else{

            try {
                throw new InvalidEmailException();
            } catch (InvalidEmailException | LoginFailedException e) {
                System.err.println("Email must include @gmail.com & should be less than 20 characters");
            }
        }
    }


}
