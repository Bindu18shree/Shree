package com.xworkz.crackers.runner;

import java.util.*;
import java.util.stream.Stream;
public class RocketsRunner {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(12, 36, 98, 57, 15, 3, 75);

		Stream<Integer> value = list.stream();

		value.filter(n -> n % 2 == 0).sorted().forEach(n -> System.out.println("sorted even numbers :" +n));

	}

}