class Cycle{
	
	static String name;
	static int price;
	static float tyreVariant;
	static String brake;
	
	public static void company(String brand ){
	
	if((brand == "Hero Cycles" && name == "Hero Sprint Milano") &&(tyreVariant == 27.5f && brake == "Double Disc Brake")){
		
		System.out.println("The Price of the Hero Sprint Cycle :"+Cycle.price);
	}
	else{
		System.out.println("This is not the Hero Sprint Cycle");
	}
	
	
	if((brand != "Hero Cycles" && name == "Hero Sprint Milano") && (tyreVariant == 27.5f  &&  brake == "Double Disc Brake")){
		
		System.out.println("The Price of the Hero Sprint Cycle :" +Cycle.price);
	}
	else{
		System.out.println("This is not the Hero Sprint Cycle");
	}
	
	}
	
	
     
}