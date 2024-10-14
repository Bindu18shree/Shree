package com.xworkz.zoo.runner;

import com.xworkz.zoo.boot.*;
import com.xworkz.zoo.bridge.Zoo;

public class ZooRunner {
	
	public static void main(String[] args) {
		
		Zoo animals = new Animals();
		
		Zoo birds = new Birds();
		
		NationalParks park = new NationalParks();
		
		
		System.out.println("Animals is from the zoo :" +animals.nameOfZoo());
		
		System.out.println("Birds is from the :" +birds.nameOfZoo());
		
		System.out.println(park.display(animals));
	}

}
