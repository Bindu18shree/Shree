package com.xworkz.saree.runner;

import com.xworkz.saree.boot.*;
import com.xworkz.saree.bridge.Saree;

public class SareeRunner {
	
	public static void main(String[] args) {
		
		Saree kanjeevaram = new KanjeevaramSaree();
		
		Saree partysaree = new PartySaree();
		
		SareeTypes types = new SareeTypes();
		
		System.out.println("Brand of the kanjeevaram saree :" +kanjeevaram.brand());
		
		System.out.println("Price of the party saree :" +partysaree.price());
		
		System.out.println(types.display(partysaree));
		
		
		
		
		
	}

}
