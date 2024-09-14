package com.xworkz.books.runner;

import com.xworkz.books.boot.Car;
import com.xworkz.books.boot.CarFeatures;

public class CarRunner {
	
	public static void main(String [] args) {
		
		CarFeatures carFeatures = new CarFeatures(5, "Black",12.32f);
		
		Car car = new Car("Tata Harrier", 1598765.784d, 236, 2.0f, carFeatures);
		
		System.out.println("Car name ==" +car.getNameOfTheCar());
		
		System.out.println("Price of the car ==" +car.getPrice());
		
		System.out.println("Cargo volume ==" +car.getCargoVolume());
		
		System.out.println("Engine capacity ==" +car.getEngine());
		
		System.out.println("Seating capacity ==" +car.carFeatures.getSeatingCapacity());
		
		System.out.println("Color ==" +car.carFeatures.getColor());
		
		System.out.println("Touch screen system ==" +car.carFeatures.getTouchScreenSystem());
	}

}
