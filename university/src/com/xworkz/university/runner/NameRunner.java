package com.xworkz.university.runner;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class NameRunner {

	public static void main(String[] args) {

		Comparator<String> compare = (String i, String j) -> {
			
			if (i.startsWith("A") && j.endsWith("A")) {

					return i.compareTo(j);
				} else if (i.startsWith("A")) {

					return -1;
				} else if (j.startsWith("A")) {

					return 1;
				} else {

					return i.compareTo(j);
				}
			
		};

		List<String> list = new LinkedList<String>();

		list.add("Anish");
		list.add("Bindu");
		list.add("Garima");
		list.add("Ankit");
		list.add("Manoj");
		list.add("Aalia");

		Collections.sort(list, compare);

		System.out.println(list);
	}

}
