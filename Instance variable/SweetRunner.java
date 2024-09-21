class SweetRunner{
	
	public static void main(String [] args){
		
		Sweet sweet = new Sweet();
		
		sweet.sweetFromTheShop = "Kanti Sweets";
		
		String shopName = sweet.sweetFromTheShop;
		
		System.out.println("The sweet is from the shop :" +shopName);
		
		
		sweet.sweetName = "Kaju Katli";
		
		String nameOfTheSweet = sweet.sweetName;
		
		System.out.println("The sweet name is :" +nameOfTheSweet);
		
		
		sweet.quantityOfTheSweet = 500;
		
		int totalQuantity = sweet.quantityOfTheSweet;
		
		System.out.println("The quantity of the sweet in grams :" +totalQuantity);
		
		
		sweet.totalCost = 571.4254000d;
		
		double costOfTheSweet = sweet.totalCost;
		
		System.out.println("The cost of the sweet for 500 gms is :" +costOfTheSweet);
		
		
		sweet.kCal = 478.6f;
		
		float totalKCal = sweet.kCal;
		
		System.out.println("The total KCal in the sweet is :" +totalKCal);
	}
}