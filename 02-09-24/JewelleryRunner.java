class JewelleryRunner{
	
	public static void main(String [] args){
		
		Jewellery.setTypeOfNecklace("Noyal Diamond Necklace");
		
		Jewellery.setPurity(14);
		
		Jewellery.setLength(43.18f);
		
		Jewellery.setWeight(15.85834d);
		
		Jewellery.setPrice(308139l);
		
		Jewellery.setShowRoomName('M');
		
		Jewellery.setIsDiamondPresent(true);
		
		
		String necklaceType = Jewellery.getTypeOfNecklace();
		System.out.println("The type of necklace is :" +necklaceType);
		
		int necklacePurity = Jewellery.getPurity();
		System.out.println("The purity of the necklace in KT is :" +necklacePurity);
		
		float necklaceLength = Jewellery.getLength();
		System.out.println("The length of the necklace in cm is :" +necklaceLength);
		
		double necklaceWeight = Jewellery.getWeight();
		System.out.println("The Gross weight of the necklace in g is :" +necklaceWeight);
		
		long necklacePrice = Jewellery.getPrice();
		System.out.println("The price of the necklace is :" +necklacePrice);
		
		char nameOfTheShowroom = Jewellery.getShowRoomName();
		System.out.println("The showroom name where the necklace bought is Malabar gold and Diamonds which symbolizes :" +nameOfTheShowroom);
		
		boolean diamondPresent = Jewellery.isDiamondPresent();
		System.out.println("Diamond is present in the necklace :" +diamondPresent);
	}
}