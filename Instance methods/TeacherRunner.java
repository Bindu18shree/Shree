class TeacherRunner{
	
	public static void main(String [] args){
		
		Teacher teacher = new Teacher ();
		
		teacher.teacherMethod1("Madhu", 9834567328l, 60300, 9.35f, 4.350d,'B',true);
		
		System.out.println("The name of the Teacher and Department of teaching is :" +teacher.info("Suman , DeptOfTeaching : B.Sc. in Computer Science"));
		
		System.out.println("The contact Number of the Teacher is :" +teacher.cntctDetails(8296565723l));
		
		System.out.println("The salary of the Teacher is :" +teacher.teacherSalary(85000));
		
		System.out.println("The Check-In Timings of the Teacher is :" +teacher.checkInTimings(8.35f));
		
		System.out.println("The check-Out Timings of the Teacher is :" +teacher.checkOutTimings(3.350d));
		
		System.out.println("The section handled by teacher is :" +teacher.sectionHandled('A'));
		
		System.out.println("The Gender of the Teacher is male :" +teacher.isTeacherFemaleOrMale(false));
	}
}