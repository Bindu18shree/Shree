package com.xworkz.car.runner;

import com.xworkz.car.boot.Brand;
import com.xworkz.car.boot.Car;
import com.xworkz.car.boot.Thar;

public class CarRunner {
	
	public static void main(String [] args) {
		
		Brand brand = new Brand("Mahindra", 1945, "Dr.Anish Shah", 260000l);
		
		Thar thar = new Thar(17.28f, brand);
		
		Car car = new Car("XUV 700", 26.0400d, 16.5f, 197, brand);
		
		System.out.println("Brand of the Thar :" +thar.getBrand().getBrandName());
		
		System.out.println("Name of the Car :" +car.getName());
		
		System.out.println("Brand of the XUV 700 Car :" +car.getBrand().getBrandName());
		
		System.out.println("CEO of the Brand Mahindra :" +thar.getBrand().getCeo());
		
		System.out.println("Number of employees in Mahindra :" +car.getBrand().getNumberOfEmployees());
		
		System.out.println("Mahindra was founded in :"+thar.getBrand().getFoundedIn());
		
		
	}

}
