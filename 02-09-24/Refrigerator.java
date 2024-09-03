class Refrigerator{
	
	static String brandAndModel;
	static int totalCapacity;
	static float itemLength;
	static double offerPrice;
	static long articleID;
	static char colour;
	static boolean isInteriorLampPresent;
	
	public static void setBrandAndModel(String brandAndModel){
		Refrigerator.brandAndModel = brandAndModel;
	}
	
	public static void setTotalCapacity(int totalCapacity){
		Refrigerator.totalCapacity = totalCapacity;
	}
	
	public static void setItemLength(float itemLength){
		Refrigerator.itemLength = itemLength;
	}
	
	public static void setOfferPrice(double offerPrice){
		Refrigerator.offerPrice = offerPrice;
	}
	
	public static void setArticleID(long articleID){
		Refrigerator.articleID = articleID;
	}
	
	public static void setColour(char colour){
		Refrigerator.colour = colour;
	}
	
	public static void setIsInteriorLampPresent(boolean isInteriorLampPresent){
		Refrigerator.isInteriorLampPresent = isInteriorLampPresent;
	}
	
	
	public static String getBrandAndModel(){
		return brandAndModel;
	}
	
	public static int getTotalCapacity(){
		return totalCapacity;
	}
	
	public static float getItemLength(){
		return itemLength;
	}
	
	public static double getOfferPrice(){
		return offerPrice;
	}
	
	public static long getArticleID(){
		return articleID;
	}
	
	public static char getColour(){
		return colour;
	}
	
	public static boolean isInteriorLampPresent(){
		return isInteriorLampPresent;
	}
	
	
}