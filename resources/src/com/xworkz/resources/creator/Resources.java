package com.xworkz.resources.creator;

public class Resources implements AutoCloseable{

    public  void connect(){

        System.out.println("This is create method");
    }

    public void use(){

        System.out.println("This is use method");
    }

    public void close(){

        System.out.println("This is out method");
    }

}