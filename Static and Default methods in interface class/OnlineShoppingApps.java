package com.xworkz.onlineshoppingapps.boot;

public interface OnlineShoppingApps {
	
	String leadingOnlineShoppingApp = "Nykaa Fashion";
	int foundedInTheYear = 2018;
	String founder = "Falguni Nayar";
	String brandAmbassador = "Janvhi Kapoor";
	String tagLineOfNykaaFashion = "Your Beauty, Our passion";
	double revenue = 1788.9865d;
	int noOfBrandsAvaialable = 1500;
	int noOfSegments = 5;
	float noOfProducts = 1.8f;
	int noOfCategories = 12;
	boolean isEasyReturnsAvailable = true;
	boolean isExchangeOptionAvaialble = true;
	long noOfEmployees = 2500l;
	String website = "www.nykaafashion.com";
	boolean isInternationalBrandsAvailable = true;
	String companyType = "Public";
	String industry = "Consumer goods";
	String headQuarters = "Mumbai, Maharashtra, India";
	long netIncome = 400000000l;
	int noOfStores = 100;
	
	
	static void shoppingAppName() {
		
		System.out.println("Leading online shopping app :" +leadingOnlineShoppingApp);
	}
	
	static void foundedYear() {
		
		System.out.println("Nykaa Fashion was founded in the year :" +foundedInTheYear);
	}
	
	static void founderOfTheApp() {
		
		System.out.println("Founder of the Nykaa Fashion :" +founder);
	}
	
	static void brandAmbassadorForTheApp() {
		
		System.out.println("Brand Ambassador for the app :" +brandAmbassador);
	}
	
	static void tagLineForTheApp() {
		
		System.out.println("Tagline for the nykaa fashion :" +tagLineOfNykaaFashion);
	}
	
	static void revenueOfTheApp() {
		
		System.out.println("Total revenue of the app in the crores :" +revenue);
	}
	
	static void brands() {
		
		System.out.println("Number of brands availabe in the app :" +noOfBrandsAvaialable);
	}
	
	static void segments() {
		
		System.out.println("Number of segments in the app :" +noOfSegments);
	}
	
	static void products() {
		
		System.out.println("Number of products available :" +noOfProducts);
	}
	
	static void categories() {
		
		System.out.println("Total number of categories :" +noOfCategories);
	}
	
	
	default void isReturnAvailable() {
		
		System.out.println("Easy return is available by the app :" +isEasyReturnsAvailable);
	}
	
	default void isExchaneAvailable() {
		
		System.out.println("Exchane option is available by the app :" +isExchangeOptionAvaialble);
	}
	
	default void employees() {
		
		System.out.println("Total number of employees working :" +noOfEmployees);
	}
	
	default void websiteOfTheApp() {
		
		System.out.println("Website of the app :" +website);
	}
	
	default void isInternationalBrandsAvailableInTheApp() {
		
		System.out.println("International brands are available in the app :" +isInternationalBrandsAvailable);
	}
	
	default void typeOfTheCompany() {
		
		System.out.println("Company Type :" +companyType);
	}
	
	default void appIndustry() {
		
		System.out.println("Industry :" +industry);
	}
	
	default void headQuartersOfTheApp() {
		
		System.out.println("Head Quarters :" +headQuarters);
	}
	
	default void netIncomeOfTheApp() {
		
		System.out.println("Net Income of the app :" +netIncome);
	}
	
	default void stores() {
		
		System.out.println("Number of stores :" +noOfStores);
	}
}
