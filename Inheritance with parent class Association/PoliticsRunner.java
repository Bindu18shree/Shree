package com.xworkz.politics.runner;

import com.xworkz.politics.boot.NationalParties;
import com.xworkz.politics.boot.PrimeMinister;

public class PoliticsRunner {
	
	public static void main(String [] args) {
		
		PrimeMinister primeminister = new PrimeMinister();
		
		primeminister.setName("Narendra Modi");
		primeminister.setAge(74);
		primeminister.setNumberOfYearsPassedStartedAsPM(9.5f);
		
		
		NationalParties nationalparties = new NationalParties();
		
		nationalparties.setCountry("India");
		nationalparties.setNoOfNationalParties(6);
		nationalparties.setPrimeMinister(primeminister);
		nationalparties.setPartyName("Bharathiya Janata Party");
		nationalparties.setSymbol("Lotus");
		nationalparties.setFoundedYear(1980);
		
		System.out.println("Country Name :" +nationalparties.getCountry());
		System.out.println("Number of national parties in the country :" +nationalparties.getNoOfNationalParties());
		System.out.println("Name of the Prime Minister :" +nationalparties.getPrimeMinister().getName());
		System.out.println("Age :" +nationalparties.getPrimeMinister().getAge());
		System.out.println("Prime Minister since(years) :" +nationalparties.getPrimeMinister().getNumberOfYearsPassedStartedAsPM());
		System.out.println("Party Name :" +nationalparties.getPartyName());
		System.out.println("Symbol of the party :" +nationalparties.getSymbol());
		System.out.println("Party was founded in the year :" +nationalparties.getFoundedYear());
	}

}
