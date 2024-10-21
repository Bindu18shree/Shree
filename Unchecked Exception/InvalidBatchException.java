package com.xworkz.details.events;

public class InvalidBatchException extends RuntimeException {

	public InvalidBatchException() {

		System.err.println("You have entered the wrong batch number");
	}

}
