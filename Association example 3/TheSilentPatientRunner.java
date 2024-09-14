package com.xworkz.books.runner;

import com.xworkz.books.boot.Publisher;
import com.xworkz.books.boot.TheSilentPatient;

public class TheSilentPatientRunner {
	
	public static void main(String [] args) {
		
		Publisher publisher = new Publisher("Orion", 2019);
		
		TheSilentPatient thesilentpatient = new TheSilentPatient("Alex Michaelides", 261.00f, 1409181634l, 352 , publisher);
		
		System.out.println("The author of the book ==" +thesilentpatient.getAuthor());
		
		System.out.println("Price of the book ==" +thesilentpatient.getPrice());
		
		System.out.println("ISBN-10 of the book ==" +thesilentpatient.getIsbn10());
		
		System.out.println("Print length of the book ==" +thesilentpatient.getPrintLength());
		
		System.out.println("Publisher of the book ==" +thesilentpatient.publisher.getPublisher());
		
		System.out.println("Publishing year ==" +thesilentpatient.publisher.getPublishingYear());
		
		
		
	}
	

}
