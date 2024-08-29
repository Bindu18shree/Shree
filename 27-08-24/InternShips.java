class InternShips{
	
	static String role;
	static int duration;
	static boolean stipend;
	
	public static void company(String name){
		
		if((name == "Amazon" && role == "Software Development Engineer") && (name != "Amazon" && role == "Software Development Engineer")){
			
			System.out.println("The Stipend is given :"+InternShips.stipend);
		}
		else{
			System.out.println("The Stipend is not given");
		}
		
	    
		if((name == "Amazon" || role != "Software Development Engineer") && (name != "Amazon" && role == "Software Development Engineer")){
			
			System.out.println("The Stipend is given :"+InternShips.stipend);
		}
		else{
			System.out.println("The Stipend is not given");
		}
		
		
		if((name == "Amazon" && role == "Software Development Engineer") || (name != "Amazon" || role != "Software Development Engineer")){
			
			System.out.println("The Stipend is given :"+InternShips.stipend);
		}
		else{
			System.out.println("The Stipend is not given");
		}
		
	}
}