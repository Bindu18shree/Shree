package com.xworkz.loginexception.event;

public class InvalidOtpException extends Exception{

    public InvalidOtpException(){

        System.err.println("Invalid OTP");
    }
}
