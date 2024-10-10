package com.xworkz.hotel.boot;

public interface Hotel {

	String name = "Paakashala";
	boolean isItVegOrNonVegHotel = true;
	String owner = "Shri KN Vasudeva Adiga";
	boolean isChatsAvailable = true;
	int noOfBranches = 28;
	String corporateOfficeNo = "#56/57";
	int corporateOfficepPincode = 560078;
	long cntctNoOfCorporateOffice = 8105924449l;
	String mailIdOfCorporateOffice = "contact@paakashala.com";
	boolean isOutDoorCateringAvaialble = true;

	
	static String hotelName() {

		return name;
	}

	static boolean isHotelVegOrNonVeg() {

		return isItVegOrNonVegHotel;
	}

	static String hotelFounder() {

		return owner;
	}

	static boolean isChatsAvaialableInHotel() {

		return isChatsAvailable;
	}

	static int noOfHotelBranches() {

		return noOfBranches;
	}

	static String numberOfCorporateOffice() {

		return corporateOfficeNo;
	}

	static int pincodeOfCorporateOffice() {

		return corporateOfficepPincode;
	}

	static long corporateOfficeCntctNo() {

		return cntctNoOfCorporateOffice;
	}

	static String corporateOfficeMailId() {

		return mailIdOfCorporateOffice;
	}

	static boolean isCateringAvailable() {

		return isOutDoorCateringAvaialble;
	}

	
	default void PartHall(boolean isPartyHallAvailableInHotel) {

		System.out.println("Party Hall is available :" + isPartyHallAvailableInHotel);
	}
	
	default void partyHallCntctNumber(long cntctNumberOfPartHall) {
		
		System.out.println("Contact number of the party hall :" +cntctNumberOfPartHall);
	}
	
	default void partHallMailId(String mailIdOfPartyHall) {
		
		System.out.println("Mail id of the party hall :" +mailIdOfPartyHall);
	}
	
	default void partHallBranches(int noOfPartyHallBranches) {
		
		System.out.println("Number of party hall branches :" +noOfPartyHallBranches);
	}
	
	default void opensAt(float hotelOpensAt) {
		
		System.out.println("Hotel opens at(AM) :" +hotelOpensAt);
	}
	
	default void closesAt(float hotelClosesAt) {
		
		System.out.println("Hotel closes at(PM) :" +hotelClosesAt);
	}
	
	default void hotelDirector(String directorName) {
		
		System.out.println("Director of the Hotel is :" +directorName);
	}
	
	default void hotelVicePresident(String vicePresidentName) {
		
		System.out.println("Vice President of the Hotel :" +vicePresidentName);
	}
	
	default void qualityControlManager(String qualityControlManagerName) {
		
		System.out.println("Quality control manager of the hotel :" +qualityControlManagerName);
	}
	
	default void accountsManager(String nameOfAccountsManager) {
		
		System.out.println("Accounts manager of the Hotel :" +nameOfAccountsManager);
	}

}
