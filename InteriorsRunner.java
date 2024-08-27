class InteriorsRunner{
	
	public static void main(String [] args){
		
		String name = Interiors.name("D'LIFE Interiors");
		
		System.out.println("The Leading Interior Designer Company  :" +name);
		
		
		
		String islandKitchenModels = Interiors.customisedModularKitchen("Axoloti");
		
		System.out.println("The Models of the Island Kitchen :" +islandKitchenModels);
		
		
		
		float price = Interiors.price("Ivory", 6.8f);
		
		System.out.println("The cost for the Ivory Model Kitchen Interior in lakhs :" +price);
		
		
		int maxCost = Interiors.maxPrice("Sandy",  12);
		
		System.out.println("The  max cost of the Ivory model Kitchen Interior in lakhs :" +maxCost);
	}
}