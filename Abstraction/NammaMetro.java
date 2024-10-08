package com.xworkz.metro.boot;

public abstract class NammaMetro {
	
	public abstract void baggageScanners();
	
	
	public abstract void securityCheck();
	
	
	public abstract void lifts();
	
	
	public abstract void womenCoach();
	
	
	public abstract void reservedSeatsForSeniorCitizensinEveryCoach();
	
	
	public abstract void reservedSeatsForPhysicallyDisabledPersoninEveryCoach();
	
	
	public abstract void reservedSeatsForPregnantLadiesInEveryCoach();
	
	
	public abstract void reservedSeatsForLadiesWithChildInEveryCoach();
	
	
	public void tickets() {
		
		System.out.println("There's a ticket counter in all the metro stations");
	}
	
	public void cardTopUpTerminal() {
		
		System.out.println("There's a card top up terminal present to top up the card");
	}
	
	public void entryGates() {
		
		System.out.println("Entry gates are present where it restricts to scan the coins or card");
	}
	
	public void elevatorStairs() {
		
		System.out.println("Elevetar stairs are present in metro");
	}
	
	
	
	

}
