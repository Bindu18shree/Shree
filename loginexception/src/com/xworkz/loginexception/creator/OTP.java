package com.xworkz.loginexception.creator;

import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidOtpException;

public class OTP {

    public void userOtp(LoginDto loginDto) throws InvalidOtpException {

        int otpSent = loginDto.getOtp();

        if (String.valueOf(otpSent).length()==6){

            System.out.println("Valid OTP");
        }

        else{

            try {
                throw new InvalidOtpException();
            } finally {

                System.out.println("Check your OTP and try again");

            }
        }
    }
}
