class MascaraRunner{
	
	public static void main(String [] args){
		
		Mascara.setBrand("Too Faced");
		
		Mascara.setQuantity(4.8f);
		
		Mascara.setPrice(1450);
		
		Mascara.setManufacturer("Estee Lauder Companies");
		
		Mascara.setExpiryDate("15 April 2026");
		
		
		String brandOfTheMascara = Mascara.getBrand("Too Faced");
		
		System.out.println("The brand of the mascara is :" +brandOfTheMascara);
		
		
		float netQuantityOfTheMascara = Mascara.getQuantity(4.8f);
		
		System.out.println("The net quantity of the mascara is :" +netQuantityOfTheMascara);
		
		
		int priceOfTheMascara = Mascara.getPrice(1450);
		
		System.out.println("The price of the mascara is :" +priceOfTheMascara);
		
		
		String manufacturerOfTheMascara = Mascara.getManufacturer("Estee Lauder Companies");
		
		System.out.println("The manufacturing company of the Mascara is :" +manufacturerOfTheMascara);
		
		
		String expiryDateOfTheMascara = Mascara.getExpiryDate("15 April 2026");
		
		System.out.println("The expiry date of the Mascara is :" +expiryDateOfTheMascara);
		
	}
}