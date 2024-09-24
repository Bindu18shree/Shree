package com.xworkz.chats.boot;

public class PaniPuri extends Chats {
	
	public int cost;
	
	public void run() {
		
		super.chatsShopName = "Bangarpet Chats";
		System.out.println("Name of the chats Shop :" +getChatsShopName());
		
		super.noOfChatsAvailable = 15;
		System.out.println("Total number of chat items available :" +getNoOfChatsAvailable());
		
		super.minCostOfChatsStartsAt = 30.0f;
		System.out.println("The minimum cost of chat starts at Rs."+getMinCostOfChatsStartsAt());
		
		super.isChatShopOpenOrClosed = true;
		System.out.println("Chats Shop opens at 2.30 PM :" +isChatShopOpenOrClosed());
		
		
	}
	
	
	

}
