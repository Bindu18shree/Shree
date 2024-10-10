package com.xworkz.resorts.boot;

public interface Resort {
	
	
	static String resortName(String name) {
		return name;
	}
	
	static String resortLocation(String location) {
		return location;
	}
	
	static String resortAddress(String address) {
		return address;
	}
	
	static int resortpincode(int pincode) {
		return pincode;
	}
	
	static long contactNumberOfResort(long cntctNumber) {
		return cntctNumber;
	}
	
	static String resortContactMailId(String mailId) {
		return mailId;
	}
	
	static int accomodationCategories(int noOfCategoriesInAccomodation) {
		return noOfCategoriesInAccomodation;
	}
	
	static String resortReservationsMailId(String mailIdForReservations) {
		return mailIdForReservations;
	}
	
	static int resortWorkDays(int workDays) {
		return workDays;
	}
	
	static long bookingContactNumber(long cntctNumberForBooking) {
		return cntctNumberForBooking;
	}
	
	
	default void placeToUnwind() {
		System.out.println("There's a river side BBQ in the resort");
	}
	
	default void walk() {
		System.out.println("Nature walk is availabe in the resort");
	}
	
	default void trekking() {
		System.out.println("Trekking to Ballalarayana Durg Fort");
	}
	
	default void falls() {
		System.out.println("Kodige falls is near to the fort while trekking");
	}
	
	default void temple() {
		System.out.println("Shri Kalaseshwara Swami temple is near by to the resort");
	}
	
	default void hillStation() {
		System.out.println("Kyatanamakki Hill station is near to the resort");
	}
	
	default void viewPoint() {
		System.out.println("Maidaadi View Point is the view of mist-filled mountains");
	}
	
	default void hills() {
		System.out.println("Devaramane Hills is the adventurous, breathtaking view and soothing ambience");
	}
	
	default void exitingThingsToDo() {
		System.out.println("Spider walk is one of the adventurous things to do in the resort");
	}
	
	default void familyPackages() {
		System.out.println("Family packages are avaialable in the resort");
	}

}
