class ITCompany{
	
	public static String name(String companyName){
		
		return companyName;
	}
	
	
	public static int staffs(int noOfEmployees, int noOfHigherPostEmployees){
		
		 int totalStaffs = noOfEmployees + noOfHigherPostEmployees;
		 
		 if(noOfEmployees == 50 && noOfHigherPostEmployees == 20){
			 
			 return totalStaffs;
		 }
		 else{
			 return 0;
		 }
	}
}