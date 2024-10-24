package com.xworkz.handwash.runner;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class HandWashRunner {

	public static void main(String[] args) {

		Collection<String> collection = new LinkedList<String>();

		collection.add("apollo");
		collection.add("Santoor");
		collection.add("Himalaya");
		collection.add("Himalaya");
		collection.add("Himalaya");

		System.out.println("size of the String :" + collection.size());

		collection.add("Dettol");
		collection.add("Savlon");

		System.out.println("Size after adding :" + collection.size() + collection.contains("detol"));

		collection.add("Lifebuoy");
		collection.clear();

		System.out.println("Size :" + collection.size() + collection.isEmpty());

		Iterator<String> iterator = collection.iterator();

		while (iterator.hasNext()) {

			String value = iterator.next();
			System.out.println("Value==" + value);
		}
	}

}
