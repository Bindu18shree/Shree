package com.xworkz.car.boot;

public class Brand {
	
	public String brandName;
	
	public int foundedIn;
	
	public String ceo;
	
	public long numberOfEmployees;

	public Brand(String brandName, int foundedIn, String ceo, long numberOfEmployees) {
		
		this.brandName = brandName;
		this.foundedIn = foundedIn;
		this.ceo = ceo;
		this.numberOfEmployees = numberOfEmployees;
	}

	public String getBrandName() {
		return brandName;
	}

	public int getFoundedIn() {
		return foundedIn;
	}

	public String getCeo() {
		return ceo;
	}

	public long getNumberOfEmployees() {
		return numberOfEmployees;
	}
}
