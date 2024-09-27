package com.xworkz.iron.boot;

public class Philips {
	
	public String modelName;
	public double cost;
	public int wattage;
	public char unitOfWattage;
	public float weight;
	public boolean isIronScratchResistantOrNot;
	
	
	public String getModelName() {
		return modelName;
	}
	public double getCost() {
		return cost;
	}
	public int getWattage() {
		return wattage;
	}
	public char getUnitOfWattage() {
		return unitOfWattage;
	}
	public float getWeight() {
		return weight;
	}
	public boolean isIronScratchResistantOrNot() {
		return isIronScratchResistantOrNot;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	public void setUnitOfWattage(char unitOfWattage) {
		this.unitOfWattage = unitOfWattage;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public void setIsIronScratchResistantOrNot(boolean isIronScratchResistantOrNot) {
		this.isIronScratchResistantOrNot = isIronScratchResistantOrNot;
	}
}
