package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.HashSet;

public class DoctorContactNumberRunner {
	
	public static void main(String[] args) {
		
		Collection<Long> collection = new HashSet<Long>();
		
		collection.add(8269655723l);
		collection.add(9845239809l);
		collection.add(7689432344l);
		
		System.out.println(collection.size());
	}

}
