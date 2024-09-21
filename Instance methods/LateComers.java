class LateComers{
	
	String name;
	int age;
	long contactNumber;
	float timeOfArriving;
	double finePaid;
	char lastName;
	boolean isFinePaidOrNot;
	
	public void lateComerDetails(String personName, int ageOfThatPerson, long cntctNo, float arrivingTime, double finePaidForArrivingLate, char initialOfThePerson, boolean isFinePaid){
		
		System.out.println("Name :" +personName + ", age :" +ageOfThatPerson + ", contact Number :" +cntctNo + ", Time of arriving :" +arrivingTime + ", fine paid :" +finePaidForArrivingLate + ", last name :" +initialOfThePerson + ", She paid the fine amount:" +isFinePaid);
	}
	
	public String nameofThatPerson(String lateComerName){
		name = lateComerName;
		return name;
	}
	
	public int ageOfThatPerson(int lateComerAge){
		age = lateComerAge;
		return age;
	}
	
	public long cntctNumber(long lateComerContactNo){
		 contactNumber= lateComerContactNo;
		return contactNumber;
	}
	
	public float time(float lateComerTimeOfArriving){
		timeOfArriving = lateComerTimeOfArriving;
		return timeOfArriving;
	}
	
	public double fineAmount(double lateComerAmountPaidAsFine){
		finePaid = lateComerAmountPaidAsFine;
		return finePaid;
	}
	
	public char initial(char lateComerLastName){
		lastName = lateComerLastName;
		return lastName;
	}
	
	public boolean isFinePaid(boolean isLateComerPaidFineOrNot){
		isFinePaidOrNot = isLateComerPaidFineOrNot;
		return isFinePaidOrNot;
	}
}