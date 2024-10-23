package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.LinkedHashSet;

public class DoctorConsultationTiming {
	
	public static void main(String[] args) {
		
		Collection<Float> collection = new LinkedHashSet<Float>();
		
		collection.add(9.35f);
		collection.add(8.55f);
		collection.add(10.45f);
		collection.add(11.29f);
		collection.add(11.15f);
		
		System.out.println(collection.size());
	}

}
