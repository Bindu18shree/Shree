class Furniture{
	
	String name;
	
	double price;
	
	int seatingCapacity;
	
	float itemWeight;
	
	boolean isAssemblyRequiredOrNot;
	
	char color;
	
	long landLineNumberOfManufacturer;
	
	
	
	public Furniture(String name, double price, int seatingCapacity, float itemWeight, boolean isAssemblyRequiredOrNot, char color, long landLineNumberOfManufacturer){
		
		this.name = name;
		
		this.price = price;
		
		this.itemWeight = itemWeight;
		
		this.isAssemblyRequiredOrNot = isAssemblyRequiredOrNot;
		
		this.color = color;
		
		this.landLineNumberOfManufacturer = landLineNumberOfManufacturer;
		
	}
	
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getSeatingCapacity(){
		return seatingCapacity;
	}
	
	public float getItemWeight(){
		return itemWeight;
	}
	
	public boolean isAssemblyRequiredOrNot(){
		return isAssemblyRequiredOrNot;
	}
	
	public char getColor(){
		return color;
	}
	
	public long getlandLineNumberOfManufacturer(){
		return landLineNumberOfManufacturer;
	}
}