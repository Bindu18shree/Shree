package com.xworkz.metro.runner;

import com.xworkz.metro.boot.NammaMetroStations;

public class NammaMetroRunner {
	
	public static void main(String[] args) {
		
		NammaMetroStations stations = new NammaMetroStations();
		
		stations.baggageScanners();
		
		stations.securityCheck();
		
		stations.lifts();
		
		stations.womenCoach();
		
		stations.reservedSeatsForSeniorCitizensinEveryCoach();
		
		stations.reservedSeatsForPhysicallyDisabledPersoninEveryCoach();
		
		stations.tickets();
		
		stations.cardTopUpTerminal();
		
		stations.entryGates();
		
		stations.elevatorStairs();
	}

}
