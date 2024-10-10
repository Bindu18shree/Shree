package com.xworkz.resorts.runner;

import com.xworkz.resorts.boot.Resort;
import com.xworkz.resorts.boot.ResortRiverMist;

public class ResortRunner {
	
	public static void main(String[] args) {
		
		System.out.println("Name of the resort :" +Resort.resortName("RiverMistResorts"));
		System.out.println("Location :" +Resort.resortLocation("Mudigere"));
		System.out.println("Address :" +Resort.resortAddress("Madugundi,Sunkasale PO Mudigere ,Karnatak"));
		System.out.println("Pincode :" +Resort.resortpincode(560035));
		System.out.println("Contact number:"+Resort.contactNumberOfResort(8798765980l));
		System.out.println("Contact mail id :"+Resort.resortContactMailId("contact@rivermistresorts.com"));
		System.out.println("Total number of categories in accomodations:"+Resort.accomodationCategories(8));
		System.out.println("Maild id of the resort for reservations:"+Resort.resortReservationsMailId("reservations@rivermistresorts.com"));
		System.out.println("Resort works on :" +Resort.resortWorkDays(365));
		System.out.println("contact number for booking :" +Resort.bookingContactNumber(8756432809l));
		
		
		ResortRiverMist mist = new ResortRiverMist();
		
		mist.viewPoint();
		mist.trekking();
		mist.temple();
		mist.placeToUnwind();
		mist.hillStation();
		mist.hills();
		mist.familyPackages();
		mist.falls();
		mist.exitingThingsToDo();
		mist.walk();
		
		
	}

}
