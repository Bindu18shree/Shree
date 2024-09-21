class Teacher{
	
	String nameAndDepartment;
	long contactNumber;
	int salary;
	float teacherCheckInTime;
	double teacherCheckOutTime;
	char section;
	boolean isTeacherMaleOrFemale;
	
	public void teacherMethod1(String name, long cntctNo, int salaryOfTeahcer, float checkInTime, double checkOutTime,char sectionHndled, boolean isMaleOrFemale){
		
		System.out.println("Teacher name ==" +name + ", contactNumber ==" +cntctNo + ", salary ==" +salaryOfTeahcer + ", Check-In timings ==" +checkInTime + ",Check-Out timings ==" +checkOutTime + ", section ==" +sectionHndled + ", The Gender of the Teacher is Male ==" +isMaleOrFemale);
	}
	
	
	public String info(String teacherNameAndDept){
		nameAndDepartment = teacherNameAndDept;
		return nameAndDepartment;
	}
	
	public long cntctDetails(long cntctNumber){
		contactNumber = cntctNumber;
		return contactNumber;
	}
	
	public int teacherSalary(int salaryOfTheTeacher){
		salary = salaryOfTheTeacher;
		return salary;
	}
	
	public float checkInTimings(float checkInTimeOfTheTeacher){
		teacherCheckInTime = checkInTimeOfTheTeacher;
		return teacherCheckInTime;
	}
	
	public double checkOutTimings(double checkOutTimeOfTheTeacher){
		teacherCheckOutTime = checkOutTimeOfTheTeacher;
		return teacherCheckOutTime;
	}
	
	public char sectionHandled(char sectionHandledByTeacher){
		section = sectionHandledByTeacher;
		return section;
	}
	
	public boolean isTeacherFemaleOrMale(boolean isMaleOrFemale){
		isTeacherMaleOrFemale = isMaleOrFemale;
		return isTeacherMaleOrFemale;
	}
	 
	
	
	
}