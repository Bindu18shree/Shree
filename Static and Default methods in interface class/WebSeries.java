package com.xworkz.webseries.boot;

public interface WebSeries {
	
	
	static String name(String webSeriesName) {
		
		return webSeriesName;
	}
	
	static int Seasons(int noOfSeasons) {
		
		return noOfSeasons;
	}
	
    static float episodesInSeason1(float totalNumberOfEpisodesInSeason1) {
    	
    	return totalNumberOfEpisodesInSeason1;
    }
    
    static int audioLanguagesAvailable(int noOfAvailableAudioLanguages) {
    	
    	return noOfAvailableAudioLanguages;
    }
    
    static int subtitleLanguagesAvailable(int noOfAvailableLanguagesForSubtitles) {
    	
    	return noOfAvailableLanguagesForSubtitles;
    }
    
    static String genreOfSeriesInSeason1(String genre) {
    	
    	return genre;
    }
    
    static char rating(char maturityRating) {
    	
    	return maturityRating;
    }
    
    static String networks(String networksForTheSeries) {
    	
    	return networksForTheSeries;
    }
    
    static float imdb(float seriesIMDb) {
    	
    	return seriesIMDb;
    }
    
    static int releaseYear(int yearOfReleaseOfSeason1) {
    	
    	return yearOfReleaseOfSeason1;
    }
    
    
    default float episodesInSeason2(float totalNumberOfEpisodesInSeason2) {
    	
    	return totalNumberOfEpisodesInSeason2;
    }
    
    default int audioLanguagesAvailableInSeason2(int noOfAvailableAudioLanguagesInSeason2) {
    	
    	return noOfAvailableAudioLanguagesInSeason2;
    }
    
    default int subtitleLanguagesAvailableInSeason2(int noOfAvailableLanguagesForSubtitlesInSeason2) {
    	
    	return noOfAvailableLanguagesForSubtitlesInSeason2;
    }
    
    default String genresOfSeriesInSeason2(String genres) {
    	
    	return genres;
    }
    
    default char ratingOfSeason2(char maturityRatingOfSeason2) {
    	
    	return maturityRatingOfSeason2;
    }
    
    default String networksOfSeason2(String networksForTheSeriesSeason2) {
    	
    	return networksForTheSeriesSeason2;
    }
    
    default float imdbOfSeason2(float seriesIMDbOfSeason2) {
    	
    	return seriesIMDbOfSeason2;
    }
    
    default int releaseYearOfSeason2(int yearOfReleaseOfSeason2) {
    	
    	return yearOfReleaseOfSeason2;
    } 
    
    default String season1Episode1(String episodeNameOfSeason1) {
    	
    	return episodeNameOfSeason1;
    }
    
    default String season2Episode1(String episodeNameOfSeason2) {
    	
    	return episodeNameOfSeason2;
    }

}
