package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.LinkedList;

public class DoctorNameRunner {
	
	public static void main(String[] args) {
		
		Collection<String> collection = new LinkedList<String>() ;
			
	    collection.add("Paarvati");
	    collection.add("Seeta");
	    collection.add("Gowri");
	    collection.add("Durga");
	    
	    System.out.println(collection.size());
	}

}
