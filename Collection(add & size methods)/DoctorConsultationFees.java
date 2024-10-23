package com.xworkz.hospital.runner;

import java.util.Collection;
import java.util.LinkedList;

public class DoctorConsultationFees {

	public static void main(String[] args) {

		Collection<Short> collection = new LinkedList<Short>();

		collection.add((short)655);
		collection.add((short)550);
		collection.add((short)720);

		System.out.println(collection.size());

	}

}
