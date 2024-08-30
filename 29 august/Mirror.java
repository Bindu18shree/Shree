class Mirror{
	
	static String type;
	static String code;
	static int weight;
	static double height;
	static float length;
	static int price;
	
	public static void setType(String mirrorType){
		
		type = mirrorType;
	}
	
	public static void setCode(String productCode){
		
		code = productCode;
	}
	
	public static void setWeight(int mirrorWeight){
		
		weight = mirrorWeight;
	}
	
	public static void setHeight(double mirrorHeight){
		
		height = mirrorHeight;
	}
	
	public static void setLength(float mirrorLength){
		
		length = mirrorLength;
	}
	
	public static void setPrice(int mirrorPrice){
		
		price = mirrorPrice;
	}
	
	
	
	public static void display(){
		
		System.out.println("The mirror is of type :" +type);
		
		System.out.println("The product code is :" +code);
		
		System.out.println("The weight of the mirror in gm is :" +weight);
		
		System.out.println("The height of the mirror in cm is :" +height);
		
		System.out.println("The length of the mirror in cm is :" +length);
		
		System.out.println("The price of the mirror is :" +price);
	}
	
}