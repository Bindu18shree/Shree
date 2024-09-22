package com.xworkz.company.boot;

public class EmployeeI extends Company{
	
	public String nameofTheEmployee = "Akshatha";
	public int age = 28;
	public String companyName = "Amazon";
	public String companyAddress = "8th floor,Brigade Gateway, 26/1 Dr. Rajkumar Road, Bangalore, Karnataka";
	public long contactNumber = 9765234567l;
	public int companyPincode = 560055;
	public boolean isCompanyOpenedOrClosed = true;
	
	
	public boolean isCompanyOpenedOrClosed() {
		return isCompanyOpenedOrClosed;
	}
	
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
	
	public void setCompanyOpenedOrClosed(boolean isCompanyOpenedOrClosed) {
		super.isCompanyOpenedOrClosed = isCompanyOpenedOrClosed;
	}
	
	
	
	

}
