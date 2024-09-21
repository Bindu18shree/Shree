class Lays{
	static int price;
	static char color;
	static byte shelfLife;
	static short netWeight;
	static long  energy;
	static float dietaryFibre; 
	static double protien;
	static boolean onOff;
	
	public static void main(String[] args){
		price = 50;
		color = 'Y';
		shelfLife = 06;
		netWeight = 100;
		energy = 554l;
		dietaryFibre = 3.5f;
		protien = 6.800000d;
		onOff = true;
		
		System.out.println("The price of the Lays is :"+price);
		System.out.println("The color of the Lays is Yellow which in short termed as :"+color);
		System.out.println("The Shelf Life of the Lays is given in months as :"+shelfLife);
		System.out.println("The netWeight is given in grams as :"+netWeight);
		System.out.println("The Energy getting from the Lays is given in kcal as :"+energy);
		System.out.println("The Dietary Fibre present in the Lays is given in grams as :"+dietaryFibre);
		System.out.println("The Protien source in the Lays is also given in grams as :"+protien);
		System.out.println("The Lays is good or expired is given as On/Off :"+true);
		
	}
}