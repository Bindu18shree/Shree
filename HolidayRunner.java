class HolidayRunner{
	
	public static void main(String[] args){
		
		int resortName = Holiday.wayanad("Taj Wayanad Resort & Spa", 16000, 2880);
		
		System.out.println("The Cost of Taj Wayanad Resort & Spa per Night :"+resortName);
		
		
		String facilities = Holiday.facilities(24, "Free WiFI", "Free Parking");
		
		System.out.println("The Facilities available in the resort :"+facilities);
		
		
		String services = Holiday.healthandWellness("Gym", "Yoga");
		
		System.out.println("The Resort provides the following Health and Wellness Facilities :"+services);
	}
}