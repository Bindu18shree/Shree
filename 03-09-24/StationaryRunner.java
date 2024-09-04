class StationaryRunner{
	
	public static void main(String [] args){
		
		Stationary stationary = new Stationary();
		
		stationary.stationaryComboPackName = "Kangaro Desk Essentials DE-Mini 10 Multipurpose Combo pack";
		
		String comboSetName = stationary.stationaryComboPackName;
		
		System.out.println("The Stationary combo set is :" +comboSetName);
		
		
		stationary.cost = 329.00f;
		
		float costOfComboSet = stationary.cost;
		
		System.out.println("The cost of the combo set is :" +costOfComboSet);
		
		
		
		stationary.itemWeight = 220;
		
		int weightOfTheComboSet = stationary.itemWeight;
		
		System.out.println("The weight of the stationary combo set items in Grams :" +weightOfTheComboSet);


		
	}
}