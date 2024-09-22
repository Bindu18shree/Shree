package com.xworkz.company.boot;

public class EmployeeII extends Company {
	
	public String nameofTheEmployee = "Harshitha";
	public int age = 32;
	public String companyName = "Amazon";
	public String companyAddress = "8th floor,Brigade Gateway, 26/1 Dr. Rajkumar Road, Bangalore, Karnataka";
	public long contactNumber = 8269655723l;
	public int companyPincode = 560055;
	public boolean isCompanyOpenedOrClosed = true;
	
	
	public String getNameofTheEmployee() {
		return nameofTheEmployee;
	}
	public int getAge() {
		return age;
	}
	public String getCompanyName() {
		return companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public int getCompanyPincode() {
		return companyPincode;
	}
	public boolean isCompanyOpenedOrClosed() {
		return isCompanyOpenedOrClosed;
	}
	public void setNameofTheEmployee(String nameofTheEmployee) {
		this.nameofTheEmployee = nameofTheEmployee;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setCompanyName(String companyName) {
		super.name = companyName;
	}
	public void setCompanyAddress(String companyAddress) {
		super.address = companyAddress;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setCompanyPincode(int companyPincode) {
		super.pincode = companyPincode;
	}
	public void setIsCompanyOpenedOrClosed(boolean isCompanyOpenedOrClosed) {
		super.isCompanyOpenedOrClosed = isCompanyOpenedOrClosed;
	}
	
	
	

}
