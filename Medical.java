class Medical{
	
	public static void main (String[] args){
		
		String name = "Paradol";
		int cost = 38;
		byte quantity = 5;
		
		if (name == "paradol" && quantity == 5){
			cost = 38;
		}
		if (name == "Dolo" && quantity == 2){
			cost = 10;
		}
		if (name == "cipla" && quantity == 6){
			cost = 25;
		}
		if (name == "TabEliwel" && quantity == 10){
			cost = 98;
		}
		if (name == "DROTIKIND M" && quantity == 12){
			cost =56;
		}
		System.out.println("The Cost of the Tablet Paradol :"+cost);
	}
}