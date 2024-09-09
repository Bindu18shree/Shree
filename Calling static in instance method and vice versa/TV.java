class TV{
	
	
	public static void staticMethod(){
	 
	   System.out.println("This is static method");
	   
	}
	
	
	public void instanceMethod(){
		
		System.out.println("This is instance method");
		
		staticMethod();
	}
}