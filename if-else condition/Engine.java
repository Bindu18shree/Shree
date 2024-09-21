class Engine{
	
	public static void carEngine(String type , float capacity){
		
		if(type == "Kryotech turbocharged diesel engine" && capacity == 2.0f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "Kryotech turbocharged diesel engine" && capacity == 1.2f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "i-VTEC petrol engine" && capacity == 2.0f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "i-VTEC petrol engine" && capacity == 1.2f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is of Honda Comapny ");
		}
		
		if(type == "Kryotech turbocharged diesel engine" || capacity == 2.0f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "Kryotech turbocharged diesel engine" || capacity == 1.2f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "i-VTEC petrol engine" || capacity == 2.0f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is not Tata Motors");
		}
		
		if(type == "i-VTEC petrol engine" || capacity == 1.2f){
			System.out.println("It is of Tata Motors Company");
		}
		else{
			System.out.println("It is of Honda Comapny ");
		}
	}
}