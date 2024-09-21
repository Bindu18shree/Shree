class WatchRunner{
	
	public static void main(String [] args){
		
		Watch.setBrand("VERSACE");
		
		Watch.setPrice(1100000l);
		
		Watch.setDiameter(2.8f);
		
		Watch.setCaseThickness(0.699d);
		
		Watch.setColour('G');
		
		Watch.setWarranty(1);
		
		Watch.setIsItUnisexWatch(true);
		
		
		String brandOfTheWatch = Watch.getBrand();
		System.out.println("The brand of the watch is :" +brandOfTheWatch);
		
		long priceOfTheWatch = Watch.getPrice();
		System.out.println("The Price of the watch is :" +priceOfTheWatch);
		
		float diameterOfTheWatch = Watch.getDiameter();
		System.out.println("The diameter of the watch in cm is :" +diameterOfTheWatch);
		
		double caseThicknesOfTheWatch = Watch.getCaseThickness();
		System.out.println("The case thickness of the watch in cm is :" +caseThicknesOfTheWatch);
		
		char colourOfTheWatch = Watch.getColour();
		System.out.println("The dial colour of the watch is :" +colourOfTheWatch);
		
		int warrantyOfTheWatch = Watch.getWarranty();
		System.out.println("The warranty of the watch in year :" +warrantyOfTheWatch);
		
		boolean watchIsUnisexOrNot = Watch.isItUnisexWatch();
		System.out.println("The watch is only for women's :" +watchIsUnisexOrNot);
		
		
	}
}