package com.xworkz.family.boot;

public class Daughter extends Mother{
	
	public String daughterName;
	public int ageOfTheDaughter;
	public char studyingIn;
	public float heightOfTheDaughter;
	public double weightOfTheDaughter;
	public char skinColor;
	
	
	public String getDaughterName() {
		return daughterName;
	}
	public int getAgeOfTheDaughter() {
		return ageOfTheDaughter;
	}
	public char getStudyingIn() {
		return studyingIn;
	}
	public float getHeightOfTheDaughter() {
		return heightOfTheDaughter;
	}
	public double getWeightOfTheDaughter() {
		return weightOfTheDaughter;
	}
	public char getSkinColor() {
		return skinColor;
	}
	public void setDaughterName(String daughterName) {
		this.daughterName = daughterName;
	}
	public void setAgeOfTheDaughter(int ageOfTheDaughter) {
		this.ageOfTheDaughter = ageOfTheDaughter;
	}
	public void setStudyingIn(char studyingIn) {
		this.studyingIn = studyingIn;
	}
	public void setHeightOfTheDaughter(float heightOfTheDaughter) {
		this.heightOfTheDaughter = heightOfTheDaughter;
	}
	public void setWeightOfTheDaughter(double weightOfTheDaughter) {
		this.weightOfTheDaughter = weightOfTheDaughter;
	}
	public void setSkinColor(char skinColor) {
		super.skinColor = skinColor;
		this.skinColor = skinColor;
	}
	
	
	

}
