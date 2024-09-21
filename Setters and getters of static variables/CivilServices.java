class CivilServices{
	
	static String name;
	static String administeredBy;
	static long noOfTestTakers;
	static int duration;
	static int fee;
	static boolean offered;
	
	
	public static void setName(String fullExamName){
		
		name = fullExamName;
	}
	
	public static void setAdministeredBy(String examAdministeredBy){
		
		administeredBy = examAdministeredBy;
	}
	
	public static void setNoOfTestTakers(long annualNoOfTestTakers){
		
		noOfTestTakers = annualNoOfTestTakers;
	}
	
	public static void setDuration(int examDuration){
		
		duration = examDuration;
	}
	
	public static void setFee(int examFee){
		
		fee = examFee;
	}
	
	public static void setOffered(boolean examOffered){
		
		offered = examOffered;
	}
	
	
	
	public static void display(){
		
		System.out.println("The full name of the exam is :" +name);
		
		System.out.println("The exam is administered by :" +administeredBy);
		
		System.out.println("The annual no of number of test taken :" +noOfTestTakers);
		
		System.out.println("The toal duration of the preliminary test in min : "+duration);
		
		System.out.println("The fee for the exam :" +fee);
		
		System.out.println("The exam is offered twice a year :" +offered);
		
		
	}
}