class Cup{
	
	String itemModelNumber = "HTTC6CUP16LOGCU";
	int capacity = 160;
	float itemWeight = 0.9f;
	double price = 324.980d;
	long telePhoneNumberOfManufacturer = 1800224552l;
	char blockOfTheManufacturer = 'G';
	boolean isItMicroWaveSafeOrNot = true;
	
	public void setItemModelNumber(String itemModelNumber){
		System.out.println("Item model No :" +this.itemModelNumber);
		this.itemModelNumber = itemModelNumber;
		System.out.println("The new item Model number :" +this.itemModelNumber);
	}
	
	public void setCapacity(int capacity){
		System.out.println("Capacity of the cup in ml :" +this.capacity);
		this.capacity = capacity;
		System.out.println("The updated value of the capacity of the cup in ml :" +this.capacity);
	}
	
	public void setItemWeight(float itemWeight){
		System.out.println("Weight of the cup :" +this.itemWeight);
		this.itemWeight = itemWeight;
		System.out.println("The updated weight of the cup :" +this.itemWeight);
	}
	
	public void setPrice(double price){
		System.out.println("Price of the cup :" +this.price);
		this.price = price;
		System.out.println("The updated price of the cup :" +this.price);
	}
	
	public void setTelePhoneNumberOfManufacturer(long telePhoneNumberOfManufacturer){
		System.out.println("Telephone Number of the manufacturer is :" +this.telePhoneNumberOfManufacturer);
		this.telePhoneNumberOfManufacturer = telePhoneNumberOfManufacturer;
		System.out.println("The other telephone number of the manufacturer is :" +this.telePhoneNumberOfManufacturer);
	}
	
	public void setBlockOfTheManufacturer(char blockOfTheManufacturer){
		System.out.println("The block of the packer is " +this.blockOfTheManufacturer);
		this.blockOfTheManufacturer = blockOfTheManufacturer;
		System.out.println("The updated block of the packer :" +this.blockOfTheManufacturer);
	}
	
	public void setIsItMicroWaveSafeOrNot(boolean isItMicroWaveSafeOrNot){
		System.out.println("The cup is microwave safe :"+this.isItMicroWaveSafeOrNot);
		this.isItMicroWaveSafeOrNot = isItMicroWaveSafeOrNot;
		System.out.println("The cup is not microwave safe :"+this.isItMicroWaveSafeOrNot);
	}
	
	
	public String getItemModelNumber(){
		return itemModelNumber;
	}
	
	public int getCapacity(){
		return capacity;
	}
	
	public float getItemWeight(){
		return itemWeight;
	}
	
	public double getPrice(){
		return price;
	}
	
	public long getTelePhoneNumberOfManufacturer(){
		return telePhoneNumberOfManufacturer;
	}
	
	public char getBlockOfTheManufacturer(){
		return blockOfTheManufacturer;
	}
	
	public boolean isItMicroWaveSafeOrNot(){
		return isItMicroWaveSafeOrNot;
	}
	
	
	
	
	}