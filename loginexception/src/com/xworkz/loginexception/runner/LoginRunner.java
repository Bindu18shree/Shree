package com.xworkz.loginexception.runner;

import com.xworkz.loginexception.creator.*;
import com.xworkz.loginexception.dto.LoginDto;
import com.xworkz.loginexception.event.InvalidOtpException;
import com.xworkz.loginexception.event.InvalidUserNameException;


public class LoginRunner {
    public static void main(String[] args) {

        LoginDto loginDto = new LoginDto("Bindu", "BinduShree@gmail.com", 98564737834L, "Aghfdj@d", 456783);

        UserName userName = new UserName();
        Email email = new Email();
        ContactNumber contactNumber = new ContactNumber();
        Password password = new Password();
        OTP otp = new OTP();

        userName.login(loginDto);
        email.emailOfTheUSer(loginDto);
        contactNumber.number(loginDto);
        password.passwordOfUSer(loginDto);
        try {
            otp.userOtp(loginDto);
        } catch (InvalidOtpException e) {

            System.out.println("Invalid OTP");
        }


    }
}