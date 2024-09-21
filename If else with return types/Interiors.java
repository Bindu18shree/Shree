class Interiors{
	
	
	public static String name(String designerCompanyName){
		
		return designerCompanyName;
	}
	
	public static String customisedModularKitchen(String IslandKitchen){
		
		return "Ivory, Sandy, Mauve, Orchid, Avocado, Bark, Niagara, Excalibur";
	}
	
	
	public static float price(String model, float cost){
		
		if(model == "Ivory" && cost == 6.8f ){
			
			return cost;
		}
		else{
			return 7.2f;
		}
	}
		
		
	public static int maxPrice(String model, int price){
		
		if(model == "Ivory" || price == 12 ){
			
			return price;
		}
		else{
			return 0;
		}
	
		
		
	}
}