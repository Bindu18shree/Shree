package com.xworkz.classmate.runner;

import com.xworkz.classmate.boot.*;
import com.xworkz.classmate.bridge.ClassMate;

public class ClassMateRunner {
	
	public static void main(String[] args) {
		
		ClassMate classfellow = new ClassFellow();
		
		ClassMate comrade = new Comrade();
		
		Friend friend = new Friend();
		
		System.out.println("Name of the class fellow :" +classfellow.name());
		
		System.out.println("Standard of the comrade :" +comrade.standard());
		
		System.out.println(friend.display(comrade));
		
		System.out.println(friend.execute(classfellow));
	}

}
