package com.xworkz.movie.runner;

import com.xworkz.movie.boot.Movie;

public class Songs extends Movie {
	
	public int noOfSongsInTheMovie;
	public String hitSong;
	public float noOfViewsInYT;
	
	// Protected access specifier can be accessed in the different package with the use of extends keyword 
	public int getNoOfSongsInTheMovie() {
		return noOfSongsInTheMovie;
	}

    public String getHitSong() {
		return hitSong;
	}

    public float getNoOfViewsInYT() {
		return noOfViewsInYT;
	}

    public void setNoOfSongsInTheMovie(int noOfSongsInTheMovie) {
		this.noOfSongsInTheMovie = noOfSongsInTheMovie;
	}

    public void setHitSong(String hitSong) {
		this.hitSong = hitSong;
	}

    public void setNoOfViewsInYT(float noOfViewsInYT) {
		this.noOfViewsInYT = noOfViewsInYT;
	}

    
    public void display() {
		
		super.title = "K.G.F:Chapter 2";
		System.out.println("Movie title :"+getTitle());
		
		super.releaseYear = 2022;
		System.out.println("Movie was released in the year :" +getReleaseYear());
		
		super.isMoviePanIndiaOrNot = true;
		System.out.println("This was a Pan india Movie :" +isMoviePanIndiaOrNot());
		
		super.boxOfficeRevenue = 1200000000l;
		System.out.println("Box office revenue :" +getBoxOfficeRevenue());
		
		super.ratings = 8.5f;
		System.out.println("Ratings of the movie was :" +getRatings());
		
		
	}
}
