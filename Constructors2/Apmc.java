class Apmc{

	long commiteeMemberNumber = 8174232478l;
	
	private Apmc(){
		
	     System.out.println("This is constructor method");
	}
	
	public static Apmc run(){
		
		Apmc apmc = new Apmc();
		
		return apmc;
	}
}