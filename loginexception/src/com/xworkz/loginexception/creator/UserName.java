package com.xworkz.loginexception.creator;

import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidUserNameException;

public class UserName {

    public void login(LoginDto loginDto) {

        String nameOfTheUSer = loginDto.getUserName();

        if(nameOfTheUSer.length() > 3 && nameOfTheUSer.length() < 15){

            System.out.println("Valid userName");
        }
        else{

            try {
                throw new InvalidUserNameException("Invalid username");
            } catch (InvalidUserNameException e) {

                System.err.println("Please provide valid username");

            }


        }

    }

}
