package com.xworkz.university.boot;

public class StudentDetailsDto implements Comparable<StudentDetailsDto> {

	public int regNumber;
	public String name;

	public int getRegNumber() {
		return regNumber;
	}

	public String getName() {
		return name;
	}

	public void setRegNumber(int regNumber) {
		this.regNumber = regNumber;
	}

	public void setName(String name) {
		this.name = name;
	}

	public StudentDetailsDto(int regNumber, String name) {
		this.regNumber = regNumber;
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentDetails [regNumber=" + regNumber + ", name=" + name + "]";
	}

	@Override
	public int compareTo(StudentDetailsDto o) {

		boolean thisEndsWithA = this.name.endsWith("a");

		boolean otherEndsWithA = o.name.endsWith("a");

		if (thisEndsWithA && otherEndsWithA) {

			return this.getName().compareTo(o.getName());
		} else if (thisEndsWithA) {

			return -1;
		} else if (otherEndsWithA) {

			return 1;
		} else {

			return this.getName().compareTo(o.getName());
		}

	}
}
