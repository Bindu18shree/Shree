class Bag{
	
	String brand;
	double price;
	float storageVolume;
	int itemWeight;
	char size;
	boolean isBagWaterResistance;
	long pincodeOfTheManufacturer;
	
	
	public void bagMethod1(String bagBrand, double bagPrice, float bagStorageVolume, int bagWeight, char bagSize, boolean isBagWaterResistanceOrNot, long pincodeOfTheManufacturerOfBag){
		
		
		
		System.out.println("Brand ==" +bagBrand + ", price ==" +bagPrice + " ,storageVolume in litres ==" +bagStorageVolume + " ,bag Weight in grams ==" +bagWeight + ", bag Size ==" +bagSize + ", Bag is water resistance ==" +isBagWaterResistanceOrNot + " ,Pincode Of where the bag is manufactured ==" +pincodeOfTheManufacturerOfBag);
	}
	
	
	public String company(String brandOfTheBag){
		brand = brandOfTheBag;
		return brand;
	}
	
	public double cost(double priceOfTheBag){
		price = priceOfTheBag;
		return price;
	}
	
	public float space(float storageVolumeOfTheBag){
		storageVolume = storageVolumeOfTheBag;
		return storageVolume;
	}
	
	public int weight(int weightOfTheBag){
		itemWeight = weightOfTheBag;
		return itemWeight;
	}
	
	public char sizeOfBag(char sizeOfTheBag){
		size = sizeOfTheBag;
		return size;
	}
	
	public boolean isWaterResistance(boolean isBagWaterResistanceOrNot){
		isBagWaterResistance = isBagWaterResistanceOrNot;
		return isBagWaterResistance;
	}
	
	public long pincode(long pincodeOfTheManufacturerOfTheBag){
		pincodeOfTheManufacturer = pincodeOfTheManufacturerOfTheBag;
		return pincodeOfTheManufacturer;
	}
	

}