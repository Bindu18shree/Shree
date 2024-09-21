class College{
	
	public static void main (String[] args){
		
		int noOfStudents = 300;
		int noOfTeachers = 20;
		int noOfNonTeachingStaffs = 30;
		int noOfCollegeBus = 5;
		int noOfCoursesOffered = 8;
		int noOfClasses = 10;
		
		int[]total = {noOfStudents,noOfTeachers,noOfNonTeachingStaffs,noOfCollegeBus,noOfCoursesOffered,noOfClasses};
		System.out.println("The length of the class College :"+total.length);
		
		total [1] = 250;
		
		for (int i=0;i<5; i++){
			System.out.println("Total = "+total[i]);
		}
	}
}