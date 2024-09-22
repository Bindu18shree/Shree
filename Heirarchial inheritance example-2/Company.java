package com.xworkz.company.boot;

public class Company {
	
	public String name;
	public String address;
	public int pincode;
	public boolean isCompanyOpenedOrClosed;
	public float opensAt = 9.35f;
	
	public float getOpensAt() {
		return opensAt;
	}
	
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public long getPincode() {
		return pincode;
	}
	public boolean isCompanyOpenedOrClosed() {
		return isCompanyOpenedOrClosed;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public void setIsCompanyOpenedOrClosed(boolean isCompanyOpenedOrClosed) {
		this.isCompanyOpenedOrClosed = isCompanyOpenedOrClosed;
	}
	
	public void setOpensAt(float opensAt) {
		this.opensAt = opensAt;
	}
	
	

}
