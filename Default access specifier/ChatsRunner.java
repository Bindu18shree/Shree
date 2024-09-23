package com.xworkz.chats.runner;

import com.xworkz.chats.boot.PaniPuri;

public class ChatsRunner {
	
	public static void main(String [] args) {
		
		PaniPuri panipuri = new PaniPuri();
		
		panipuri.run();
		
		panipuri.cost = 40;
		System.out.println("Cost of panipuri :" +panipuri.cost);
		
		
	}

}
