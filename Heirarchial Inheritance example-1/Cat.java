package com.xworkz.pets.boot;

public class Cat extends Pets{
	
	public String breed = "Ragdoll";
	public int lifeSpan = 15;
	public float weight = 7.2f;
	public char color = 'W';
	public boolean isPetMaleOrFemale = true;
	
	
	public String getBreed() {
		return breed;
	}
	public int getLifeSpan() {
		return lifeSpan;
	}
	public float getWeight() {
		return weight;
	}
	public char getColor() {
		return color;
	}
	public boolean isPetMaleOrFemale() {
		return isPetMaleOrFemale;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	public void setLifeSpan(int lifeSpan) {
		super.lifeSpan = lifeSpan;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setColor(char color) {
		this.color = color;
	}
	public void setIsPetMaleOrFemale(boolean isPetMaleOrFemale) {
		super.isPetMaleOrFemale = isPetMaleOrFemale;
	}
	
	

}
