package com.xworkz.politics.boot;

public class NationalParties extends Politics {
	
	public String partyName;
	
	public String symbol;
	
	public int foundedYear;

	
	
	public String getPartyName() {
		return partyName;
	}

	public String getSymbol() {
		return symbol;
	}

	public int getFoundedYear() {
		return foundedYear;
	}

	public void setPartyName(String partyName) {
		this.partyName = partyName;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setFoundedYear(int foundedYear) {
		this.foundedYear = foundedYear;
	}
}
