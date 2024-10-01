package com.xworkz.skincare.boot;

public class FaceSerum {
	
	public String brand;
	public double cost;
	public int size;
	public long modelNumber;
	public String asin;
	public float productLength;
	public float productWidth;
	public float productHeight;
	public boolean isItParabeenFree;
	public boolean isItForAllSKinTypes;
	
	
	public FaceSerum(String brand, double cost, int size, long modelNumber, String asin, float productLength,
			float productWidth, float productHeight, boolean isItParabeenFree, boolean isItForAllSKinTypes) {
		
		this.brand = brand;
		this.cost = cost;
		this.size = size;
		this.modelNumber = modelNumber;
		this.asin = asin;
		this.productLength = productLength;
		this.productWidth = productWidth;
		this.productHeight = productHeight;
		this.isItParabeenFree = isItParabeenFree;
		this.isItForAllSKinTypes = isItForAllSKinTypes;
	}
	
	public boolean equals(Object obj) {
		 
		if(this == obj) {
			
			return true;
		}
		
		if(obj == null || getClass() != obj.getClass()) {
			
			return false;
		}
		
		FaceSerum faceserum = (FaceSerum) obj;
		
		return brand.equals(faceserum.brand) && cost == faceserum.cost && size == faceserum.size 
			   && modelNumber == faceserum.modelNumber && asin.equals(faceserum.asin) 
			   && productLength == faceserum.productLength && productWidth == faceserum.productWidth 
			   && productHeight == faceserum.productHeight && isItParabeenFree == faceserum.isItParabeenFree 
			   && isItForAllSKinTypes == faceserum.isItForAllSKinTypes ;
			   
	}
}
