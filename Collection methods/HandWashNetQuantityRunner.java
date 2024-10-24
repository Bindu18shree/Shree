package com.xworkz.handwash.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class HandWashNetQuantityRunner {
	
	public static void main(String[] args) {
		
		Collection<Short> collection = new HashSet<Short>();

		collection.add((short)150);
		collection.add((short)100);
		collection.add((short)200);
		collection.add((short)100);
		collection.add((short)150);

		System.out.println("size of the String :" + collection.size());

		collection.add((short)250);
		collection.add((short)250);
		

		System.out.println("Size after adding :" + collection.size() + collection.contains("detol"));

		collection.add((short)450);
		
		collection.remove((short)250);
		

		System.out.println("Size :" + collection.size() + collection.isEmpty());

		Iterator<Short> iterator = collection.iterator();

		while (iterator.hasNext()) {

			Short value = iterator.next();
			System.out.println("Value==" + value);
		}
	}

}
