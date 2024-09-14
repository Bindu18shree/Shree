package com.xworkz.studio.boot;

public class DanceStudio {
	
	public String name;
	
	public String location;
	
	public int noOfChoregraphers;
	
	public int noOfStudents;
	
	public long pincode;
	
	public Choreographer choreographer;

	public Choreographer getChoreographer() {
		return choreographer;
	}

	public void setChoreographer(Choreographer choreographer) {
		this.choreographer = choreographer;
	}

	public long getPincode() {
		return pincode;
	}

	public void setPincode(long pincode) {
		this.pincode = pincode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfChoregraphers() {
		return noOfChoregraphers;
	}

	public void setNoOfChoregraphers(int noOfChoregraphers) {
		this.noOfChoregraphers = noOfChoregraphers;
	}

	public int getNoOfStudents() {
		return noOfStudents;
	}

	public void setNoOfStudents(int noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	
	
	

}
