package com.xworkz.dolls.boot;

public class Barbie {
	
	public void modelNumber(String modelNumber) {
		System.out.println("Model number of the barbie doll :" +modelNumber);
	}
	
	public void price(String barbieDollBrand, double cost) {
		System.out.println("Cost of the Barbie Doll :" +cost);
	}
	
	public void weight(String barbieDollBrand, double cost, float itemWeight) {
		System.out.println("Weight of the barbie doll in grams :" +itemWeight);
	}
	
	public void batteryRequirement(String barbieDollBrand, double cost, float itemWeight, boolean isBatteriesRequiredOrNot) {
		System.out.println("Batteries are required for the barbie doll :" +isBatteriesRequiredOrNot);
	}
	
	public void puzzlePieces(String barbieDollBrand, double cost, float itemWeight, boolean isBatteriesRequiredOrNot, int numberOfPuzzlePieces) {
		System.out.println("Number of puzzle pieces given in the barbie doll :" +numberOfPuzzlePieces);
	}
	
	public void recommendedAge(String barbieDollBrand, double cost, float itemWeight, boolean isBatteriesRequiredOrNot, int numberOfPuzzlePieces, int ageRecommended) {
		System.out.println("Recommended age(months) for the user by manufacturer :" +ageRecommended);
	}
}
