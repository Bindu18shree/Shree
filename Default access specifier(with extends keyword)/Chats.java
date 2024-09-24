package com.xworkz.chats.boot;

class Chats {
	
    String chatsShopName;
	int noOfChatsAvailable;
	float minCostOfChatsStartsAt;
	boolean isChatShopOpenOrClosed;
	
	Chats(){
		
	}

    Chats(String chatsShopName, int noOfChatsAvailable, float minCostOfChatsStartsAt,boolean isChatShopOpenOrClosed) {
		
		this.chatsShopName = chatsShopName;
		this.noOfChatsAvailable = noOfChatsAvailable;
		this.minCostOfChatsStartsAt = minCostOfChatsStartsAt;
		this.isChatShopOpenOrClosed = isChatShopOpenOrClosed;
	}

	
     String getChatsShopName() {
		return chatsShopName;
	}

	 int getNoOfChatsAvailable() {
		return noOfChatsAvailable;
	}

	 float getMinCostOfChatsStartsAt() {
		return minCostOfChatsStartsAt;
	}

	 boolean isChatShopOpenOrClosed() {
		return isChatShopOpenOrClosed;
	}
}
