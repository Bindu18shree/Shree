package com.xworkz.ecommerceaaplications.boot;

public class ShoppingApps {
	
	public String appName;
	
	public int foundedIn;
	
	public int numberOfEmployees;
	
	public float categories;
	
	public Ajio ajio;
	
	public NykaaFashion nykaaFashion;
	
	
	

	public float getCategories() {
		return categories;
	}

	public String getAppName() {
		return appName;
	}

	public int getFoundedIn() {
		return foundedIn;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}
	
	public Ajio getAjio() {
		return ajio;
	}
	
	public NykaaFashion getNykaaFashion() {
		return nykaaFashion;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public void setFoundedIn(int foundedIn) {
		this.foundedIn = foundedIn;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}
	
	public void setCategories(float categories) {
		this.categories = categories;
	}
	
	public void setAjio(Ajio ajio) {
		this.ajio = ajio;
	}
	
	public void setNykaaFashion(NykaaFashion nykaaFashion) {
		this.nykaaFashion = nykaaFashion;
	}
}
