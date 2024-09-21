class Railways{
	
	static String founded;
	static String owner;
	static String areaServed;
	
	public static void name(String nativeName){
		
		int employees = 1212882;
		
		
		if((founded == "12 September 1837"  &&  owner == "Ministry of Railways, Government of India" ) || (areaServed == "India"  &&  employees == 1212882)){
			
			System.out.println("This is the Indian Railways");
		}
		else{
			System.out.println("This is not the Indian Railways");
		}
		
		
		if((founded == "12 September 1837"  &&  owner != "Ministry of Railways, Government of India" ) || (areaServed == "India" && employees == 1212882)){
			
			System.out.println("This is the Indian Railways");
		}
		else{
			System.out.println("This is not the Indian Railways");
		}
		
		
		if((founded == "12 September 1837"  &&  owner != "Ministry of Railways, Government of India" ) || (areaServed == "India" && employees != 1212882)){
			
			System.out.println("This is the Indian Railways");
		}
		else{
			System.out.println("This is not the Indian Railways");
		}
	}
}