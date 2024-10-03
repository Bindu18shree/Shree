package com.xworkz.watch.runner;

import com.xworkz.watch.dto.WatchDto;

public class WatchDtoRunner {
	
	public static void main(String[] args) {
		
		
		WatchDto dto = new WatchDto("Daniel Wellington", 12399.90f, "DW00100161", 2017, true);
		
		System.out.println("Brand :"+dto.getBrand());
		System.out.println("Cost :" +dto.getCost());
		System.out.println("Model :" +dto.getModel());
		System.out.println("Model year :" +dto.getModelYear());
		System.out.println("Battery is included :" +dto.isBatteryIncluded());
		
		System.out.println("Hashcode :" +dto.hashCode());
		
		System.out.println("Equals :" +dto.equals(dto));
		
		System.out.println("to String :" +dto.toString());
		
		
		
		
		
		
		
	}

}
