class AutoRunner{
	
	public static void main(String [] args){
		
		Auto auto = new Auto("KA02-2446", 9866328966l, false, 09.52f, 69.748d, 336000);
		
		System.out.println("License plate number of the auto :" +auto.getLicensePlateNumber());
		
		System.out.println("Contact number of the auto driver :" +auto.getContactNumberOfTheDriver());
		
		System.out.println("Payment of the customer was paid online :" +auto.isPaymentByCashOrOnline());
		
		System.out.println("The pick up time of the customer :" +auto.getPickUpTimings());
		
		System.out.println("Total fare for the ride of the customer :" +auto.getTotalFare());
		
		System.out.println("Price of an auto :" +auto.getPriceOfTheAuto());
	}
}