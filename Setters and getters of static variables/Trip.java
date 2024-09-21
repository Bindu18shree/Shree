class Trip{
	
	static String place;
	static String adventurePlace;
	static float price;
	static int duration;
	static boolean ageLimits;
	
	
	public static void setPlace(String tripPlace){
		
		place = tripPlace;
	}
	
	public static void setAdventurePlace(String adventurePlaceToVisit){
		
		adventurePlace = adventurePlaceToVisit;
	}
	
	public static void setPrice(float pricePerPerson){
		
		price = pricePerPerson;
	}
	
	public static void setDuration(int durationOfTheGame){
		
		duration = durationOfTheGame;
	}
	
	public static void setAgeLimits(boolean ageLimitToPlayTheGame){
		
		ageLimits = ageLimitToPlayTheGame;
	}
	
	public static void display(){
		
		System.out.println("The place choosed to go for a trip is " +place);
		
		System.out.println("The Adventure Place to visit in Coorg is " +adventurePlace);
		
		System.out.println("The price per Person to play the game is " +price);
		
		System.out.println("The duration of the Game in hours is " +duration);
		
		System.out.println("There's a age limit given to play this game which is between above 15 =" +ageLimits);
	}
}
