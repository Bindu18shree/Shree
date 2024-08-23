class Place{
	
	public static void main (String [] args){
		
		String name = "Rajasthan";
		String capital = "Jaipur";
		String fort = "Jaisalmer Fort";
		String hotel = "Ajanta";
		String city = "Pushkar";
		
		String [] placesToVisit = {name,capital,fort,hotel,city};
		System.out.println("The Length of the places to visit in Rajasthan :"+placesToVisit.length);
		
		placesToVisit [3] = "Hotel Rajasthan Palace";
		
		for (int i=0; i<5; i++){
			System.out.println("Places to visit " + placesToVisit[i]);
		}
		
	}
}