package com.xworkz.mobiles.runner;

import com.xworkz.mobiles.boot.Mobile;

public class MobileRunner {
	
	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		
		mobile.iPhone();
		System.out.println("Brand of the mobile :" +mobile.iPhone("Apple"));
		System.out.println("Model :" +mobile.iPhone("Apple", 16));
		System.out.println("Color :" +mobile.iPhone("Apple", 16, 'B'));
		System.out.println("Price :" +mobile.iPhone("Apple", 16,'B', 109875.98450d));
		System.out.println("Screen size :" +mobile.iPhone("Apple", 16,'B', 109875.98450d, 6.1f));
		System.out.println("USB Cable is provided with the phone :" +mobile.iPhone("Apple", 16,'B', 109875.98450d, 6.1f, true));
	}

}
