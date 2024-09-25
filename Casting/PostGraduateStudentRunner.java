package com.xworkz.students.runner;

import com.xworkz.students.boot.PostGraduateStudent;
import com.xworkz.students.boot.UnderGraduateStudent;

public class PostGraduateStudentRunner {
	
	public static void main(String [] args) {
		
		PostGraduateStudent postgraduatestudent = new PostGraduateStudent();
		
		UnderGraduateStudent undergraduatestudent = (UnderGraduateStudent) new PostGraduateStudent();
		
		undergraduatestudent.course = "Information Science";
		
		System.out.println("Course of UG programme :" +undergraduatestudent.getCourse());
		
		
		
		
		
	}

}

