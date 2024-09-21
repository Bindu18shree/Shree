class XworkzRunner{
	
	public static void main(String[] args){
		
		System.out.println("The location of Xworkz Institute :"+Xworkz.location("Basvehwarnagar")); 
		
		System.out.println("The total number of  Staffs in Xworkz :"+Xworkz.staffs(8,5));
		
		System.out.println("The total number of Students in Xworkz :"+Xworkz.students(75,125,200));
		
		System.out.println("The total number of Batches in Xworkz :"+Xworkz.totalNoOfBatches(65,50,45,35));
		
		System.out.println("The Xworkz closes at :"+Xworkz.timings(8.30d, 1.00d, 6.30d, 8.30d, 9.35d));
		
		
	}
}