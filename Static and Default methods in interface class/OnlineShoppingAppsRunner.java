package com.xworkz.onlineshoppingapps.runner;

import com.xworkz.onlineshoppingapps.boot.OnlineNykaaShoppingApp;
import com.xworkz.onlineshoppingapps.boot.OnlineShoppingApps;

public class OnlineShoppingAppsRunner {
	
	public static void main(String[] args) {
		
		OnlineShoppingApps.shoppingAppName();
		OnlineShoppingApps.foundedYear();
		OnlineShoppingApps.founderOfTheApp();
		OnlineShoppingApps.brandAmbassadorForTheApp();
		OnlineShoppingApps.tagLineForTheApp();
		OnlineShoppingApps.revenueOfTheApp();
		OnlineShoppingApps.brands();
		OnlineShoppingApps.segments();
		OnlineShoppingApps.products();
		OnlineShoppingApps.categories();
		
		
		OnlineNykaaShoppingApp nykaa = new OnlineNykaaShoppingApp();
		
		nykaa.isReturnAvailable();
		nykaa.isExchaneAvailable();
		nykaa.employees();
		nykaa.websiteOfTheApp();
		nykaa.isInternationalBrandsAvailableInTheApp();
		nykaa.typeOfTheCompany();
		nykaa.appIndustry();
		nykaa.headQuartersOfTheApp();
		nykaa.netIncomeOfTheApp();
		nykaa.stores();
	}

}
