class MicroWaveOvenRunner{
	
	public static void main(String [] args){
		
		MicroWaveOven.setBrand("Samsung 28L Multi Spit, Convection Microwave Oven");
		
		MicroWaveOven.setPrice(16990);
		
		MicroWaveOven.setWeight(17900.08f);
		
		MicroWaveOven.setDimensions("46.3D * 51.7W * 31H");
		
		MicroWaveOven.setCapacity(28);
		
		MicroWaveOven.setWattage(2900);
		
	
	
	

    
		
		String brandOfTheOven = MicroWaveOven.getBrand("Samsung 28L Multi Spit, Convection Microwave Oven");
		
		System.out.println("The Brand of the Oven is :" +brandOfTheOven);
		
		int priceOfTheOven = MicroWaveOven.getPrice(16990);
		
		System.out.println("The price of the Oven is :" +priceOfTheOven);
		
		float weightOfTheOven = MicroWaveOven.getWeight(17900.08f);
		
		System.out.println("The Weight of the Oven in grams :" + weightOfTheOven);
		
		String DimensionsOfTheOven = MicroWaveOven.getDimensions("46.3D * 51.7W * 31H");
		
		System.out.println("The Dimensions of the Oven :" +DimensionsOfTheOven);
		
		int capacityOfTheOven = MicroWaveOven.getCapacity(28);
		
		System.out.println("The capacity of the Oven in litres :" +capacityOfTheOven);
		
		int wattageOfTheOven = MicroWaveOven.getWattage(2900);
		
		System.out.println("The Wattage of the Oven in Watts :" +wattageOfTheOven);
		
	}
	
}