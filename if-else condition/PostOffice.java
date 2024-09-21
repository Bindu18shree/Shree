class PostOffice{
	
	static String address;
	
	
	public static void contacts(long contactNumber){
		
		String website = "indiapost.gov.in";
		
		if((address == "No. 829, Nagasandra, Bangalore - 560073(HMT Layout)" ||  website == "indiapost.gov.in" ) && (address != "No. 829, Nagasandra, Bangalore - 560073(HMT Layout)" ||  website == "indiapost.gov.in" )){
			
			System.out.println("The contact Number of the post office is 18002666868" );
		}
		else{
			System.out.println("The contact number is of different postoffice");
		}
		
		
	}
}