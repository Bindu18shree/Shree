class Holiday{
	
	public static int wayanad(String resort,int price, int tax){
		
		price = 16000;
		
		tax = 2600;
		
		int cost = price + tax;
		
		return cost;
	}
	
	public static String facilities(int roomService, String wiFi, String parking){
		
		
		return "Swimming Pool, Free Parking, 24-hour Room Service, Dry Cleaning Service, Power Backup, Elevator/lift, Refrigirator, Telephone, Free WiFi ";
	
	}
	
	
	public static String healthandWellness(String exercise, String otherExercise ){
		
		if(exercise == "Gym" && otherExercise == "Yoga"){
			
			return "Gym, Yoga, Meditation Room, First-aid Services , Activity Centre";
		}
		else{
			return "No Health&Wellness Facilities given";
		}
	}
	
}