package com.xworkz.loginexception.event;

public class InvalidEmailException extends Exception {

    public InvalidEmailException(){

        System.err.println("Invalid email");
    }
}
