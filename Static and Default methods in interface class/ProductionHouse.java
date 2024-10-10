package com.xworkz.productionhouse.boot;

public interface ProductionHouse {
	
	
	default String name(String productionHouseName) {
		
		return productionHouseName;
	}
	
	default String companyType(String typeOfCompany) {
		
		return typeOfCompany;
	}
	
	default String industry(String industryType) {
		
		return industryType;
	}
	
	default int foundedYear(int foundedInTheYear) {
		
		return foundedInTheYear;
	}
	
	default int foundedMonth(int foundedInTheMonth) {
		
		return foundedInTheMonth;
	}
	
	default int foundedDate(int foundedInTheDate) {
		
		return foundedInTheDate;
	}
	
	default String founder(String founderOfTheProductionHouse) {
		
		return founderOfTheProductionHouse;
	}
	
	default String headQuarters(String headQuartersOfTheProductionHouse) {
		
		return headQuartersOfTheProductionHouse;
	}
	
	default String products(String productsOfTheProductionHouse) {
		
		return productsOfTheProductionHouse;
	}
	
	default String services(String servicesFromProductionHouse) {
		
		return servicesFromProductionHouse;
	}
	
	
	static void subsidiaries() {
		
		System.out.println("Subsidiaries of the production house is PRK Audio");
	}
	
	static void debutMovie() {
		
		System.out.println("The production made its feature film debut with Kavaludaari");
	}
	
	static void debutMovieYear() {
		
		System.out.println("Debut Movie was released in the year 2016");
	}
	
	static void movieGenre() {
		
		System.out.println("Debut movie genre was neo-noir thriller film");
	}
	
	static void starredMaleActors() {
		
		System.out.println("Production house starred the actor Rishi and Anant Nag for their debut movie");
	}
	
	static void starredFemaleActor() {
		
		System.out.println("Production house starred the actress Roshini Prakash for their debut movie");
	}
	
	static void directorOfDebutMovie() {
		
		System.out.println("Director of the debut movie was Hemath Rao");
	}
	
	static void noOfMoviesProduced() {
		
		System.out.println("Total number of movies produced by production house till now is 10");
	}
	
	static void movieProducedInThePresentYear() {
		
		System.out.println("Movie produced by production house in the present year is O2");
	}
	
	static void leadingActorsOfO2() {
		
		System.out.println("Leading actors of the movie O2 : Ashika Rangnath and Praveen Tej");
	}
}
