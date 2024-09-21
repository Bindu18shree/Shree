class PG{
	
	static String name;
	static String location;
	static long contactNumber;
	static boolean foodFacility;
	static int sharing;
	static int price;
	
	
	public static void setName(String pgName){
		
		name = pgName;
	
	}
	
	public static void setLocation( String pgLocation){
		
		location = pgLocation;
	}
	
	public static void setContactNumber( long  pgContactNumber){
		
		contactNumber = pgContactNumber;
	}
	
	public static void setFoodFacility(boolean pgFoodFacility){
        
		foodFacility = pgFoodFacility;
	}
	
	public static void setSharing(int pgSharingPerRoom){

	    sharing = pgSharingPerRoom;
	}
	
	public static void setPrice(int pgPricePerPerson){
	
	    price = pgPricePerPerson;
	}
	
	public static void display(){
		
		System.out.println("The Name of the PG =" +name );
		
		System.out.println("Location of the PG =" +location);
		
		System.out.println("Contact Number of the PG =" +contactNumber);
		
		System.out.println("The food facility is not available in the PG =" +foodFacility);
		
		System.out.println("Number of sharings per Room in PG =" +sharing);
		
		System.out.println("Price of the room per person in PG =" +price);
	}
}