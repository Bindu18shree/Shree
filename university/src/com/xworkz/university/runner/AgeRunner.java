package com.xworkz.university.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgeRunner {

	public static void main(String[] args) {

		Comparator<Integer> compare = (Integer i, Integer j) -> i % 10 > j % 10 ? 1:-1;

		List<Integer> list = new ArrayList<Integer>();

		list.add(41);
		list.add(31);
		list.add(22);
		list.add(21);
		list.add(11);

		Collections.sort(list, compare);

		System.out.println(list);

	}

}
