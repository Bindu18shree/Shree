class NailPolish{
	
	String brand;
	
	Long modelNumber;
	
	Float quantity;
	
	Double price;
	
	Integer shadeNumber;
	
	Boolean isItGlossyFinishOrNot;
	
	Character shade;
	
	
	public NailPolish(String brand, Long modelNumber, Float quantity, Double price, Integer shadeNumber, Boolean isItGlossyFinishOrNot, Character shade){
		
		this.brand = brand;
		
		this.modelNumber = modelNumber;
		
		this.quantity = quantity;
		
		this.price = price;
		
		this.shadeNumber = shadeNumber;
		
		this.isItGlossyFinishOrNot = isItGlossyFinishOrNot;
		
		this.shade = shade;
	}
	
	public String getBrand(){
		return brand;
	}
	
	public Long getModelNumber(){
		return modelNumber;
	}
	
	public Float getQuantity(){
		return quantity;
	}
	
	public Double getPrice(){
		return price;
	}
	
	public Integer getShadeNumber(){
		return shadeNumber;
	}
	
	public Boolean isItGlossyFinishOrNot(){
		return isItGlossyFinishOrNot;
	}
	
	public Character getShade(){
		return shade;
	}
}