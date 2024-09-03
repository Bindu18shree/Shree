class Jewellery{
	
	static String typeOfNecklace;
	static int purity;
	static float length;
	static double weight;
	static long price;
	static char showRoomName;
	static boolean isDiamondPresent;
	
	public static void setTypeOfNecklace(String typeOfNecklace){
		Jewellery.typeOfNecklace = typeOfNecklace;
	}
	
	public static void setPurity(int purity){
		Jewellery.purity = purity;
	}
	
	public static void setLength(float length){
		Jewellery.length = length;
	}
	
	public static void setWeight(double weight){
		Jewellery.weight = weight;
	}
	
	public static void setPrice(long price){
		Jewellery.price = price;
	}
	
	public static void setShowRoomName(char showRoomName){
		Jewellery.showRoomName = showRoomName;
	}
	
	public static void setIsDiamondPresent(boolean isDiamondPresent){
		Jewellery.isDiamondPresent = isDiamondPresent;
	}
	
	
	public static String getTypeOfNecklace(){
		return typeOfNecklace;
	}
	
	public static int getPurity(){
		return purity;
	}
	
	public static float getLength(){
		return length;
	}
	
	public static double getWeight(){
		return weight;
	}
	
	public static long getPrice(){
		return price;
	}
	
	public static char getShowRoomName(){
		return showRoomName;
	}
	
	public static boolean isDiamondPresent(){
		return isDiamondPresent;
	}
}