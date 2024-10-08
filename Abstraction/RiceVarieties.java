package com.xworkz.rice.boot;

public class RiceVarieties extends Rice {
	
	public int costOfSonaMasuriRicePerKg;
	public float costOfBasmatiRicePerKg;
	public double costOfRedricePerKg;
	public int costOfBrownRicePerKg;
	
	@Override
	public void sonamasuriRice() {
		
		System.out.println("cost of sonamasuri rice per kg:" +costOfSonaMasuriRicePerKg);
	}

	@Override
	public void basmatiRice() {
		
		System.out.println("cost of basmati rice per kg:" +costOfBasmatiRicePerKg);
	}

	@Override
	public void redRice() {
		
		System.out.println("Cost of red rice per kg:" +costOfRedricePerKg);
	
	}

	@Override
	public void brownRice() {
	
		System.out.println("Cost of brown rice per kg:" +costOfBrownRicePerKg);
	}

	@Override
	public void kolamRice() {
		
		System.out.println("Kolam rice is immensly popular in India");
	}

	@Override
	public void boiledRice() {
	
		System.out.println("Boiled rice can improve blood cholestrol levels");
	}

	@Override
	public void wildRice() {
		
		System.out.println("Wild rice contains more fibre, potasium and zinc");
	}

	@Override
	public void sushiRice() {
		
		System.out.println("Sushi Rice is also known as Japonica");
	}
	
    public void richInCarbs() {
		
		System.out.println("All types are rich in carbohydrates");
	}
	
	public void richInVitaminsB() {
		
		System.out.println("Rice are rich in vitamins : Thiamin and niacin");
	}
	
	public void richInMinerals() {
		
		
	}
	
	public void glutenFree() {
		
		
	}
}
