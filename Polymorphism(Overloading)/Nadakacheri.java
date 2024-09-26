package com.xworkz.nadakacheri.boot;

public class Nadakacheri {
	
	// Constructor Overloading
	public Nadakacheri() {
		System.out.println("This is no argumental constructor");
	}
	
	public Nadakacheri(String alsoKnownAs) {
		System.out.println("Nadakacheri is also known as :" +alsoKnownAs);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot) {
		System.out.println("Some of the services are also made available through the online portal :" +isOnlineServiceAvailableOrNot);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline) {
		System.out.println("Number of online service provided :" +noOfServicesProvidedInOnline);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt) {
		System.out.println("Nadakacheri opens(AM) at :" +opensAt);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate) {
		System.out.println("Birth and Death certificates are called e-janma :" +birthAndDeathCertificate);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate, long directorateAddressPincode) {
		System.out.println("Directorate Address Pincode :" +directorateAddressPincode);
	}
	
	public Nadakacheri(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate, long directorateAddressPincode, double onlineServiceCharges) {
		System.out.println("Online service charges for all the services :" +onlineServiceCharges);
	}
	
	
	// Method Overloading
	public String atalajiJanasnehiKendra() {
		return "This in no argumental method";	
	}
	
	public String atalajiJanasnehiKendra(String alsoKnownAs) {
		return alsoKnownAs;
	}
	
	public boolean atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot) {
		return isOnlineServiceAvailableOrNot;
	}
	
	public int atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline) {
		return noOfServicesProvidedInOnline;
	}
	
	public float atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt) {
		return opensAt;
	}
	
	public char atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate) {
		return birthAndDeathCertificate;
	}
	
	public long atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate, long directorateAddressPincode) {
		return directorateAddressPincode;
	}
	
	public double atalajiJanasnehiKendra(String alsoKnownAs, boolean isOnlineServiceAvailableOrNot, int noOfServicesProvidedInOnline, float opensAt, char birthAndDeathCertificate, long directorateAddressPincode, double onlineServiceCharges) {
		return onlineServiceCharges;
	}
}
 