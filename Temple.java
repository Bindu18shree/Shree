class Temple{
	
	public static void main(String [] args){
		
		char udupi = 'U';
		char murdeshwara = 'M';
		char vitthala = 'V';
		char gokarna = 'G';
		char kotilingeshwara = 'K';
		char dharmasthala = 'D';
		char tirupathi = 'T';
		char hornadu = 'H';
		
		char [] places = {udupi,murdeshwara,vitthala,gokarna,kotilingeshwara,dharmasthala,tirupathi,hornadu};
		System.out.println("The total array length of the class Temple :"+places.length);
		
		places [6] = 'S';
		
		for (int i=0 ; i<=7 ; i++){
			System.out.println("The length :"+places[i]);
		}
	}
}