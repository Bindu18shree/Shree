package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.HashSet;

public class DoctorSalaryRunner {
	
	public static void main(String[] args) {
		
		Collection<Integer> collection = new HashSet<Integer>();
		
		collection.add(50500);
		collection.add(85000);
		collection.add(115000);
		collection.add(230956);
		
		System.out.println(collection.size());
	}

}
