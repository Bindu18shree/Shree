package com.xworkz.crackers.runner;

import java.util.Arrays;
import java.util.List;

public class SparklersRunner {
	
	public static void main(String[] args) {
		
		List<Float> list = Arrays.asList(95.4f, 45.9f, 120.76f, 34.65f);
		
		list.stream().sorted().filter(n -> n%2 !=0).forEach(n -> System.out.println("sorted odd numbers :" +n));
	} 

}
