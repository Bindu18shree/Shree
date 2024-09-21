class Pets{
	
	static String colour;
	static float weight;
	static int price;
	static int lifeSpan;
	
	public static void cat(String breed){
		
		if((breed == "Himalayan Cat" ||  colour == "White or cream with seal points" ) && (weight == 10.2f ||  lifeSpan == 15 )){
			
			System.out.println("The price of the cat is " +Pets.price);
		}
		else{
			System.out.println("The cat is of other breed");
		}
		
		
		if((breed == "Himalayan Cat" ||  colour == "White or cream with seal points") && (weight == 10.2f  &&  lifeSpan != 15)){
			
			System.out.println("The price of the cat is " +Pets.price);
		}
		else{
			System.out.println("The cat is of other breed");
		}
		
		
		if((breed == "Himalayan Cat" ||  colour != "White or cream with seal points") || (weight == 10.2f  &&  lifeSpan == 15)){
			
			System.out.println("The price of the cat is " +Pets.price);
		}
		else{
			System.out.println("The cat is of other breed");
		}
	}
}