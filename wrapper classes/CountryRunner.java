class CountryRunner{
	
	public static void main(String [] args){
		
		Country country = new Country();
		
		System.out.println("The Name of the Country :" +country.getNameOfTheCountry());
		
		System.out.println("Total number of states in the Counry :" +country.getNumberOfStates());
		
		System.out.println("India is a historic place :" +country.isIndiaHistoricOrNot());
		
		System.out.println("Total number of pincodes in India :" +country.getNoOfPINCodesinIndia());
		
		System.out.println("The percentage of GDP Revenue increased by this year :" +country.getIncreaseOfPercentageOfGDPRevenueThisYear());
		
		System.out.println("Nominal GDP Estimated this Year in trillions :" +country.getNominalGDPEstimatedOfTheYear());
	}
}