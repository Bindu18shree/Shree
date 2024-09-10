class Lab{
	
	String name;
	
	int pincode;
	
	long contactNumber;
	
	float openTimings;
	
	double closeTimings;
	
	boolean isAllTypesOfBloodTestDoneOrNot;
	
   
   public Lab(String name, int pincode, long contactNumber, float openTimings, double closeTimings,boolean isAllTypesOfBloodTestDoneOrNot){
	   
	   this.name = name;
	   
	   this.pincode = pincode;
	   
	   this.contactNumber = contactNumber;
	   
	   this.openTimings = openTimings;
	   
	   this.closeTimings = closeTimings;
	   
	   this.isAllTypesOfBloodTestDoneOrNot = isAllTypesOfBloodTestDoneOrNot;
   }
   
   public String getName(){
	   return name;
   }
   
   public int getPincode(){
	   return pincode;
   }
   
   public long getContactNumber(){
	   return contactNumber;
   }
   
   public float getOpenTimings(){
	   return openTimings;
   }
   
   public double getCloseTimings(){
	   return closeTimings;
   }
   
   public boolean isAllTypesOfBloodTestDoneOrNot(){
	   return isAllTypesOfBloodTestDoneOrNot;
   }
}