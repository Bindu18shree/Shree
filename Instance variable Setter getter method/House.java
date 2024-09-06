class House{
	
	String houseName = "Vriddhi Nilaya";
	long costForTheConstructionOfHouse = 9876500l;
	int sqft = 1500;;
	float distanceOfMetroFromTheHouse = 0.4f;
	double costForTheLand = 5598774.765980d;
	char khataOfLand = 'A';
	boolean isLiftAvailableOrNot = true;
	
	
	public void setHouseName(String houseName){
		System.out.println("House name ==" +this.houseName);
		this.houseName = houseName;
		System.out.println("Updated Name of the house is ==" +this.houseName);
	}
	
	public void setCostForTheConstructionOfHouse(long costForTheConstructionOfHouse){
		System.out.println("Total cost for the construction of the house ==" +this.costForTheConstructionOfHouse);
		this.costForTheConstructionOfHouse = costForTheConstructionOfHouse;
		System.out.println("Updated cost is ===" +this.costForTheConstructionOfHouse);
	}
	
	public void setSqft(int sqft){
		System.out.println("The total sqft ==" +this.sqft);
		this.sqft = sqft;
		System.out.println("The updated sqft is ==" +this.sqft);
	}
	
	public void setdistanceOfMetroFromTheHouse(float distanceOfMetroFromTheHouse){
		System.out.println("The distance(km) of metro from the house ==" +this.distanceOfMetroFromTheHouse);
		this.distanceOfMetroFromTheHouse = distanceOfMetroFromTheHouse;
		System.out.println("The updated distance(km) of metro from the house == " +this.distanceOfMetroFromTheHouse);
	}
	
	public void setCostForTheLand(double costForTheLand){
		System.out.println("The cost for the land is ==" +this.costForTheLand);
		this.costForTheLand = costForTheLand;
		System.out.println("The updated cost for the land is ==" +this.costForTheLand);
	}
	
	public void setKhataOfLand(char khataOfLand){
		System.out.println("The khata Of the Land ==" +this.khataOfLand);
		this.khataOfLand = khataOfLand;
		System.out.println("The updated khata of the land ==" +this.khataOfLand);
	}
	
	public void setIsLiftAvailableOrNot(boolean isLiftAvailableOrNot){
		System.out.println("Lift is available ==" +this.isLiftAvailableOrNot);
		this.isLiftAvailableOrNot = isLiftAvailableOrNot;
		System.out.println("lift is not available ==" +this.isLiftAvailableOrNot);
	}
	
	
	public String getHouseName(){
		return houseName;
	}
	
	public long getCostForTheConstructionOfHouse(){
		return costForTheConstructionOfHouse;
	}
	
	public int getSqft(){
		return sqft;
	}
	
	public float getDistanceOfMetroFromTheHouse(){
		return distanceOfMetroFromTheHouse;
	}
	
	public double getCostForTheLand(){
		return costForTheLand;
	}
	
	public char getKhataOfLand(){
		return khataOfLand;
	}
	
	public boolean isLiftAvailableOrNot(){
		return isLiftAvailableOrNot;
	}
}