class Shihtzu{
	static int heightOfMale;
	static char origin;
	static float weightOfMale;
	static long price;
	static short heightOfFemale;
	static byte lifespan;
	static double weightOfFemale;
	static boolean onOrOff;
	
	public static void main(String[] args){
		
		heightOfMale = 28;
		origin = 'C';
		weightOfMale = 4.7f;
		price = 30000l;
		heightOfFemale = 11;
		lifespan = 14;
		weightOfFemale = 4.692487d;
		onOrOff = true;
		
		System.out.println("The Height of the Male Shihtzu in centimeters :"+heightOfMale);
		System.out.println("The Country of the Origin of Shihtzu is China which in short termed as :"+origin);
		System.out.println("The Weight of the Male Shihtzu in kg :"+weightOfMale);
		System.out.println("The price of the Shihtzu :"+price);
		System.out.println("The Height of the Female Shihtzu in centimeters :"+heightOfFemale);
		System.out.println("The Lifespan of the Shihtzu in years :"+lifespan);
		System.out.println("The Weight of the Female Shihtzu in kg :"+weightOfFemale);
		System.out.println("The Shihtzu is alive :"+onOrOff);
		
		
	}
}