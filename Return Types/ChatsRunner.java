class ChatsRunner{
	
	public static void main(String[] args){
	

    System.out.println("The famous Chats Shop in Malleshwaram :"+Chats.name("Bangarpete Chats"));	

    System.out.println("The cost of Masalpuri and Bhelpuri :"+Chats.cost(30,30)	);
	
	System.out.println("The cost of Sevpuri , Tikkipuri and Chipsmasala :"+Chats.cost(35,40,35));
	
	System.out.println("The number of other chats in the shop :"+Chats.otherChats(1,1,1,1));
	
	System.out.println("The cost of samosa, samosaMasala, dhaipuri, nippetMasala, aloopuri :"+Chats.cost(15,30,30,35,25));
	
	}
}