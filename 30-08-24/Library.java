class Library{
	
	static String name;
	static String location;
	static int pincode;
	static float opens;
	static double closes;
	static String offers;
	
	public static void setName(String libraryName){
		name = libraryName;
	}
	
	public static void setLocation(String libraryLocation){
		location = libraryLocation;
	}
	
	public static void setPincode(int libraryPincode){
		pincode = libraryPincode;
	}
	
	public static void setOpens(float libraryOpensAt){
		opens = libraryOpensAt;
	}
	
	public static void setCloses(double libraryClosesAt){
		closes = libraryClosesAt;
	}
	
	public static void setOffers(String libraryOffers){
		offers = libraryOffers;
	}
	
	
	public static String getName(String libraryName){
		return name;
	}
	
	public static String getLocation(String libraryLocation){
		return location;
	}
	
	public static int getPincode(int libraryPincode){
		return pincode;
	}
	
	public static float getOpens(float libraryOpensAt){
		return opens;
	}
	
	public static double getCloses(double libraryClosesAt){
		return closes;
	}
	
	public static String getOffers(String libraryOffers){
		return offers;
	}
}