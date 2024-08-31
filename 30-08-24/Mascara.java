class Mascara{
	
	static String brand;
	static float quantity;
	static int price;
	static String manufacturer;
	static String expiryDate;
	
	public static void setBrand(String mascaraBrand){
		brand = mascaraBrand;
	}
	
	public static void setQuantity(float netQuantity){
		quantity = netQuantity;
	}
	
	public static void setPrice(int mascaraPrice){
		price = mascaraPrice;
	}
	
	public static void setManufacturer(String mascaraManufacturer){
		manufacturer = mascaraManufacturer;
	}
	
	public static void setExpiryDate(String mascaraExpiryDate){
		expiryDate = mascaraExpiryDate;
	}
	
	
	public static String getBrand(String mascaraBrand){
		return brand;
	}
	
	public static float getQuantity(float netQuantity){
		return quantity;
	}
	
	public static int getPrice(int mascaraPrice){
		return price;
	}
	
	public static String getManufacturer(String mascaraManufacturer){
		return manufacturer;
	}
	
	public static String getExpiryDate(String mascaraExpiryDate){
		return expiryDate;
	}
}