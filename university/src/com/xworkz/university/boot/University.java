package com.xworkz.university.boot;

public class University {

	public String UniversityName;
	public int pincode;

	public String getUniversityName() {
		return UniversityName;
	}

	public int getPincode() {
		return pincode;
	}

	public void setUniversityName(String universityName) {
		UniversityName = universityName;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public University(String universityName, int pincode) {
		super();
		UniversityName = universityName;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "University [UniversityName=" + UniversityName + ", pincode=" + pincode + "]";
	}

}
