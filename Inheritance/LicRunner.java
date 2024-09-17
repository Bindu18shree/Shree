package com.xworkz.lic.runner;

import com.xworkz.lic.boot.BangaloreBranchesOfLic;

public class LicRunner {
	
	public static void main(String [] args) {
		
		BangaloreBranchesOfLic bangalorebranchesoflic = new BangaloreBranchesOfLic();
		
		bangalorebranchesoflic.setLocationOfHeadQuarters("Mumbai");
		
		bangalorebranchesoflic.setOwner("Government of India");
		
		bangalorebranchesoflic.setFoundedYear(1956);
		
		bangalorebranchesoflic.setNoOfEmployees(9866123l);
		
		System.out.println("The location of the head quarters of the lic :" +bangalorebranchesoflic.getLocationOfHeadQuarters());
		
		System.out.println("Owner of the LIC :" +bangalorebranchesoflic.getOwner());
		
		System.out.println("LIC was founded in the year :" +bangalorebranchesoflic.getFoundedYear());
		
		System.out.println("Number of employees in the LIC :" +bangalorebranchesoflic.getNoOfEmployees());
	}

}
