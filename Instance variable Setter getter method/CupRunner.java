class CupRunner{
	
	public static void main(String [] args){
		
		Cup cup = new Cup();
		
		cup.setItemModelNumber("The Earth Store");
		
		cup.setCapacity(280);
		
		cup.setItemWeight(0.61f);
		
		cup.setPrice(243.990d);
		
		cup.setTelePhoneNumberOfManufacturer(1800342169l);
		
		cup.setBlockOfTheManufacturer('F');
		
		cup.setIsItMicroWaveSafeOrNot(false);
		
		System.out.println("The Model number of the cup :" +cup.getItemModelNumber());
		
		System.out.println("The capacity of the cup in ml :" +cup.getCapacity());
		
		System.out.println("The Weight of the cup in grmas is :" +cup.getItemWeight());
		
		System.out.println("Price of the cup is :" +cup.getPrice());
		
		System.out.println("Telephone number of the manufacturer :" +cup.getTelePhoneNumberOfManufacturer());
		
		System.out.println("The block of the manufacturer is :" +cup.getBlockOfTheManufacturer());
		
		System.out.println("Cup is microwave safe :" +cup.isItMicroWaveSafeOrNot());
	}
}
		
		
	
	