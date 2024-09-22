package com.xworkz.pets.runner;

import com.xworkz.pets.boot.Cat;
import com.xworkz.pets.boot.Dog;

public class PetsRunner {
	
	public static void main(String [] args) {
		
		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		System.out.println("Breed of the dog :" +dog.getBreed());
		System.out.println("Life span of the dog(years) :" +dog.getLifeSpan());
		System.out.println("Dog's Gender is Female :" +dog.isPetMaleOrFemale());
		System.out.println("Price of the Dog :" +dog.getPrice());
		System.out.println("Color of the Dog(Golden) :" +dog.getColor());
		
		System.out.println("Breed of the cat :" +cat.getBreed());
		System.out.println("Life span of the cat(years) :" +cat.getLifeSpan());
		System.out.println("Weight(kg) of the cat :" +cat.getWeight());
		System.out.println("Cat is Male :" +cat.isPetMaleOrFemale());
		System.out.println("Color of the cat :" +cat.getColor());
		
		
	}

}
