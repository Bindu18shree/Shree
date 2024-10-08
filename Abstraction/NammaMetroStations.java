package com.xworkz.metro.boot;

public class NammaMetroStations extends NammaMetro{
	

	
    public void baggageScanners() {
    	
    	System.out.println("Every stations should have baggage scanners");
    	
    }
	
	
	public void securityCheck() {
		
		System.out.println("Security check will be done by female Guards and male guards to the individuals");
		
	}
	
	
	public void lifts() {
		
		System.out.println("Lifts are available in every metro station");
		
	}
	
	
	public void womenCoach() {
		
		System.out.println("Every metro train has one complete coach reserved for only womens.");
	}
	
	
	public void reservedSeatsForSeniorCitizensinEveryCoach() {
		
		System.out.println("Some seats in every metro coach is reserved for senior citizens");
	}
	
	
	public void reservedSeatsForPhysicallyDisabledPersoninEveryCoach() {
		
		System.out.println("Some seats are reserved in every coach of metro for physically disabled people");
	}
	
	
	public void reservedSeatsForPregnantLadiesInEveryCoach() {
		
		
	}
	
	
	public void reservedSeatsForLadiesWithChildInEveryCoach() {
		
		
	}
	
	@Override
	public void tickets() {
		
		System.out.println("There's a ticket counter in all the metro stations");
	}
	@Override
	public void cardTopUpTerminal() {
		
		System.out.println("There's a card top up terminal present to top up the card");
	}
	@Override
	public void entryGates() {
		
		System.out.println("Entry gates are present where it restricts to scan the coins or card");
	}
	@Override
	public void elevatorStairs() {
		
		System.out.println("Elevetar stairs are present in metro");
	}

}
