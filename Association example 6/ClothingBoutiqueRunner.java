package com.xworkz.breakfast.runner;

import com.xworkz.breakfast.boot.ClothingBoutique;
import com.xworkz.breakfast.boot.Saree;

public class ClothingBoutiqueRunner {
	
	public static void main(String [] args) {
		
		Saree saree = new Saree("Pen Kalamkari Pure Crepe Mysore Silk", 15999.9890d, 5.3f, 1.1f, 'B', false);
		
		ClothingBoutique clothingboutique = new ClothingBoutique("Dhavala Boutique", "No 500,2nd floor,4th cross road,BEML Layout 3rd stage,Rajajeshwari Nagar,Bengaluru",560098,9692442243l,10.35f,true,saree);
		
		System.out.println("Name of the boutique :" +clothingboutique.getNameOfTheBoutique());
		
		System.out.println("Address of the boutique :" +clothingboutique.getAddress());
		
		System.out.println("Pincode of the boutique :" +clothingboutique.getPincode());
		
		System.out.println("Contact number of the boutique :" +clothingboutique.getContactNumber());
		
		System.out.println("Boutique opens at(AM) :" +clothingboutique.getBoutiqueOpensAt());
		
		System.out.println("Boutique includes only traditional outfits :" +clothingboutique.isBoutiqueHasTraditionalOrWestern());
		
		System.out.println("Fabric of the saree :" +clothingboutique.saree.getFabric());
		
		System.out.println("Price of the saree :" +clothingboutique.saree.getPrice());
		
		System.out.println("Length(m) of the saree :" +clothingboutique.saree.getLength());
		
		System.out.println("Width(m) of the saree :" +clothingboutique.saree.getWidth());
		
		System.out.println("Color(Light Blue) of the saree :" +clothingboutique.saree.getColor());
		
		System.out.println("Saree is without zari :" +clothingboutique.saree.isSareeWithZariOrNot());
		 
		
	}

}
