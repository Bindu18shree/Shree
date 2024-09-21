class LateComersRunner{
	
	public static void main(String [] args){
		
		LateComers lateComers = new LateComers();
		
		lateComers.lateComerDetails("Harshitha",22,9674234560l,7.45f,549.980d,'N',false);
		
		System.out.println("The Name Of the Late Comer is :" +lateComers.nameofThatPerson("Vainidhi"));
		
		System.out.println("The age of the late comer is :" +lateComers.ageOfThatPerson(21));
		
		System.out.println("The contact number is :" +lateComers.cntctNumber(9833328972l));
		
		System.out.println("The arriving time of late comer is :" +lateComers.time(8.350f));
		
		System.out.println("The amount paid as fine for coming late :" +lateComers.fineAmount(675.9820d));
		
		System.out.println("The last name of the late comer is :" +lateComers.initial('P'));
		
		System.out.println("She did paid the complete fine amount :" +lateComers.isFinePaid(true));
	}
}