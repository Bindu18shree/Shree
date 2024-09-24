package com.xworkz.movie.boot;

public class Movie {
	
	protected String title;
	protected int releaseYear;
	protected boolean isMoviePanIndiaOrNot;
	protected long boxOfficeRevenue;
	protected float ratings;
	
	
	protected String getTitle() {
		return title;
	}
	protected int getReleaseYear() {
		return releaseYear;
	}
	protected boolean isMoviePanIndiaOrNot() {
		return isMoviePanIndiaOrNot;
	}
	protected long getBoxOfficeRevenue() {
		return boxOfficeRevenue;
	}
	protected float getRatings() {
		return ratings;
	}
	protected void setTitle(String title) {
		this.title = title;
	}
	protected void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	protected void setIsMoviePanIndiaOrNot(boolean isMoviePanIndiaOrNot) {
		this.isMoviePanIndiaOrNot = isMoviePanIndiaOrNot;
	}
	protected void setBoxOfficeRevenue(long boxOfficeRevenue) {
		this.boxOfficeRevenue = boxOfficeRevenue;
	}
	protected void setRatings(float ratings) {
		this.ratings = ratings;
	}
}
