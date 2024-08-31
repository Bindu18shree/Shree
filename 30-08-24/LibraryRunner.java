class LibraryRunner{
	
	public static void main(String [] args){
		
		Library.setName("Just Books");
		
		Library.setLocation("17th Main Road, Bengaluru, Karnataka");
		
		Library.setPincode(560102);
		
		Library.setOpens(11.35f);
		
		Library.setCloses(7.35d);
		
		Library.setOffers("Rent,Read and Return format");
		
		
		String nameOfTheLibrary = Library.getName("Just Books");
		
		System.out.println("The name of the Library ==" +nameOfTheLibrary);
		
		
		String locationOfTheLibrary = Library.getLocation("17th Main Road, Bengaluru, Karnataka");
		
		System.out.println("The Library is located in ==" +locationOfTheLibrary);
		
		
		int pincodeOfTheLibrary = Library.getPincode(560102);
		
		System.out.println("The pincode of the Library ==" +pincodeOfTheLibrary);
		
		
		float openTimingsOfLibrary = Library.getOpens(11.35f);
		
		System.out.println("The open timings of the Library =="+openTimingsOfLibrary);
		
		
		double closeTimingsOfLibrary = Library.getCloses(7.35d);
		
		System.out.println("The close timings of the Library  ==" +closeTimingsOfLibrary);
		
		
		String  offersProvidedByLibrary = Library.getOffers("Rent,Read and Return format");
		
		System.out.println("The Library offers ==" +offersProvidedByLibrary);
	}
}