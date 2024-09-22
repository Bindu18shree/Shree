package com.xworkz.donkey.boot;

public class Foal extends Filly{

	public int age = 3;
	public char color = 'G';
	public boolean isFoalMaleOrFemale = true;
	
	
	public int getAge() {
		return age;
	}
	public char getColor() {
		return color;
	}
	public boolean isFoalMaleOrFemale() {
		return isFoalMaleOrFemale;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setColor(char color) {
		super.color = color;
	}
	public void setIsFoalMaleOrFemale(boolean isFoalMaleOrFemale) {
		this.isFoalMaleOrFemale = isFoalMaleOrFemale;
	}
	
	
	
	
}
