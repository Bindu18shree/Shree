class AutomobilesRunner{
	
	public static void main(String[] args){
		
		System.out.println("Showroom Company :"+Automobiles.name("Kia Motors"));
		
		System.out.println("Name of the Car :"+Automobiles.car("Kia Sonet", 1567830));
		
		System.out.println("The Topend Price Of the Car :"+Automobiles.price(1699000, 2019000, 2300000));
		
		System.out.println("The Colours available :"+Automobiles.colours(" Pebble Grey", "Lunar White", "Sunlit Yellow", "Coral Red"));
		
	}
}