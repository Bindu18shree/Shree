class Spectacles{
	
	String name;
	int weight;
	long productID;
	float frameWidth;
	double price;
	char size;
	boolean isUnisexOrNot;
	
	public void specs(String modelName, int weightOfSpecs, long specsID, float frameWidthOfSpecs, double specsPrice, char specsSize, boolean isUnisex){
		
		System.out.println("Model Name :" +modelName + ", Weight :" +weightOfSpecs + ", Product ID :" +specsID + ", Frame Width :" +frameWidthOfSpecs + ", Price :" +specsPrice + ", Size :" +specsSize + ", The spectacles is of unisex :" +isUnisex);
	}
	
	public String brandName(String brandOfTheSpectacles){
		name = brandOfTheSpectacles;
		return name;
	}
	
	public int weightOfTheSpecs(int weightOfTheSpectacles){
		weight = weightOfTheSpectacles;
		return weight;
	}
	
	public long prdctID(long spectaclesID){
		productID = spectaclesID;
		return productID;
	}
	
	public float widthOfTheFrame(float frameWidthOfTheSpectacles){
		frameWidth = frameWidthOfTheSpectacles;
		return frameWidth;
	}
	
	public double priceOfSpecs(double spectaclesPrice){
		price = spectaclesPrice;
		return price;
	}
	
	public char sizeOfSpecs(char spectaclesSize){
		size = spectaclesSize;
		return size;
	}
	
	public boolean isItUnisex(boolean isSpectaclesUnisex){
		isUnisexOrNot = isSpectaclesUnisex;
		return isUnisexOrNot;
	}
}