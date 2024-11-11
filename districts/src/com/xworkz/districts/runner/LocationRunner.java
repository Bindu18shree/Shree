package com.xworkz.districts.runner;

import java.util.*;

public class LocationRunner {
	
public static void main(String[] args) {
		
		Map<Float, Character> map = new HashMap<Float, Character>();
		
		map.put(32.89f, 'B');
		map.put(32.89f, 'B');
		map.put(12.9f, 'A');
		map.put(37.987f, 'C');
		map.put(6.9875f, 'M');
		map.put(6.9875f, 'D');
		map.put(5432.987f, 'A');
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}


}
