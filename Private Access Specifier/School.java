package com.xworkz.school.boot;

public class School {
	
	private String name;
	private int foundedYear;
	private long noOfStudents;
	private float opensAt;
	
	
	public String getName() {
		return name;
	}
	public int getFoundedYear() {
		return foundedYear;
	}
	public long getNoOfStudents() {
		return noOfStudents;
	}
	public float getOpensAt() {
		return opensAt;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}
	public void setNoOfStudents(long noOfStudents) {
		this.noOfStudents = noOfStudents;
	}
	public void setOpensAt(float opensAt) {
		this.opensAt = opensAt;
	}
	
}
