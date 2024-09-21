class BagRunner{
	
	public static void main(String [] args){
		
		Bag bag = new Bag();
		
		
		
		bag.bagMethod1("American Tourist",1764.85900d,92.4f,4290,'M',false,400024l);
		
		
		System.out.println("The brand of the bag is :" +bag.company("SAFARI RAY Check-in Trolley Bag"));
		
		System.out.println("The price of the bag :" +bag.cost(3199.8790000d));
		
		System.out.println("The storage volume in litres :" +bag.space(97.8f));
		
		System.out.println("The Weight of the Bag in grams :" +bag.weight(4600));
		
		System.out.println("The size of the bag is :" +bag.sizeOfBag('L'));
		
		System.out.println("The bag is water resistance :" +bag.isWaterResistance(true));
		
		System.out.println("The pincode of the manufacturer of the bag :" +bag.pincode(400059l));
		
		
	}
}