class ChargeSheetRunner{
	
	public static void main(String [] args){
		
		ChargeSheet chargeSheet = new ChargeSheet();
		
		chargeSheet.setName("REVOCATUS KATUNZI");
		
		chargeSheet.setChargeSheetNo("24/2015");
		
		chargeSheet.setAge(32);
		
		chargeSheet.setCpiNumber(1749316l);
		
		chargeSheet.setTime(2.45f);
		
		chargeSheet.setIsChargeSheetOriginalOrSupplementary(false);
		
		chargeSheet.setCarCompany('S');
		
		System.out.println("The name of the person is :" +chargeSheet.getName());
		
		System.out.println("Charge Sheet number :" +chargeSheet.getChargeSheetNo());
		
		System.out.println("Age of the person filed in chargesheet :" +chargeSheet.getAge());
		
		System.out.println("CPI Number is :" +chargeSheet.getCpiNumber());
		
		System.out.println("Timings of the charge sheet filed :" +chargeSheet.getTime());
		
		System.out.println("Charge sheet is not supplementary :" +chargeSheet.isChargeSheetOriginalOrSupplementary());
		
		System.out.println("Company of the car of the person :" +chargeSheet.getCarCompany());
		
		
	}
}