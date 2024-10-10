package com.xworkz.hotel.runner;

import com.xworkz.hotel.boot.Hotel;
import com.xworkz.hotel.boot.HotelLocations;

public class HotelRunner {
	

	public static void main(String[] args) {
		
		System.out.println("Name of the Hotel :" +Hotel.hotelName());
		
		System.out.println("Hotel serves pure Veg food :" +Hotel.isHotelVegOrNonVeg());
		
		System.out.println("Founder of the Hotel :" +Hotel.hotelFounder());
		
		System.out.println("Chats are available in the Hotel :" +Hotel.isChatsAvaialableInHotel());
		
		System.out.println("Total Number of branches of the Hotel :" +Hotel.noOfHotelBranches());
		
		System.out.println("Corporate Office number of the Hotel :" +Hotel.numberOfCorporateOffice());
		
		System.out.println("Pincode of the Hotel corporate office :" +Hotel.pincodeOfCorporateOffice());
		
		System.out.println("Contact Number of the Hotel corporate Office :" +Hotel.corporateOfficeCntctNo());
		
		System.out.println("Mail Id of the hotel Corporate office :" +Hotel.corporateOfficeMailId());
		
		System.out.println("Outside catering service is given by hotel :" +Hotel.isCateringAvailable());
		
		
		HotelLocations locations = new HotelLocations();
		
		locations.PartHall(true);
		locations.partyHallCntctNumber(8105854449l);
		locations.partHallMailId("contact@paakashala.com");
		locations.partHallBranches(4);
		locations.opensAt(9.35f);
		locations.closesAt(10.35f);
		locations.hotelDirector("Vinoda V Adiga");
		locations.hotelVicePresident("Surendra Hegde");
		locations.qualityControlManager("Surya Kumar");
		locations.accountsManager("Sendil Kumar C");
		
	}

}
