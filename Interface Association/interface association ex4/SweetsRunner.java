package com.xworkz.sweets.runner;

import com.xworkz.sweets.boot.*;
import com.xworkz.sweets.bridge.SweetInterface;

public class SweetsRunner {
	
	public static void main(String[] args) {
		
		SweetInterface kantisweet = new KantiSweets();
		
		SweetInterface ashasweet = new AshaSweets();
		
		Sweets sweet = new Sweets();
		
		
		System.out.println("The sweet from kantiSweets :" +kantisweet.sweetName());
		
		System.out.println("The cost of kaajukatli from kantisweets is :" +kantisweet.costOfTheSweet());
		
		System.out.println(sweet.display(kantisweet));
		
		System.out.println(sweet.execute(ashasweet));
		
	
	}

}
