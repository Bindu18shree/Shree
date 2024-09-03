class Eyeliner{
	
	static String brand;
	
	public static void cost(int price){
		
		switch (price){
		
		case 390:
		brand = "e.l.f. Cosmetics";
		break;
		
		
		case 389:
		brand = "Maybelline New York";
		break;
		
		
		case 234:
		brand = "Lakme";
		break;
		
		
		case 449:
		brand = "Kay beauty";
		break;
		
		
		case 260:
		brand = "Nykaa Cosmetics";
		break;
		
		
		case 764:
		brand = "L'Oreal Paris";
		break;
		
		
		case 2400:
		brand = "FENTY BEAUTY";
		break;
		
		
		case 1650:
		brand = "Huda Beauty";
		break;
		
		case 339:
		brand = "Faces Canada";
		break;
		
		
		case 396:
		brand = "Colorbar";
		break;
		}
		
		System.out.println("The brand of the Eyeliner is :"+brand);
		
	}
}