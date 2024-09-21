class Insurance{
	
	public static void lic(String productName, int planNo){
		
		if(productName == "Jeevan Anand" && planNo == 915){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Anand" && planNo == 860){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Tarun" && planNo == 915){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Tarun" && planNo == 860){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Anand" || planNo == 915){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Anand" || planNo == 860){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Tarun" || planNo == 915){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
		
		if(productName == "Jeevan Tarun" || planNo == 860){
			System.out.println("It is Endowment plan");
		}
		else{
			System.out.println("It is not Endowment plan");
		}
	}
}