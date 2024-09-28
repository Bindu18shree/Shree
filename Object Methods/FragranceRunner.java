package com.xworkz.fragrances.runner;

import com.xworkz.fragrances.boot.Fragrance;

public class FragranceRunner {
	
	public static void main(String[] args) {
		
		Fragrance fragrance = new Fragrance("GUESS", "Guess Seductive Woman Floriental Woody Eau De Perfume", 75.0f, false, true, 4.3f, 2703.5467d, 5100.987d, 'L',2.5f, "Floriental Woody", "Travel Size", "Adult", "USA",32011l,"B0041FXETY", "Inter Parfums USA", 15.2f,12.7f, 10.2f, 130, 47, 9273, "Beauty Impex Pvt.Ltd., Vardaan' Suite #403,25A,Camac Street, Calcutta", 700016l, 1.5f, 1.0f, "Salicylic Acid", "www.guess.com", 32011, 8571532011l, "Amazon", 5, true, true, true, 130.54f);
		
		System.out.println(" Object Fragrance to String :" +fragrance.toString());
		System.out.println("Hashcode of the fragrance :" +fragrance.hashCode());
	}

}
