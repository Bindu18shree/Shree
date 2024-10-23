package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.LinkedHashSet;

public class DoctorLastName {
	
	public static void main(String[] args) {
		
		Collection<Character> collection = new LinkedHashSet<Character>();
		
		collection.add('A');
		collection.add('M');
		collection.add('P');
		collection.add('G');
		collection.add('N');
		
		System.out.println(collection.size());
	}

}
