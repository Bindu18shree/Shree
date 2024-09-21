class NosePinRunner{
	
	public static void main(String [] args){
		
		NosePin nosePin = new NosePin();
		
		nosePin.name = "Sunflower Nose Pin";
		
		String nameOfTheNosePin = nosePin.name;
		
		System.out.println("The name of the NosePin is :" +nameOfTheNosePin);
		
		
		nosePin.shopName = "Aahaana Mooguthi";
		
		String nameOfTheShop = nosePin.shopName;
		
		System.out.println("The NosePin is from the Shop :" +nameOfTheShop);
		
		
		nosePin.price = 22899;
		
		int nosePinPrice = nosePin.price;
		
		System.out.println("The price of the nosepin is :" +nosePinPrice);
		
		
		nosePin.material = 22;
		
		int materialOfTheNosePin = nosePin.material;
		
		System.out.println("The material of the Nosepin in KT is :" +materialOfTheNosePin);
		
		
		nosePin.width = 1.3f;
		
		float widthOfTheNosePin = nosePin.width;
		
		System.out.println("The width of the NosePin in cm is :" +widthOfTheNosePin);
		
		
		nosePin.weight = 1.78467d;
		
		double weightOfTheNosePin = nosePin.weight;
		
		System.out.println("The Approx. weight of the NosePin in grams is :" +weightOfTheNosePin);
	}
}