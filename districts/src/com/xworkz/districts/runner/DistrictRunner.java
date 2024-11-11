package com.xworkz.districts.runner;

import java.util.HashMap;
import java.util.Map;

public class DistrictRunner {
	
	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Bangalore", 29018);
		map.put("Bangalore", 29018);
		map.put("Tumkur", 29017);
		map.put("Mandya", 29019);
		map.put("Kodagu", 29023);
		map.put("Kodagu", 29043);
		map.put("Mysore", 29017);
		map.put(null, 1234);
		map.put(null, 64536);
		map.put("Bidar", null);
		map.put("Hassan", null);
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}

}
