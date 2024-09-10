class LabRunner{
	
	public static void main(String [] args){
		
		Lab lab = new Lab("Nisarga Diagnostic Laboratory", 560073, 9743384711l, 6.55f, 8.350d, true);
		
		System.out.println("Name of the lab ==" +lab.getName());
		
		System.out.println("pincode of the lab ==" +lab.getPincode());
		
		System.out.println("Contact number of the lab receptionist ==" +lab.getContactNumber());
		
		System.out.println("Lab opens(AM) at ==" +lab.getOpenTimings());
		
		System.out.println("Lab closes(PM) at ==" +lab.getCloseTimings());
		
		System.out.println("All types of blood tests are done in the lab ==" +lab.isAllTypesOfBloodTestDoneOrNot());
	}
}