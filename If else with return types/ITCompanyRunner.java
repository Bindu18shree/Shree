class ITCompanyRunner{
	
	public static void main(String [] args){
		
		String name = ITCompany.name("NetApp");
		
		System.out.println("The IT Comapny Name :" +name);
		
		
		
		int staffs = ITCompany.staffs(50, 20);
		
		System.out.println("The total number of employees in the Company :"+staffs);
	}
}