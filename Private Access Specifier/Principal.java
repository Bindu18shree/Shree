package com.xworkz.school.boot;

public class Principal {
	
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void method() {
		
		School school = new School();
		
		school.setName("Vagdevi Vilas School");
		System.out.println("Name of the School :" +school.getName());
		
		school.setFoundedYear(2001);
		System.out.println("The school was founded in the year :" +school.getFoundedYear());
		
		school.setNoOfStudents(15500l);
		System.out.println("Total number of students in the School :" +school.getNoOfStudents());
		
		school.setOpensAt(7.45f);
		System.out.println("School opens at(AM) :" +school.getOpensAt());
	}
	
	

}
