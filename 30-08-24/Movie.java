class Movie{
	
	static String title;
	static float ratings;
	static int releasedYear;
	static String genre;
	static String language;
	
	public static void setTitle(String movieTitle){
		title = movieTitle;
	}
	
	public static void setRatings(float movieRatings){
		ratings = movieRatings;
	}
	
	public static void setReleasedYear(int movieReleasedYear){
		releasedYear = movieReleasedYear;
	}
	
	public static void setGenre(String movieGenre){
		genre = movieGenre;
	}
	
	public static void setLanguage(String movieLanguage){
		language = movieLanguage;
	}
	
	
	public static String getTitle(String movieTitle){
		return title;
	}
	
    public static float getRatings(float movieRatings){
		return ratings;
    }
	
	public static int getReleasedYear(int movieReleasedYear){
		return releasedYear;
	}
	
	public static String getGenre(String movieGenre){
		return genre;
	}
	
	public static String getLanguage(String movieLanguage){
		return language;
	}
	
	
	
}