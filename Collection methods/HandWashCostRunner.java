package com.xworkz.handwash.runner;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class HandWashCostRunner {

	public static void main(String[] args) {

		Collection<Integer> collection = new ArrayList<Integer>();

		collection.add(100);
		collection.add(83);
		collection.add(79);
		collection.add(79);
		collection.add(79);

		System.out.println("size of the String :" + collection.size());

		collection.add(95);
		collection.add(172);

		System.out.println("Size after adding :" + collection.size() + collection.contains("detol"));

		collection.add(68);

		System.out.println("Size :" + collection.size() + collection.isEmpty());

		Iterator<Integer> iterator = collection.iterator();

		while (iterator.hasNext()) {

			Integer value = iterator.next();
			System.out.println("Value==" + value);
		}
	}

}
