package com.xworkz.family.runner;

import com.xworkz.family.boot.Daughter;

public class FamilyRunner {
	
	public static void main(String [] args) {
		
		Daughter daughter = new Daughter();
		
		daughter.setName("Parijaatha");
		daughter.setAge(62);
		daughter.setHeight(175.4f);
		daughter.setWeight(55.9800d);
		daughter.setSkinColor('F');
		daughter.setIsGrandMotherRetiredOrNot(true);
		daughter.setMotherName("Manjula");
		daughter.setAgeOfTheMother(34);
		daughter.setWeightOfTheMother(63.239000d);
		daughter.setIsMotherWorkingOrNot(false);
		daughter.setDaughterName("Nirusha");
		daughter.setAgeOfTheDaughter(10);
		daughter.setStudyingIn('V');
		daughter.setHeightOfTheDaughter(137.83f);
		daughter.setWeightOfTheDaughter(32.3450d);
		
		
		System.out.println("Name of the GrandMother :" +daughter.getName());
		System.out.println("Name of the Mother :" +daughter.getMotherName());
		System.out.println("Name of the Daughter :" +daughter.getDaughterName());
		System.out.println("Age of the GrandMother :" +daughter.getAge());
		System.out.println("Age of the Mother :" +daughter.getAgeOfTheMother());
		System.out.println("Age of the Daughter :" +daughter.getAgeOfTheDaughter());
		System.out.println("Height(in cm) of the GrandMother :" +daughter.getHeight());
		System.out.println("Height(in cm) of the Mother :" +daughter.getHeight());
		System.out.println("Height(in cm) of the Daughter :" +daughter.getHeightOfTheDaughter());
		System.out.println("Weight(kg) of the GrandMother :" +daughter.getWeight());
		System.out.println("Weight(kg) of the Mother :" +daughter.getWeightOfTheMother());
		System.out.println("Weight(kg) of the Daughter :" +daughter.weightOfTheDaughter);
		System.out.println("Skin color of the GrandMother :" +daughter.skinColor);
		System.out.println("Skin color of the Mother :" +daughter.getSkinColor());
		System.out.println("Skin color of the daughter :" +daughter.getSkinColor());
		System.out.println("Grand Mother is Retired :" +daughter.isGrandMotherRetiredOrNot());
		System.out.println("Mother is not working :" +daughter.isMotherWorkingOrNot);
		System.out.println("Daughter is studying in :" +daughter.getStudyingIn());
		
	
		
	}

}
