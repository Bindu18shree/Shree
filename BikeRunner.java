class BikeRunner{
	
	public static void main (String[] args){
		
		System.out.println("The Bike Name :"+Bike.name("Access 125"));
		
		System.out.println("The Colour of the Bike :"+Bike.colour("Rocker Red", "British Racing Green"));
		
		System.out.println("The price of Continental GT 650 Custom Bike :"+Bike.price(318418, 328406, 344284));
		
		System.out.println("The Wheelbase Of the Bike in mm :"+Bike.dimensions(2119, 833, 1067, 1768));
		
		System.out.println("The Fuel tank Capacity of the Bike in litres :"+Bike.dimensions(25, 211, 804, 12.5f, 6));
		
		System.out.println("The available features in the bike :"+Bike.features("No", "Digital", "Analogue", "Analogue", "Electric Start", "12V,12AH VRLA"));
		
		System.out.println("The total number of colours bike is available in :"+Bike.totalNoOfColoursAvailable("Rocker Red", "British Racing Green", "Ventura Storm", "Dux Deluxe", "Mr Clean", "Slipstream Blue", "Apex grey"));
		
	}
}