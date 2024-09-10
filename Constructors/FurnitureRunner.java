class FurnitureRunner{
	
	public static void main(String [] args){
		
	Furniture furniture = new Furniture("FURNY-Lifestyle Fabric Sofa", 9974.9870d, 3, 30000.1500f, true, 'G', 18008438769l);
	
	System.out.println("The Name of the furniture :" +furniture.getName());
	
	System.out.println("The price of the furniture :" +furniture.getPrice());
	
	System.out.println("Seating capacity of the sofa :" +furniture.getSeatingCapacity());
	
	System.out.println("Item weight :" +furniture.getItemWeight());
	
	System.out.println("Assembly is not required for the sofa :" +furniture.isAssemblyRequiredOrNot());
	
	System.out.println("The colour of the sofa is Grey :" +furniture.getColor());
	
	System.out.println("The Landline number of the manufacturer :" +furniture.getlandLineNumberOfManufacturer());
		
		
		
		
	}
}