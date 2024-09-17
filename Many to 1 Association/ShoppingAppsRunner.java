package com.xworkz.ecommerceapplications.runner;

import com.xworkz.ecommerceaaplications.boot.Ajio;
import com.xworkz.ecommerceaaplications.boot.NykaaFashion;
import com.xworkz.ecommerceaaplications.boot.ShoppingApps;

public class ShoppingAppsRunner {
	
	public static void main(String [] args) {
		
		Ajio ajio = new Ajio();
		
		ajio.setOwnedBy("Relaince Retail");
		
		ajio.setFoundedIn(2016);
		
		ajio.setNoOfBrandsAvailable(2500.000d);
		
		ajio.setHeadQuarters("Mumbai");
		
		
		NykaaFashion nykaafashion = new NykaaFashion();
		
		nykaafashion.setFoundedIn(2012);
		
		nykaafashion.setCeo("Falguni Nayar");
		
		nykaafashion.setNetWorth(589.12999d);
		
		nykaafashion.setApproxCustomers(15000000l);
		
		nykaafashion.setElectronicsAvailableInNykaaOrNot(false);
		
		
		ShoppingApps shoppingapps = new ShoppingApps();
		
		shoppingapps.setAppName("Myntra");
		
		shoppingapps.setFoundedIn(2007);
		
		shoppingapps.setNumberOfEmployees(14000);
		
		shoppingapps.setCategories(3.0f);
		
		shoppingapps.setAjio(ajio);
		
		shoppingapps.setNykaaFashion(nykaafashion);
		
		System.out.println("Myntra was founded in the year:" +shoppingapps.getFoundedIn());
		
		System.out.println("Ajio was founded in the year :" +shoppingapps.getAjio().getFoundedIn());
		
		System.out.println("Nykaa Fashion was founded in the year :" +shoppingapps.getNykaaFashion().getFoundedIn());
		
		System.out.println("Ajio is owned by :" +shoppingapps.getAjio().getOwnedBy());
		
		System.out.println("CEO of the Nykaa Fashion :" +shoppingapps.getNykaaFashion().getCeo());
		
		System.out.println("Number of brands available in Ajio App :" +shoppingapps.getAjio().getNoOfBrandsAvailable());
		
		System.out.println("Head Quarters of Ajio is located in :" +shoppingapps.getAjio().getHeadQuarters());
		
		System.out.println("Net worth of the NykaaFashion in billions :" +shoppingapps.getNykaaFashion().getNetWorth());
		
		System.out.println("Approximate customers of the Nykaa Fashion in millions :" +shoppingapps.getNykaaFashion().getApproxCustomers());
		
		System.out.println("Electronic Items is available in the NykaaFashion :" +shoppingapps.getNykaaFashion().isElectronicsAvailableInNykaaOrNot());
		
		System.out.println("Number of employees in myntra :" +shoppingapps.getNumberOfEmployees());
			
	}

}
