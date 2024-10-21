// Question 12) constructor chain linking

class Movie{
	
	String nameOfTheMovie;
	int noOfLeadingActors;
	
	public Movie(){
	    this("Kalki");
	    System.out.println("This is no argumenatl constructor");
	
	}
	
	public Movie(String nameOfTheMovie){
		this("Kalki", 2);
		System.out.println("Movie name :" +nameOfTheMovie);
		
	}
	
	public Movie(String nameOfTheMovie, int noOfLeadingActors){
		System.out.println("Number of leading actors :" +noOfLeadingActors);
	}
}

