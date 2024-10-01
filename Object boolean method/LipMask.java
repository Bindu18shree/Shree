package com.xworkz.skincare.boot;

public class LipMask {
	
	public String brand;
	public String name;
	public int cost;
	public int numberOfMoistureHour;
	public String expiryDate;
	public float netQuantity;
	public String countryOfOrigin;
	public boolean isItGlossyFinish;
	public long importerPincode ;
	public String importer;
	
	
	public LipMask(String brand, String name, int cost, int numberOfMoistureHour, String expiryDate, float netQuantity,
			String countryOfOrigin, boolean isItGlossyFinish, long importerPincode, String importer) {
	
		this.brand = brand;
		this.name = name;
		this.cost = cost;
		this.numberOfMoistureHour = numberOfMoistureHour;
		this.expiryDate = expiryDate;
		this.netQuantity = netQuantity;
		this.countryOfOrigin = countryOfOrigin;
		this.isItGlossyFinish = isItGlossyFinish;
		this.importerPincode = importerPincode;
		this.importer = importer;
	}
	
    public boolean equals(Object obj) {
		
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		LipMask lipmask = (LipMask) obj;
		
		return brand.equals(lipmask.brand) && name.equals(lipmask.name) && cost == lipmask.cost && numberOfMoistureHour == lipmask.numberOfMoistureHour
			   && expiryDate.equals(lipmask.expiryDate) && netQuantity == lipmask.netQuantity && countryOfOrigin.equals(lipmask.countryOfOrigin)
			   && isItGlossyFinish == lipmask.isItGlossyFinish && importerPincode == lipmask.importerPincode
			   && importer.equals(lipmask.importer);
	
    }

}
