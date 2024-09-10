class Wire{
	
	String brand;
	
	int noOfCableStrand;
	
	long voltage;
	
	char color;
	
	float itemHeight;
	
	double itemWidth;
	
	boolean isOriginOfWireFromIndiaOrNot;
	
	
	
	public Wire(String brand,int noOfCableStrand, long voltage, char color, float itemHeight, double itemWidth, boolean isWireOriginFromIndiaOrNot){
		
		this.brand = brand;
		
		this.noOfCableStrand = noOfCableStrand;
		
		this.voltage = voltage;
		
		this.color = color;
		
		this.itemHeight = itemHeight;
		
		this.itemWidth = itemWidth;
		
		this.isOriginOfWireFromIndiaOrNot = isOriginOfWireFromIndiaOrNot;
	}
	
	
	public String getBrand(){
		return brand;
	}
	
	public int getNoOfCableStrand(){
		return noOfCableStrand;
	}
	
	public long getVoltage(){
		return voltage;
	}
	
	public char getColor(){
		return color;
	}
	
	public float getItemHeight(){
		return itemHeight;
	}
	
	public double getItemWidth(){
		return itemWidth;
	}
	
	public boolean isOriginOfWireFromIndiaOrNot(){
		return isOriginOfWireFromIndiaOrNot;
	}
}