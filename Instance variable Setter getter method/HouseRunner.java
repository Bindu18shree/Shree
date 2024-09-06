class HouseRunner{
	
	public static void main(String [] args){
		
		House house = new  House();
		
		house.setHouseName("Shree Nilaya");
		
		house.setCostForTheConstructionOfHouse(9996400l);
		
		house.setSqft(1200);
		
		house.setdistanceOfMetroFromTheHouse(1.50f);
		
		house.setCostForTheLand(5268244.266940d);
		
		house.setKhataOfLand('B');
		
		house.setIsLiftAvailableOrNot(false);
		
		System.out.println("The name of the House :" +house.getHouseName());
		
		System.out.println("The total cost for the construction of the house :" +house.getCostForTheConstructionOfHouse());
		
		System.out.println("The squarefeet of the house :" +house.getSqft());
		
		System.out.println("The distance of the metro from the house :" +house.getDistanceOfMetroFromTheHouse());
		
		System.out.println("The cost for the land :" +house.getCostForTheLand());
		
		System.out.println("The khata of the land :" +house.getKhataOfLand());
		
		System.out.println("The lift is available :" +house.isLiftAvailableOrNot());
	}
}