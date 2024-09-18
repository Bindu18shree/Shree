package com.xworkz.politics.boot;

public class Politics {
	
	public String country;
	
	public int noOfNationalParties;
	
	public PrimeMinister primeMinister;
	

	public PrimeMinister getPrimeMinister() {
		return primeMinister;
	}

	public void setPrimeMinister(PrimeMinister primeMinister) {
		this.primeMinister = primeMinister;
	}

	public String getCountry() {
		return country;
	}

	public int getNoOfNationalParties() {
		return noOfNationalParties;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setNoOfNationalParties(int noOfNationalParties) {
		this.noOfNationalParties = noOfNationalParties;
	}
}
