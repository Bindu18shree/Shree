package com.xworkz.students.boot;

public class PostGraduateStudent {
	
	public String course;
	public String usin;
	public int age;
	public boolean isStudentMaleOrFemale;
	public long contactNumber;
	
	
	public PostGraduateStudent() {
		this("Computer Science");
		System.out.println("This is no argumental constructor");
	}
	
	public PostGraduateStudent(String course) {
		this("Computer Science", "21MPBS408003");
		System.out.println("Course :" +course);
	}
	
	public PostGraduateStudent(String course, String usin) {
		this("Computer Science", "21MPBS408003", 23);
		System.out.println("USIN of the student :" +usin);
	}
	
	public PostGraduateStudent(String course, String usin, int age) {
		this("Computer Science", "21MPBS408003", 23, true);
		System.out.println("Age of the student :" +age);
	}
	
	public PostGraduateStudent(String course, String usin, int age, boolean isStudentMaleOrFemale) {
		this("Computer Science", "21MPBS408003", 23, true, 8269655732l);
		System.out.println("Student gender is Female :" +isStudentMaleOrFemale);
	}
	
	public PostGraduateStudent(String course, String usin, int age, boolean isStudentMaleOrFemale, long contactNumber) {
		System.out.println("Contact Number of the student :" +contactNumber);
	}
}
