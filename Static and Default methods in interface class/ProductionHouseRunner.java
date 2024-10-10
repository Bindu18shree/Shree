package com.xworkz.productionhouse.runner;

import com.xworkz.productionhouse.boot.PRKProductionHouse;
import com.xworkz.productionhouse.boot.ProductionHouse;

public class ProductionHouseRunner {
	
	public static void main(String[] args) {
		
		PRKProductionHouse house = new PRKProductionHouse();
		
		System.out.println("Name of the production house :" +house.name("PRK Productions"));
		
		System.out.println("Company type is :" +house.companyType("Private Limited Company"));
		
		System.out.println("Industry :" +house.industry("Motion pictures"));
		
		System.out.println("Production house was founded in the year :" +house.foundedYear(2017));
		
		System.out.println("Production was founded in the month :" +house.foundedMonth(07));
		
		System.out.println("Production house was founded in the date :" +house.foundedDate(20));
		
		System.out.println("Founder :" +house.founder("Puneeth RajKumar"));
		
		System.out.println("Head quarters of the Production house :" +house.headQuarters("Bangalore,India"));
		
		System.out.println("products :" +house.products("Film Production"));
		
		System.out.println("services :" +house.services("Film production and music"));
		
		
		ProductionHouse.subsidiaries();
		ProductionHouse.debutMovie();
		ProductionHouse.debutMovieYear();
		ProductionHouse.directorOfDebutMovie();
		ProductionHouse.starredMaleActors();
		ProductionHouse.starredFemaleActor();
		ProductionHouse.movieGenre();
		ProductionHouse.noOfMoviesProduced();
		ProductionHouse.movieProducedInThePresentYear();
		ProductionHouse.leadingActorsOfO2();
	}

}
