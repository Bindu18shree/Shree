package com.xworkz.breakfast.boot;

public class Saree {
	
	public String fabric;
	
	public double price;
	
	public float length;
	
	public float width;
	
	public char color;
	
	public boolean isSareeWithZariOrNot;
	
	
	public Saree(String fabric, double price, float length, float width, char color, boolean isSareeWithZariOrNot) {
		
		this.fabric = fabric;
		
		this.price = price;
		
		this.length = length;
		
		this.width = width;
		
		this.color = color;
		
		this.isSareeWithZariOrNot = isSareeWithZariOrNot;
		
	}


	public String getFabric() {
		return fabric;
	}


	public double getPrice() {
		return price;
	}


	public float getLength() {
		return length;
	}


	public float getWidth() {
		return width;
	}


	public char getColor() {
		return color;
	}


	public boolean isSareeWithZariOrNot() {
		return isSareeWithZariOrNot;
	}
}
