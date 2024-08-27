class FestivalRunner{
	
	public static void main(String [] args){
		
		boolean date = Festival.krishnaJanmashtami("26/08/2024");
		
		System.out.println("The krishna Janmashtami is on 26/08/2024 :"+date);
		
		
		int cost = Festival.garland(500, 650, 1400);
		
		System.out.println("The total cost of Jasmine garland, Champaka flower garland and Lotus garland is "  +cost);
		
		
		String temple = Festival.temple("Iskcon Temple Bangalore", "Rajajinagar");
		
		System.out.println("Everyone Visits this temple on the day of krishna Janmashtami which is popular in Bangalore :" +temple);
	}
}