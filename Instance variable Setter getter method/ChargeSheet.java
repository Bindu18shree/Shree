class ChargeSheet{
	
	String name = "EDWIN RWEYEMAMU";
	String chargeSheetNo = "03/2011";
	int age = 27;
	long cpiNumber = 1352616l;
	float time = 11.35f;
	boolean isChargeSheetOriginalOrSupplementary = true;
	char carCompany = 'H';
	
	public void setName(String name){
		System.out.println("Name :" +this.name);
		this.name = name;
	}
	
	public void setChargeSheetNo(String chargeSheetNo){
		System.out.println("Charge sheet Number :" +this.chargeSheetNo);
		this.chargeSheetNo = chargeSheetNo;
	}
	
	public void setAge(int age){
		System.out.println("Age of the person :" +this.age);
		this.age = age;
	}
	
	public void setCpiNumber(long cpiNumber){
		System.out.println("CPI number :" +this.cpiNumber);
		this.cpiNumber = cpiNumber;
	}
	
	public void setTime(float time){
		System.out.println("Time of the charge sheet filed :" +this.time);
		this.time = time;
	}
	
	public void setIsChargeSheetOriginalOrSupplementary(boolean isChargeSheetOriginalOrSupplementary){
		System.out.println("Charge sheet is original :" +this.isChargeSheetOriginalOrSupplementary);
		this.isChargeSheetOriginalOrSupplementary = isChargeSheetOriginalOrSupplementary;
	}
	
	public void setCarCompany(char carCompany){
		System.out.println("The company of the Car is :" +this.carCompany);
		this.carCompany = carCompany;
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getChargeSheetNo(){
		return chargeSheetNo;
	}
	
	public int getAge(){
		return age;
	}
	
	public long getCpiNumber(){
		return cpiNumber;
	}
	
	public float getTime(){
		return time;
	}
	
	public boolean isChargeSheetOriginalOrSupplementary(){
		return isChargeSheetOriginalOrSupplementary;
	}
	
	public char getCarCompany(){
		return carCompany;
	}
	
	
}