class Auto{
	
	String licensePlateNumber;
	
	long contactNumberOfTheDriver;
	
	boolean isPaymentByCashOrOnline;
	
	float pickUpTimings;
	
	double totalFare;
	
	int priceOfTheAuto;
	
	
	public Auto(String licensePlateNumber, long contactNumberOfTheDriver, boolean isPaymentByCashOrOnline, float pickUpTimings, double totalFare, int priceOfTheAuto){
		
		this.licensePlateNumber = licensePlateNumber;
		
		this.contactNumberOfTheDriver = contactNumberOfTheDriver;
		
		this.isPaymentByCashOrOnline = isPaymentByCashOrOnline;
		
		this.pickUpTimings = pickUpTimings;
		
		this.totalFare = totalFare;
		
		this.priceOfTheAuto = priceOfTheAuto;
	}
	
	public String getLicensePlateNumber(){
		return licensePlateNumber;
	}
	
	public long getContactNumberOfTheDriver(){
		return contactNumberOfTheDriver;
	}
	
	public boolean isPaymentByCashOrOnline(){
		return isPaymentByCashOrOnline;
	}
	
	public float getPickUpTimings(){
		return pickUpTimings;
	}
	
	public double getTotalFare(){
		return totalFare;
	}
	
	public int getPriceOfTheAuto(){
		return priceOfTheAuto;
	}
	
	
	
	
}