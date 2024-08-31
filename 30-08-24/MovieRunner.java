class MovieRunner{
	
	public static void main(String [] args){
		
		Movie.setTitle("Jab We Met");
		
		Movie.setRatings(7.9f);
		
		Movie.setReleasedYear(2007);
		
		Movie.setGenre("Comedy & Romance");
		
		Movie.setLanguage("Hindi");
		
		
		
		String titleOFTheMovie = Movie.getTitle("Jab We Met");
		
		System.out.println("The title of the Movie :" +titleOFTheMovie);
		
		float ratingsOfTheMovie = Movie.getRatings(7.9f);
		
		System.out.println("The total ratings of the movie out of 10 :" +ratingsOfTheMovie);
		
		int releasedYearOfTheMovie = Movie.getReleasedYear(2007);
		
		System.out.println("The year of the movie released :" +releasedYearOfTheMovie);
		
		String genreOfTheMovie = Movie.getGenre("Comedy & Romance");
		
		System.out.println("The genre of the movie :" +genreOfTheMovie);
		
		String languageOfTheMovie = Movie.getLanguage("Hindi");
		
		System.out.println("The language of the movie :" +languageOfTheMovie);
			
	}
	
}