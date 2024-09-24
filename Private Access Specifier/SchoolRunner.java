package com.xworkz.school.runner;

import com.xworkz.school.boot.Principal;

public class SchoolRunner {
	
	public static void main(String [] args) {
		
		Principal principal = new Principal();
		
		principal.method();
		
		principal.setName("Prasanna");
		System.out.println("Name of the Principal :" +principal.getName());
		
		principal.setAge(43);
		System.out.println("Age of the Principal :" +principal.getAge());
		
	}

}
