package com.xworkz.doll.runner;

import java.util.LinkedList;
import java.util.ListIterator;

import com.xworkz.doll.boot.DollDto;

public class DollRunner {

	public static void main(String[] args) {

		LinkedList<DollDto> linkedlist = new LinkedList<DollDto>();

		linkedlist.add(new DollDto("Barbie", 449, "HJR93-0", 126));

		linkedlist.add(new DollDto("Super Toy", 1395, "FWV25", 200));

		linkedlist.add(new DollDto("Barbie", 449, "HJR93-0", 126));

		ListIterator<DollDto> iterator = linkedlist.listIterator();

		while (iterator.hasNext()) {

			iterator.add(new DollDto("Cry Babies", 1489, "904361", 500));

			DollDto value = iterator.next();

			System.out.println("value :" + value);
		}
		
		for(DollDto doll : linkedlist) {
			
			System.out.println(doll.getBrand());
		}

	}

}
