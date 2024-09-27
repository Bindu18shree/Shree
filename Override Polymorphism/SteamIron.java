package com.xworkz.iron.boot;

public class SteamIron extends Philips {
	
	public String modelName;
	public double cost;
	public int wattage;
	public char unitOfWattage;
	public float weight;
	public boolean isIronScratchResistantOrNot;
	
	@Override
	public String getModelName() {
		return modelName;
	}
	@Override
	public double getCost() {
		return cost;
	}
	@Override
	public int getWattage() {
		return wattage;
	}
	@Override
	public char getUnitOfWattage() {
		return unitOfWattage;
	}
	@Override
	public float getWeight() {
		return weight;
	}
	@Override
	public boolean isIronScratchResistantOrNot() {
		return isIronScratchResistantOrNot;
	}
	@Override
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public void setCost(double cost) {
		this.cost = cost;
	}
	@Override
	public void setWattage(int wattage) {
		this.wattage = wattage;
	}
	@Override
	public void setUnitOfWattage(char unitOfWattage) {
		this.unitOfWattage = unitOfWattage;
	}
	@Override
	public void setWeight(float weight) {
		this.weight = weight;
	}
	@Override
	public void setIsIronScratchResistantOrNot(boolean isIronScratchResistantOrNot) {
		this.isIronScratchResistantOrNot = isIronScratchResistantOrNot;
	}

}
