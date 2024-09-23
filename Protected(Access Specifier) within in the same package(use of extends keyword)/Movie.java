package com.xworkz.movie.boot;

public class Movie {
	
	protected String title;
	protected int releaseYear;
	protected boolean isMoviePanIndiaOrNot;
	protected long boxOfficeRevenue;
	protected float ratings;
	
	
	public String getTitle() {
		return title;
	}
	public int getReleaseYear() {
		return releaseYear;
	}
	public boolean isMoviePanIndiaOrNot() {
		return isMoviePanIndiaOrNot;
	}
	public long getBoxOfficeRevenue() {
		return boxOfficeRevenue;
	}
	public float getRatings() {
		return ratings;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	public void setIsMoviePanIndiaOrNot(boolean isMoviePanIndiaOrNot) {
		this.isMoviePanIndiaOrNot = isMoviePanIndiaOrNot;
	}
	public void setBoxOfficeRevenue(long boxOfficeRevenue) {
		this.boxOfficeRevenue = boxOfficeRevenue;
	}
	public void setRatings(float ratings) {
		this.ratings = ratings;
	}
}
