package com.xworkz.loginexception.event;

public class InvalidPasswordException extends Exception{

    public InvalidPasswordException(){

        System.err.println("Invalid password. It must contain atleast 8 characters and must include atleast 1 uppercase, and  1 character ");


    }

}
