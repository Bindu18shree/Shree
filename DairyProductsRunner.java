class DairyProductsRunner{
	
	public static void main(String[] args){
		
		
		int price = DairyProducts.milk("Nandini", 27, 500);
			
			System.out.println("The cost of the Nandini Standardised fresh milk for 500 ml :"+price);
			
			
		String brand = DairyProducts.curd(500, 12.5f);
		
		    System.out.println("The brand of the curd :"+brand);
			
			
		boolean name = DairyProducts.paneer("Heritage Fresh Paneer", 100, 200);
		
		    System.out.println("It is the paneer from Nandini brand :"+name);
		
	}
}