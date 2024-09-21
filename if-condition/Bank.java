class Bank{
	
	public static void main(String[] args){
		
		String ifscCode = "CNRB0000469";
		long phoneNumber = 8267854323l;
		boolean openOrClose = false;
		
		if (ifscCode == "BARB0PBBAN" && phoneNumber == 8765409678l){
			openOrClose = true;
		}
		if (ifscCode == "CNRB0000469" && phoneNumber == 9807654213l){
			openOrClose = true;
		}
		if (ifscCode == "HDFC0004053" && phoneNumber == 7986546091l){
			openOrClose = false;
		}
		if (ifscCode == "CNRB0000469" && phoneNumber == 8267854323l){
			openOrClose = false;
		}
		if (ifscCode == "UBIN0559920"&& phoneNumber == 9654376437l){
			openOrClose = true;
		}
		System.out.println("The bank with IFSC Code CNRB0000469 is :"+true);
	}
} 