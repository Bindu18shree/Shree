class NailPolishRunner{
	
	public static void main(String [] args){
		
		NailPolish nailPolish = new NailPolish("SUGAR POP NAIL LACQUER", 8904320722258l, 9.5f, 109.520d, 14, true, 'P');
		
		System.out.println("The brand of the nail polish :" +nailPolish.getBrand());
		
		System.out.println("Model number of the nail polish :" +nailPolish.getModelNumber());
		
		System.out.println("Quantity of the nail polish :" +nailPolish.getQuantity());
		
		System.out.println("Price :" +nailPolish.getPrice());
		
		System.out.println("Shade number of the nail polish :" +nailPolish.getShadeNumber());
		
		System.out.println("Nail polish gives the glossy finish :" +nailPolish.isItGlossyFinishOrNot());
		
		System.out.println("Nail polish shade is pink :" +nailPolish.getShade());
	}
}