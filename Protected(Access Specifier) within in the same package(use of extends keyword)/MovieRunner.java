package com.xworkz.movie.runner;

import com.xworkz.movie.boot.Songs;

public class MovieRunner {
	
	public static void  main(String [] args) {
		
		Songs songs = new Songs();
		
		songs.display();
		
		songs.noOfSongsInTheMovie = 4;
		System.out.println("Total number of songs in the Movie :" +songs.getNoOfSongsInTheMovie());
		
		songs.hitSong = "Toofan";
		System.out.println("Hit song of the Movie :" +songs.getHitSong());
		
		songs.noOfViewsInYT = 77.5f;
		System.out.println("Number of views(Million) in YT :" +songs.getNoOfViewsInYT());
		
	}
}
		
		
			


