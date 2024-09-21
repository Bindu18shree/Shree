class LipStickRunner{
	
	public static void main(String [] args){
		
		LipStick lipStick = new LipStick();
		
		System.out.println("The brand of the lipstick is :" +lipStick.brand);
		
		System.out.println("Total number of shades available :" +lipStick.totalNoOFShadesAvailable);
		
		System.out.println("Rating provided by the buyers of the lipstick is :" +lipStick.rating);
		
		System.out.println("Lipstick is matte :" +lipStick.isLipStickMatteOrNot);
		
		System.out.println("Price of the lipstick :" +lipStick.price);
		
		System.out.println("Shade number of the lipstick :" +lipStick.shadeNumber);
		
		System.out.println("Quantity of the lipstick in ml :" +lipStick.quantity);
		
		System.out.println("Total Reward points earned after buying the Lipstick :" +lipStick.rewardPointsEarned);
		
		System.out.println("Shade of the lipstick is pink :" +lipStick.shade);
	}
}