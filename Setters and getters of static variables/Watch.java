class Watch{
	
	static String brand;
	static long price;
	static float diameter;
	static double caseThickness;
	static char colour;
	static int warranty;
	static boolean isItUnisexWatch;
	
	
	public static void setBrand(String brand){
		Watch.brand = brand;
	}
	
	public static void setPrice(long price){
		Watch.price = price;
	}
	
	public static void setDiameter(float diameter){
		Watch.diameter = diameter;
	}
	
	public static void setCaseThickness(double caseThickness){
		Watch.caseThickness = caseThickness;
	}
	
	public static void setColour(char colour){
		Watch.colour = colour;
	}
	
	public static void setWarranty(int warranty){
		Watch.warranty = warranty;
	}
	
	public static void setIsItUnisexWatch(boolean isItUnisexWatch){
		Watch.isItUnisexWatch = isItUnisexWatch;
	}
	
	
	
	public static String getBrand(){
		return brand;
	}
	
	public static long getPrice(){
		return price;
	}
	
	public static float getDiameter(){
		return diameter;
	}
	
	public static double getCaseThickness(){
		return caseThickness;
	}
	
	public static char getColour(){
		return colour;
	}
	
	public static int getWarranty(){
		return warranty;
	}
	
	public static boolean isItUnisexWatch(){
		return isItUnisexWatch;
	}
}