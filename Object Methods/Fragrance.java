package com.xworkz.fragrances.boot;

public class Fragrance {
	
	public String brand;
	public String name;
	public float netQuantity;
	public Boolean isItUnisexOrNot;
	public Boolean isItForWomenOrNot;
	public float ratingsForThePerfume;
	public double offerPrice;
	public double mrp;
	public char itemForm;
	public float itemVolume;
	public String scent;
	public String specialFeature;
	public String ageRange;
	public String countryOfOrigin;
	public long itemModelNumber;
	public String asin;
	public String manufacturer;
	public float productLength;
	public float productWidth;
	public float productHeight;
	public int productWeight;
	public int offerPercent;
	public int bestSellersRank;
	public String packerAddress;
	public long packerPincode;
	public float numberOfRecentOrdersFromThisBrand;
	public float numberOfItems;
	public String ingredients;
	public String brandWebsite;
	public int refNo;
	public long barCodeNumber;
	public String purchasingOn;
	public int deliveryWithin;
	public Boolean isFreeDeliveryGivenOrNot;
	public Boolean isEMIAvailableForThisProduct;
	public Boolean isNoCostEMIAvailable;
	public float emiStartsFrom;
	
	
	public Fragrance(String brand, String name, float netQuantity, Boolean isItUnisexOrNot, Boolean isItForWomenOrNot,
			float ratingsForThePerfume, double offerPrice, double mrp, char itemForm, float itemVolume, String scent,
			String specialFeature, String ageRange, String countryOfOrigin, long itemModelNumber, String asin,
			String manufacturer, float productLength, float productWidth, float productHeight, int productWeight,
			int offerPercent, int bestSellersRank, String packerAddress, long packerPincode,
			float numberOfRecentOrdersFromThisBrand, float numberOfItems, String ingredients, String brandWebsite,
			int refNo, long barCodeNumber, String purchasingOn, int deliveryWithin, Boolean isFreeDeliveryGivenOrNot,
			Boolean isEMIAvailableForThisProduct, Boolean isNoCostEMIAvailable, float emiStartsFrom) {
		
		this.brand = brand;
		this.name = name;
		this.netQuantity = netQuantity;
		this.isItUnisexOrNot = isItUnisexOrNot;
		this.isItForWomenOrNot = isItForWomenOrNot;
		this.ratingsForThePerfume = ratingsForThePerfume;
		this.offerPrice = offerPrice;
		this.mrp = mrp;
		this.itemForm = itemForm;
		this.itemVolume = itemVolume;
		this.scent = scent;
		this.specialFeature = specialFeature;
		this.ageRange = ageRange;
		this.countryOfOrigin = countryOfOrigin;
		this.itemModelNumber = itemModelNumber;
		this.asin = asin;
		this.manufacturer = manufacturer;
		this.productLength = productLength;
		this.productWidth = productWidth;
		this.productHeight = productHeight;
		this.productWeight = productWeight;
		this.offerPercent = offerPercent;
		this.bestSellersRank = bestSellersRank;
		this.packerAddress = packerAddress;
		this.packerPincode = packerPincode;
		this.numberOfRecentOrdersFromThisBrand = numberOfRecentOrdersFromThisBrand;
		this.numberOfItems = numberOfItems;
		this.ingredients = ingredients;
		this.brandWebsite = brandWebsite;
		this.refNo = refNo;
		this.barCodeNumber = barCodeNumber;
		this.purchasingOn = purchasingOn;
		this.deliveryWithin = deliveryWithin;
		this.isFreeDeliveryGivenOrNot = isFreeDeliveryGivenOrNot;
		this.isEMIAvailableForThisProduct = isEMIAvailableForThisProduct;
		this.isNoCostEMIAvailable = isNoCostEMIAvailable;
		this.emiStartsFrom = emiStartsFrom;
	}
	
	
	public String toString() {
		return "Fragrance {brand =="+brand+", name =="+name+", netQuantity =="+netQuantity+", It is unisex == "+isItUnisexOrNot+", "
				+ "it is women's perfume == "+isItForWomenOrNot+", ratingsForThePerfume == "+ratingsForThePerfume+", "
				+ "offerPrice == "+offerPrice+", M.R.P == "+mrp+", itemForm == "+itemForm+", item volume in fluid ounces == "+itemVolume+", "
				+ "scent == "+scent+", specialFeature == "+specialFeature+", ageRange == "+ageRange+", countryOfOrigin == "+countryOfOrigin+", "
				+ "Model Number == "+itemModelNumber+", ASIN == "+asin+", manufacturer == "+manufacturer+", product Length(cm) == "+productLength+", "
				+ "product Width(cm) == "+productWidth+", product Height(cm) == "+productHeight+", product Weight(grams) == "+productWeight+", "
				+ "offerPercent == "+offerPercent+", bestSellersRank == "+bestSellersRank+", packerAddress == "+packerAddress+", "
				+ "packerPincode == "+packerPincode+", numberOfRecentOrdersFromThisBrand == "+numberOfRecentOrdersFromThisBrand+", "
				+ "numberOfItems == "+numberOfItems+", ingredients == "+ingredients+", brandWebsite == "+brandWebsite+", "
				+ "refNo == "+refNo+", barCodeNumber == "+barCodeNumber+", purchasingOn == "+purchasingOn+", deliveryWithin(days) == "+deliveryWithin+", "
				+ "isFreeDeliveryGivenOrNot == "+isFreeDeliveryGivenOrNot+", isEMIAvailableForThisProduct == "+isEMIAvailableForThisProduct+", "
				+ "isNoCostEMIAvailable == "+isNoCostEMIAvailable+", emiStartsFrom == "+emiStartsFrom+"}";
	}
	
	
	public int hashCode() {
		
		final int prime = 31;
		int  result = 1;
		
		result = prime * result + brand.hashCode();
				
		result = prime * result + name.hashCode();
		
		result = prime * result + (int) netQuantity;
		
		result = prime * result + isItUnisexOrNot.hashCode();
		
		result = prime * result + isItForWomenOrNot.hashCode();
		
		result = prime * result + (int) ratingsForThePerfume;
		
		result = prime * result + (int) offerPrice;
		
		result = prime * result + (int) mrp;
		
		result = prime * result + itemForm;
		
		result = prime * result + (int) itemVolume;
		
		result = prime * result + scent.hashCode();
		
		result = prime * result + specialFeature.hashCode();
		
		result = prime * result + ageRange.hashCode();
		
		result = prime * result + countryOfOrigin.hashCode();
		
		result = prime * result + (int) itemModelNumber;
		
		result = prime * result + asin.hashCode();
		
		result = prime * result + manufacturer.hashCode();
		
		result = prime * result + (int) productLength;
		
		result = prime * result + (int) productWidth;
		
		result = prime * result + (int) productHeight;
		
		result = prime * result + productWeight;
		
		result = prime * result + offerPercent;
		
		result = prime * result + bestSellersRank;
		
		result = prime * result + packerAddress.hashCode();
		
		result = prime * result + (int) packerPincode;
		
		result = prime * result + (int) numberOfRecentOrdersFromThisBrand;
		
		result = prime * result + (int) numberOfItems;
		
		result = prime * result + ingredients.hashCode();
		
		result = prime * result + brandWebsite.hashCode();
		
		result = prime * result + refNo;
		
		result = prime * result + (int) barCodeNumber;
		
		result = prime * result + purchasingOn.hashCode();
		
		result = prime * result + deliveryWithin;
		
		result = prime * result + isFreeDeliveryGivenOrNot.hashCode();
		
		result = prime * result + isEMIAvailableForThisProduct.hashCode();
		
		result = prime * result + isNoCostEMIAvailable.hashCode();
		
		result = prime * result + (int) emiStartsFrom;
		
		return result;
		
	}
	
	

}
