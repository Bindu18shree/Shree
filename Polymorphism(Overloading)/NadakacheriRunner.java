package com.xworkz.nadakacheri.runner;

import com.xworkz.nadakacheri.boot.Nadakacheri;

public class NadakacheriRunner {
	
	public static void main(String [] args) {
		
		Nadakacheri nadakacheri = new Nadakacheri();
		
		Nadakacheri nadakacheri1 = new Nadakacheri("Atalji Janasnehi Kendra");
		
		Nadakacheri nadakacheri2 = new Nadakacheri("Atalji Janasnehi Kendra", true);
		
		Nadakacheri nadakacheri3 = new Nadakacheri("Atalji Janasnehi Kendra", true, 42);
		
		Nadakacheri nadakacheri4 = new Nadakacheri("Atalji Janasnehi Kendra", true, 42, 10.35f);
		
		Nadakacheri nadakacheri5 = new Nadakacheri("Atalji Janasnehi Kendra", true, 42, 10.35f,'e');
		
		Nadakacheri nadakacheri6 = new Nadakacheri("Atalji Janasnehi Kendra", true, 42, 10.35f,'e',560064);
		
		Nadakacheri nadakacheri7 = new Nadakacheri("Atalji Janasnehi Kendra",true, 42, 10.35f, 'e', 560064, 40.5420d);
		
		
		nadakacheri.atalajiJanasnehiKendra();
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra");
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false);
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false, 42);
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false, 42, 10.35f);
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false, 42, 10.35f, 'e');
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false, 42, 10.35f, 'e', 560054);
		nadakacheri.atalajiJanasnehiKendra("Atalji Janasnehi Kendra", false, 42, 10.35f, 'e', 560054, 45.6784d);
		
	}

}
