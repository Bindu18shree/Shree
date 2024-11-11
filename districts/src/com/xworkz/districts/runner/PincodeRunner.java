package com.xworkz.districts.runner;

import java.util.*;

public class PincodeRunner {
	
public static void main(String[] args) {
		
		Map<Long, Double> map = new HashMap<Long, Double>();
		
		map.put(865678866l, 65.98d);
		map.put(890543256l, 58.987755d);
		map.put(568977l, 54.9d);
		map.put(560073l, 98.89d);
		map.put(562109l, 65.3d);
		map.put(3457678l, 21.69d);
		map.put(13789777l, 54.9d);
		
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.entrySet());
		
	}

}
