class SpectaclesRunner{
	
	public static void main(String [] args){
		
		Spectacles spectacles = new Spectacles();
		
		spectacles.specs("Hustlr ACE- Crystal",24,217261l,139.98f,2999.9870d,'L',false);
		
		System.out.println("The brand and model name of the spectacles :" +spectacles.brandName("Lenskart Hustlr-Blue Sky"));
		
		System.out.println("The weight of the spectacles in grams :" +spectacles.weightOfTheSpecs(16));
		
		System.out.println("The product ID is :" +spectacles.prdctID(207481l));
		
		System.out.println("The frame width is :" +spectacles.widthOfTheFrame(139.97f));
		
		System.out.println("Price of the spectacles :" +spectacles.priceOfSpecs(2599.9820d));
		
		System.out.println("Size of the spectacles is :" +spectacles.sizeOfSpecs('M'));
		
		System.out.println("Spectacles is for unisex :" +spectacles.isItUnisex(true));
	}
}