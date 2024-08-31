class plant{
	
	static String name;
	static String benefits;
	static int cost;
	static float rating;
	static boolean isPetFriendlyOrNot;
	
	public static void setName(String plantName){
		name = plantName;
	}
	
	public static void setBenefits(String plantBenefits){
		benefits = plantBenefits;
	}
	
	public static void setCost(int plantCost){
		cost = plantCost;
	}
	
	public static void setRating(float plantRating){
		rating = plantRating;
	}
	
	public static void setIsPetFriendlyOrNot(boolean isPlantPetFriendlyOrNot){
		isPetFriendlyOrNot = isPlantPetFriendlyOrNot;
	}
	
	
	
	public static String getName(String plantName){
		return name;
	}
	
	public static String getBenefits(String plantBenefits){
		return benefits;
	}
	
	public static int getCost(int plantCost){
		return cost;
	}
	
	public static float getRating(float plantRating){
		return rating;
	}
	
	public static boolean getIsPetFriendlyOrNot(boolean isPlantPetFriendlyOrNot){
		return isPetFriendlyOrNot;
	}
}