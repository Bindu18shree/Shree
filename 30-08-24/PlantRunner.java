class PlantRunner{
	
	public static void main(String [] args){
		
		plant.setName("Lucky Jade Indoor Plant");
		
		plant.setBenefits("Relieves Stress, Air Purification, Brings Good Luck");
		
		plant.setCost(299);
		
		plant.setRating(4.8f);
		
		plant.setIsPetFriendlyOrNot(true);
		
		
		String nameOfThePlant = plant.getName("Lucky Jade Indoor Plant");
		
		System.out.println("The name of the plant is " +nameOfThePlant);
		
		
		String benefitsOfThePlant = plant.getBenefits("Relieves Stress, Air Purification, Brings Good Luck");
		
		System.out.println("This plant provides various number of benefits which are :" +benefitsOfThePlant);
		
		
		int costOfThePlant = plant.getCost(299);
		
		System.out.println("The cost of the plant is " +costOfThePlant);
		
		
		float ratingOfThePlant = plant.getRating(4.8f);
		
		System.out.println("The rating of the plant provided by the buyers is " +ratingOfThePlant);
		
		
		boolean isPlantPetFriendly = plant.getIsPetFriendlyOrNot(true);
		
		System.out.println("The plant is pet friendly :" +isPlantPetFriendly);
	}
}