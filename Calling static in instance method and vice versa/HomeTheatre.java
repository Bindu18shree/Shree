class HomeTheatre{
	
	public static void staticMethod(){
		
		
		HomeTheatre homeTheatre = new HomeTheatre ();
		
		homeTheatre.instanceMethod();
	}
	
	
	public void instanceMethod(){
		
		System.out.println("This is instance method");
	}
}