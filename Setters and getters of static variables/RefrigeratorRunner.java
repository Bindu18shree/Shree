class RefrigeratorRunner{
	
	public static void main(String [] args){
		
		Refrigerator.setBrandAndModel("Brand = Haier , Model = HRT-683KG");
		
		Refrigerator.setTotalCapacity(598);
		
		Refrigerator.setItemLength(69.7f);
		
		Refrigerator.setOfferPrice(101490.56000d);
		
		Refrigerator.setArticleID(492664774l);
		
		Refrigerator.setColour('B');
		
		Refrigerator.setIsInteriorLampPresent(true);
		
		
		RefrigeratorRunner.runner();
	}
	
	
	public static void runner(){
		
		String brandAndModelOfRefrigerator = Refrigerator.getBrandAndModel();
		
		System.out.println("The brand and model of the Refrigerator is :"+brandAndModelOfRefrigerator);
		
		int totalCapacityOfTheRefrigerator = Refrigerator.getTotalCapacity();
		
		System.out.println("The total capacity of the Refrigerator in litres is :" +totalCapacityOfTheRefrigerator);
		
		float lengthOfTheRefrigerator = Refrigerator.getItemLength();
		
		System.out.println("The length of the refrigerator in cm is :" +lengthOfTheRefrigerator);
		
		double offerPriceOfRefrigerator = Refrigerator.getOfferPrice();
		
		System.out.println("The Offer price of the Refrigerator is :"+offerPriceOfRefrigerator);
		
		long articleIDOfTheRefrigerator = Refrigerator.getArticleID();
		
		System.out.println("The Article ID of the refrigerator is :" +articleIDOfTheRefrigerator);
		
		char colourOfTheRefrigerator = Refrigerator.getColour();
		
		System.out.println("The colour of the refrigerator is black which in short termed as :" +colourOfTheRefrigerator);
		
		boolean interiorLampPresent = Refrigerator.isInteriorLampPresent();
		
		System.out.println("The Interior Lamp is present in the Refrigerator :" +interiorLampPresent);
	}
}