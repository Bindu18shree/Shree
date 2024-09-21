class Hill{
	
	static String name;
	static String location;
	static float price;
	static boolean camping;
	static int distance;
	static int height;
	
	public static void setName(String hillName){
		
		name = hillName;
	}
	
	public static void setLocation(String hillLocation){
		
		location = hillLocation;
	}
	
	public static void setPrice(float entryPrice){
		
		price = entryPrice;
	}
	
	public static void setCamping(boolean campingAvailability){
		
		camping = campingAvailability;
	}
	
	public static void setDistance(int trekDistance){
		
		distance = trekDistance;
	}
	
	public static void setHeight(int summitHeight){
		
		height = summitHeight;
	}
	
	
	public static void display(){
		
		System.out.println("The name of the hill :" +name);
		
		System.out.println("The location of the hill :" +location);
		
		System.out.println("The entry price per person to trek :" +price);
		
		System.out.println("The camping is available :" +camping);
		
		System.out.println("The distance of the trek in km :" +distance);
		
		System.out.println("The summit height of the hill in ft :" +height);
	}
}