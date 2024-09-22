package com.xworkz.family.boot;

public class Mother extends GrandMother{
	
	public String motherName;
	public int ageOfTheMother;
	public float height;
	public double weightOfTheMother;
	public char skinColor;
	public boolean isMotherWorkingOrNot;
	
	
	public String getMotherName() {
		return motherName;
	}
	public int getAgeOfTheMother() {
		return ageOfTheMother;
	}
	public float getHeight() {
		return height;
	}
	public double getWeightOfTheMother() {
		return weightOfTheMother;
	}
	public char getSkinColor() {
		return skinColor;
	}
	public boolean isMotherWorkingOrNot() {
		return isMotherWorkingOrNot;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public void setAgeOfTheMother(int ageOfTheMother) {
		this.ageOfTheMother = ageOfTheMother;
	}
	public void setHeight(float height) {
		super.height = height;
	}
	public void setWeightOfTheMother(double weightOfTheMother) {
		this.weightOfTheMother = weightOfTheMother;
	}
	public void setSkinColor(char skinColor) {
		super.skinColor = skinColor;
		
	}
	public void setIsMotherWorkingOrNot(boolean isMotherWorkingOrNot) {
		this.isMotherWorkingOrNot = isMotherWorkingOrNot;
	}
	
	
	

}
