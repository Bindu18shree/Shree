class EngineeringRunner{
	
	public static void main(String[] args){
		
		System.out.println("The University Name of the Engineering College :"+Engineering.Name("RNS Institue Of Technology"));
		
		System.out.println("The pincode Of the University :"+Engineering.address("Peenya", 560073));
		
		System.out.println("The Gate Open timings of the University :"+Engineering.timings(7.30f, 9.00f, 5.30f));
		
		System.out.println("The Number of Engineering Departments in Ramaiah University :"+Engineering.NoOfEngDepts(1,1,1,1));
		
		System.out.println("Departements In Engineering Section :"+Engineering.departmentsOfEngineering("Aerospace Dept", "CS Dept", "EC Dept", "Mechancical Dept", "Electrical Dept"));
		
		System.out.println("The total number of Students in Engineering Department :"+Engineering.noOfStudents(70, 150, 200, 85, 190, 180, 550));
		
		System.out.println("The total number of Hostelites in University :"+Engineering.hostel(50, 75, 650, 500, 3, 1700 ));
		
		System.out.println("The Total number Of staffs in University including all the Depts :"+Engineering.noOfStaffs(10, 30, 15, 6, 100, 25, 5));
	}
}