package com.xworkz.pets.boot;

public class Dog extends Pets{
	
	public String breed = "Golden Retriever";
	public int lifeSpan = 15;
	public boolean isPetMaleOrFemale = true;
	public double price = 15345.980d;
	public char color = 'G';
	
	
	public String getBreed() {
		return breed;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public boolean isPetMaleOrFemale() {
		return isPetMaleOrFemale;
	}
	public double getPrice() {
		return price;
	}
	public char getColor() {
		return color;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setLifeSpan(int lifeSpan) {
		super.lifeSpan = lifeSpan;
	}
	public void setIsPetMaleOrFemale(boolean isPetMaleOrFemale) {
		super.isPetMaleOrFemale = isPetMaleOrFemale;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setColor(char color) {
		this.color = color;
	}
	
	
	

}
