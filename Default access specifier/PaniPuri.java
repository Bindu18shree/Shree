package com.xworkz.chats.boot;

public class PaniPuri {
	
	public int cost;
	
	public void run() {
		
		Chats chats = new Chats();
		
		chats.chatsShopName = "Bangarpet Chats";
		System.out.println("Name of the chats Shop :" +chats.getChatsShopName());
		
		chats.noOfChatsAvailable = 15;
		System.out.println("Total number of chat items available :" +chats.getNoOfChatsAvailable());
		
		chats.minCostOfChatsStartsAt = 30.0f;
		System.out.println("The minimum cost of chat starts at Rs."+chats.getMinCostOfChatsStartsAt());
		
		chats.isChatShopOpenOrClosed = false;
		System.out.println("Chats Shop opens at 2.30 PM :" +chats.isChatShopOpenOrClosed());
		
		
	}
	
	
	

}
