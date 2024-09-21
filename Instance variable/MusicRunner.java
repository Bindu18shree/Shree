class MusicRunner{
	
	public static void main(String [] args){
		
		Music music = new Music();
		
		music.songName = "chuttamalle";
		
		String nameOfTheSong = music.songName;
		
		System.out.println("The song name is :" +nameOfTheSong);
		
		
		
		music.songFromTheMovie = "From Devara Part 1";
		
		String movieNameOfTheSong = music.songFromTheMovie;
		
		System.out.println("The song is from the Movie :" +movieNameOfTheSong);
		
		
		
		music.viewsInYT = 100.00f;
		
		float viewsOfTheSong = music.viewsInYT;
		
		System.out.println("The number of views of the Song in YouTube in millions :" +viewsOfTheSong);
		
		
		
		music.likesInYT = 50;
		
		int noOfLikesInYouTube = music.likesInYT;
		
		System.out.println("Number of likes in YouTube in millions is :" +noOfLikesInYouTube);
		
		
		
		
		
	}
}