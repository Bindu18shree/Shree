package com.xworkz.loginexception.creator;

import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidContactNumberException;

public class ContactNumber {

    public void number(LoginDto loginDto){

        long mobileNo = loginDto.getContactNumber();

        if(String.valueOf(mobileNo).length()==10){

            System.out.println("Valid contact number");
        }
        else{

            try {
                throw new InvalidContactNumberException();
            } catch (InvalidContactNumberException e) {
                System.err.println("Invalid contact number, it must include 10 digits");
            } finally {
                System.err.println("Provide valid Contact number");
            }
        }
    }
}
