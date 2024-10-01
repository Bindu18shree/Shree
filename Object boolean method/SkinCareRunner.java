package com.xworkz.skincare.runner;

import com.xworkz.skincare.boot.*;

public class SkinCareRunner {
	
	public static void main(String[] args) {
		
		FaceWash facewash = new FaceWash();
		
		facewash.brand = "Cetaphil";
		facewash.netQuantity = 1000;
		facewash.mrp = 1599.980f;
		facewash.offerPrice = 1359.990d;
		facewash.offerPercent = 15;
		facewash.modelNumber = "8906005273420";
		facewash.asin = "B07JGHSX4Z";
		facewash.isItForAllSkinTypes = true;
		facewash.isItUnscented = true;
		facewash.productBenefits = "Gentle Cleansing and Effective Moisturization";
		
		System.out.println("Object class is equals to class FaceWash :" +facewash.equals(facewash));
		
		
		
		FaceSerum faceserum = new FaceSerum("The Face Shop", 2499.9854d, 50, 56000483l, "B01HTWD1QG", 13.84f, 4.95f, 4.83f, true, true);
		
		System.out.println("Object class is equal to class FaceSerum :" +faceserum.equals(faceserum));
		System.out.println("Object class is equal to class FaceSerum :" +faceserum.equals(facewash));
		
		
		
		FaceMoisturizer facemoisturizer = new FaceMoisturizer();
		
		facemoisturizer.setIsItOilFreeMoisturizer(true);
		facemoisturizer.setBrand("RE'EQUIL");
		facemoisturizer.setNetQuantity(100.0f);
		facemoisturizer.setCost(295.87d);
		facemoisturizer.setProductBenefits("Hydrating");
		facemoisturizer.setIngredients("Glycerin");
		facemoisturizer.setIsItForUnisex(false);
		facemoisturizer.setModelNumber("Lyraofm001");
		facemoisturizer.setAsin("B082NL4SNP");
		facemoisturizer.setCountryOfOrigin("India");
		
		System.out.println("Object class is equals to class FaceMoisturizer :" +facemoisturizer.equals(facemoisturizer));
		
		
		
		SunScreen sunscreen = new SunScreen("Dr.Sheth's", "Ceramide & Vitamin", 'C', 50, true, 50, false,"B0D25ZHF8R", "India", 698.93f);
		
		System.out.println("Object class is equals to class sunscreen :" +sunscreen.equals(sunscreen));
		
		
		
		LipBalm lipbalm = new LipBalm();
		
		lipbalm.brand = "LANEIGE";
		lipbalm.flavour = "Berry";
		lipbalm.cost = 750;
		lipbalm.modelNumber = 270282122l;
		lipbalm.asin = "B0968NKZ1L";
		lipbalm.netQuantity = 10.0f;
		lipbalm.globalTradeIdentificationNumber = "08809803517294";
		lipbalm.isItGlossyFinish = false;
		lipbalm.countryOfOrigin = "Republic of Korea";
		lipbalm.ratings = 4.4f;
		
		System.out.println("Object class is equals to class LipBalm :" +lipbalm.equals(lipbalm));
		
		
		
		Toner toner = new Toner("COSRX", 1499.984d, 100, "CR_COS0003", "B00PBX3L7K", 2.54f, 2.03f, 5.08f, true, true);
	
		System.out.println("Object class is equals to class Toner :" +toner.equals(toner));
		
		
		
		FaceMask facemask = new FaceMask("THE ORDINARY", 1280.90f, 30, "HY-XW46-SKM2", "B0771M8WXW", "AHA & BHA", 30, 2, "Brightening", "769915191264");
		
		System.out.println("Object class is equals to class face mask :" +facemask.equals(facemask));
		
		
		
		UnderEyeCream undereyecream = new UnderEyeCream("Pilgrim", true, 435, 30, true, true, true, "15 September 2025", "India", 400093);
		
		System.out.println("Object class is equals to class UnderEyeCream :" +undereyecream.equals(undereyecream));
		
		
		
		BodyLotion bodylotion = new BodyLotion("Nivea", "Vitamin", 'C', true, 40, 400, true, 8983023410l, "India", 495.980f);
		
		System.out.println("Object class is equals to class BodyLotion :" +bodylotion.equals(bodylotion));
		
		
		LipMask lipmask = new LipMask("The Face Shop", "The Therapy Lipcerin", 1750, 12, "15 December 2026", 15.0f, "South Korea", false, 400018l, "Holistique Beauty Products Pvt Ltd");
		
		System.out.println("Object class is equals to class LipMask :" +lipmask.equals(lipmask));
	}

}
