class AdhaarCardRunner{
	
	public static void main(String [] args){
		
		AdhaarCard adhaarCard = new AdhaarCard();
		
		System.out.println("The name of the person in adhaarCard = "+adhaarCard.nameOfThePersonInAdhaarCard);
		
		System.out.println("The gender of the person in adhaarCard is Female =" +adhaarCard.isThePersonInAdhaarMaleOrFemale);
		
		System.out.println("The Adhaar number is =" +adhaarCard.adhaarNumber);
	}
}