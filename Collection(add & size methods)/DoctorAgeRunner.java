package com.xworkz.hospital.runner;

import java.util.ArrayList;
import java.util.Collection;

public class DoctorAgeRunner {
	
	public static void main(String[] args) {
		
		Collection<Byte> collection = new ArrayList<Byte>();
		
		collection.add((byte)45);
		collection.add((byte)32);
		collection.add((byte)67);
		collection.add((byte)28);
		collection.add((byte)43);
		collection.add((byte)79);
		
		System.out.println(collection.size());
	}

}
