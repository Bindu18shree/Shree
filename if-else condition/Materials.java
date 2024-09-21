class Materials{
	
	public static void diamond(String madeUpOfElement, float percentageUsed){
		
		if(madeUpOfElement == "Carbon" && percentageUsed == 99.5f ){
			System.out.println("The material is Diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Carbon" && percentageUsed == 98.2){
			System.out.println("It is  diamond");
		}
		else{
			System.out.println("It is not diamod");
		}
		
		if(madeUpOfElement == "Chemical" && percentageUsed == 99.5){
			System.out.println("It is  diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Chemical" && percentageUsed == 98.2){
			System.out.println("It is diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Carbon" || percentageUsed == 99.5){
			System.out.println("It is diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Carbon" || percentageUsed == 98.5){
			System.out.println("It is diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Chemical" || percentageUsed == 99.5){
			System.out.println("It is diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
		
		if(madeUpOfElement == "Chemical" || percentageUsed == 98.5){
			System.out.println("It is diamond");
		}
		else{
			System.out.println("It is not diamond");
		}
	}
}