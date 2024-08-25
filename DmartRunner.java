class DmartRunner{
	
	public static void main(String[] args){
		
		int totalNoOfCategories = Dmart.categories(16);
		
		System.out.println("The Total Number of categories in Dmart :"+totalNoOfCategories);
		
		
		System.out.println("The total number of Dmart Stores in Karnataka and Tamilnadu :"+Dmart.stores(29,15));
		
		
		System.out.println("The total number of Staffs in Dmart including all Sections :"+Dmart.staffs(20,16,10));
		
	}
	
	
		
}