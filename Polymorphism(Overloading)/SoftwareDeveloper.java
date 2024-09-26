package com.xworkz.developer.boot;

public class SoftwareDeveloper {
	
	//Constructor overloading
	public SoftwareDeveloper() {
		System.out.println("this is no argument overloading constructor");
	}
	
	public SoftwareDeveloper(String name) {
		
	}
	
	public SoftwareDeveloper(String name, char initial) {
		
	}
	
	public SoftwareDeveloper(String name, char initial, int experience) {
		
	}
	
	public SoftwareDeveloper(String name, char initial, int experience, double salary) {

	}
	
	public SoftwareDeveloper(String name, char initial, int experience, double salary, long contactNumber) {
		
	}
	
	public SoftwareDeveloper(String name, char initial, int experience, double salary, long contactNumber, boolean isGenderMaleOrFemale) {
		
	}
	
	
	//Method Overloading
	public void developer() {
		System.out.println("this is no argument overloading constructor");
	}
	
	public void developer(String name) {
		System.out.println("Name of the software developer :" +name);
	}
	
	public void developer(String name, char initial) {
		System.out.println("Initial  :" +initial);
	}
	
	public void developer(String name, char initial, int experience) {
		System.out.println("Year of experience :" +experience);
	}
	
	public void developer(String name, char initial, int experience, double salary) {
		System.out.println("Salary :" +salary);
	}
	
	public void developer(String name, char initial, int experience, double salary, long contactNumber) {
		System.out.println("Contact number :" +contactNumber);
	}
	
	public void developer(String name, char initial, int experience, double salary, long contactNumber, boolean isGenderMaleOrFemale) {
		System.out.println("Gender of the developer is female :" +isGenderMaleOrFemale);
	}

}
