class MicroWaveOven{
	
	static String brand;
	static int price;
	static float weight;
	static String dimensions;
	static int capacity;
	static int wattage;

	
	
	public static void setBrand(String ovenBrand){
		brand = ovenBrand;
	}
	
	public static void setPrice(int ovenPrice){
		price = ovenPrice;
	}
	
	public static void setWeight(float ovenWeight){
		weight = ovenWeight;
	}
	
	public static void setDimensions(String ovenDimensions){
		dimensions = ovenDimensions;
	}
	
	public static void setCapacity(int ovenCapacity){
		capacity = ovenCapacity;
	}
	
	public static void setWattage(int ovenWattage){
		wattage = ovenWattage;
	}
	

	
	
	
	
	public static String getBrand( ){
		return brand;
	}
	
	public static int getPrice( ){
		return price;
	}
	
	public static float getWeight(){
		return weight;
	}
	
	public static String getDimensions(){
		return dimensions;
	}
	
	public static int getCapacity(){
		return capacity;
	}
	
	public static int getWattage(){
		return wattage;
	}
	

	
	
	
	
}