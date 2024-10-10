package com.xworkz.webseries.runner;

import com.xworkz.webseries.boot.WebSeries;
import com.xworkz.webseries.boot.WebSeriesMirzapur;

public class WebSeriesRunner {
	
	public static void main(String[] args) {
		
	System.out.println("Name of the webseries :" +WebSeries.name("Mirzapur"));
	System.out.println("Total number of seasons in webseries :" +WebSeries.Seasons(3));
	System.out.println("Number of episodes in season 1 :" +WebSeries.episodesInSeason1(9.0f));
	System.out.println("Number of audio languages available for season 1 :" +WebSeries.audioLanguagesAvailable(8));
	System.out.println("Number of subtitle Languages available in season 1 :"+WebSeries.subtitleLanguagesAvailable(6));
	System.out.println("Genre of series in season 1 :" +WebSeries.genreOfSeriesInSeason1("Drama"));
	System.out.println("Maturity rating of the series in season 1 :" +WebSeries.rating('A'));
	System.out.println("Networks of the series in season 1 :" +WebSeries.networks("Amazon Studios"));
	System.out.println("IMDb of season 1 :" +WebSeries.imdb(8.4f));
	System.out.println("Season 1 was released in the year :" +WebSeries.releaseYear(2018));
	
	
	WebSeriesMirzapur mirzapur = new WebSeriesMirzapur();
	
	System.out.println("Number of episodes in season 2 :" +mirzapur.episodesInSeason2(10.0f));
	System.out.println("Number of audio languages available for season 2 :" +mirzapur.audioLanguagesAvailableInSeason2(6));
	System.out.println("Number of subtitle Languages available in season 2 :"+mirzapur.subtitleLanguagesAvailableInSeason2(4));
	System.out.println("Genre of series in season 2 :" +mirzapur.genresOfSeriesInSeason2("Action,Drama,Suspense"));
	System.out.println("Maturity rating of the series in season 2 :" +mirzapur.ratingOfSeason2('A'));
	System.out.println("Networks of the series in season 2 :" +mirzapur.networksOfSeason2("Amazon Studios"));
	System.out.println("IMDb of season 2 :" +mirzapur.imdbOfSeason2(8.4f));
	System.out.println("Season 2 was released in the year :" +mirzapur.releaseYearOfSeason2(2020));
	System.out.println("name of the episode 1 in season 1 :" +mirzapur.season1Episode1("JHANDU"));
	System.out.println("name of the episode 1 in season 2 :" +mirzapur.season2Episode1("BARFI"));
		
		
	}

}
