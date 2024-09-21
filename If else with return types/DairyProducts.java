class DairyProducts{
	
	
	public static int milk(String name, int cost, int netQuantity){
		
	
	  if(name == "Nandini" && netQuantity == 500){
		  
		 return cost;
	  }
	  
	  else{
		  return 0;
	  }

	}
	
	
	public static String curd(int netQuantity, float cost){
		
		if(netQuantity == 250 || cost == 12.5f){
			
			return "Nandini Thick Curd Pouch";
		}
		else{
			return "others";
		}
	}
	
	public static boolean paneer(String brand, int cost, int netQuantity ){
		
		if(brand == "Nandini Fresh Panner" && cost == 100){
			
			return true;
		}
		else {
			return false;
		}
	}
}  
	