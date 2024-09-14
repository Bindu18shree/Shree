package com.xworkz.studio.runner;

import com.xworkz.studio.boot.Choreographer;
import com.xworkz.studio.boot.DanceStudio;

public class DanceStudioRunner {
	
	public static void main(String [] args) {
		
	Choreographer choreographer = new Choreographer();
	
	
	DanceStudio dancestudio = new DanceStudio();
	
	dancestudio.setName("Dance The New Dream");
	dancestudio.setLocation("7th cross, Thayappa garden,Nandini Milk Parlour,JP Nagar 6th phase,Bangalore");
	dancestudio.setNoOfChoregraphers(5);
	dancestudio.setNoOfStudents(100);
	dancestudio.setPincode(562109l);
	
	System.out.println("Name of the dance studio :" +dancestudio.getName());
	
	System.out.println("Location of the Dance studio :" +dancestudio.getLocation());
	
	System.out.println("Number of choreographers in the dance studio :" +dancestudio.getNoOfChoregraphers());
	
	System.out.println("Number of students in the dance studio :" +dancestudio.getNoOfStudents());
	
	System.out.println("Pincode of the dance studio :" +dancestudio.getPincode());
	
	System.out.println("The name of the choreographer :" +choreographer.getNameOfTheChoreographer());
	
	System.out.println("Number of batches taken by choreographer :" +choreographer.getNoOfBatchesTaken());
	
	System.out.println("Contact number of the choreographer :" +choreographer.getContactNumberOfTheChoregrapher());
	
	
	
	
	
	}

}
