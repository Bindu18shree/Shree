package com.xworkz.curlers.runner;

import com.xworkz.curlers.boot.HairCurler;

public class HairCurlerRunner {
	
	public static void main(String[] args) {
		
		HairCurler haircurler = new HairCurler();
		
		haircurler.setBrand("IKONIC");
		haircurler.setPatternName("Curling Tong");
		haircurler.setSize(28);
		haircurler.setColor('B');
		haircurler.setOfferPercentage(33);
		haircurler.setOfferPrice(2885.456d);
		haircurler.setMrp(3987.564d);
		haircurler.setShape("Round");
		haircurler.setHairType("Wavy");
		haircurler.setMaterial("Ceramic");
		haircurler.setModelName("Ikonic'");
		haircurler.setItemWeight(755.98f);
		haircurler.setPowerSource("Corded Electric");
		haircurler.setMinTempSetting(110);
		haircurler.setMaxTempSetting(210);
		haircurler.setProductLength(5.99f);
		haircurler.setProductWidth(5.0f);
		haircurler.setProductHeight(0.1f);
		haircurler.setManufacturer("SSIZ INTERNATIONAL");
		haircurler.setGlobalTradeIdentificationNumber("08904231000063");
		haircurler.setCountryOfOrigin("China");
		haircurler.setImportedBy("Mumbai");
		haircurler.setImportedAddressPincode(400003);
		haircurler.setTelephoneNumberOfImporter(1800120995l);
		haircurler.setItemModelNumber("CT-28m");
		haircurler.setAsin("B00V9SYGES");
		haircurler.setIsWarrantyGiven(true);
		haircurler.setNumberOfWarrantYears(1);
		haircurler.setWattage(74);
		haircurler.setUnitOfWattage('W');
		haircurler.setMinFrequency(50);
		haircurler.setMaxFrequency(60);
		haircurler.setMinVoltage(100);
		haircurler.setMaxVoltage(240);
		haircurler.setUnitOfVoltage('V');
		haircurler.setBenefitOfCurler("Volumizing");
		haircurler.setIsDigitalDisplayAvailableOnTheCurler(true);
		
		System.out.println("Object to String :" +haircurler.toString());
		
		System.out.println("hashcode of the Object haircurler :" +haircurler.hashCode());
	}

}
