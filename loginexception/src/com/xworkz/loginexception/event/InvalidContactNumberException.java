package com.xworkz.loginexception.event;

public class InvalidContactNumberException extends Exception{

    public InvalidContactNumberException(){

        System.err.println("Invalid contact number");
    }
}
