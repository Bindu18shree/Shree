class FilmIndustryRunner{
	
	public static void main(String [] args){
		
		FilmIndustry.nameOfTheFilmIndustry = "SandalWood";
		
		FilmIndustry.nameOfThePopularActorInIndustry = "Power Star Puneeth Raj Kumar";
		
		FilmIndustry.ageOfTheActor = 49;
		
		FilmIndustry.contactNumberOfHisManager = 9764320922l;
		
		FilmIndustry.noOfMoviesActed = 50;
		
		FilmIndustry.noOfUpcomingMovies = 1;
		
		FilmIndustry.approxPaymentTakenPerMovie = 20000000.00d;
		
		FilmIndustry.isActorAliveOrNot = false;
		
		FilmIndustry.noOfYearsPassedSinceHeLeft = 4.5f;
		
		
		String filmIndustryName = FilmIndustry.getNameOfTheFilmIndustry();
		System.out.println("The Film Industry is :" +filmIndustryName);
		
		String popularActorName = FilmIndustry.getNameOfThePopularActorInIndustry();
		System.out.println("The popular Actor in Industry :" +popularActorName);
		
		Long contactNumber = FilmIndustry.getContactNumberOfHisManager();
		System.out.println("The contact number of his manager :" +contactNumber);
		
		Integer noOfMovies = FilmIndustry.getNoOfMoviesActed();
		System.out.println("Total number of movies acted :" +noOfMovies);
		
		Double payment = FilmIndustry.getApproxPaymentTakenPerMovie();
		System.out.println("Approx payment taken by the actor per movie :" +payment);
		
		Boolean isAliveOrNot = FilmIndustry.isActorAliveOrNot();
		System.out.println("The actor is still alive :" +isAliveOrNot);
		
		Float noOfYearsPassedAfterHeLeft = FilmIndustry.getNoOfYearsPassedSinceHeLeft();
		System.out.println("Number of years passed since he left us :" +noOfYearsPassedAfterHeLeft);
		
		
	}
}