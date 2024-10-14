package com.xworkz.upiapps.runner;

import com.xworkz.upiapps.boot.*;
import com.xworkz.upiapps.bridge.UPIApps;

public class UPIAppsRunner {
	
	public static void main(String[] args) {
		
		UPIApps phonepay = new PhonePay();
		
		UPIApps googlepay = new GooglePay();
		
		OnlineTransactionApps apps = new OnlineTransactionApps();
		
		System.out.println("Founder of the phone pay :" +phonepay.founderName());
		
		System.out.println("Phone pay was founded in the year :" +phonepay.foundInTheYear());
		
		System.out.println("Founder of the Google pay :" +googlepay.founderName());
		
		System.out.println("Google pay was founded in the year :" +googlepay.foundInTheYear());
		
		System.out.println(apps.display(googlepay));
		
		System.out.println(apps.display(phonepay));
	}

}
