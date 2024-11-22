package com.xworkz.loginexception.event;

public class LoginFailedException extends RuntimeException{

    public LoginFailedException(){

        System.err.println("Login Failed");
    }
}
