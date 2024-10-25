package com.xworkz.doll.boot;

public class DollDto {

	private String brand;
	private int cost;
	private String modelNumber;
	private int itemWeight;

	public String getBrand() {
		return brand;
	}

	public int getCost() {
		return cost;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public int getItemWeight() {
		return itemWeight;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public void setItemWeight(int itemWeight) {
		this.itemWeight = itemWeight;
	}

	public DollDto(String brand, int cost, String modelNumber, int itemWeight) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.modelNumber = modelNumber;
		this.itemWeight = itemWeight;
	}

	@Override
	public String toString() {
		return "DollDto [brand=" + brand + ", cost=" + cost + ", modelNumber=" + modelNumber + ", itemWeight="
				+ itemWeight + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + cost;
		result = prime * result + itemWeight;
		result = prime * result + ((modelNumber == null) ? 0 : modelNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DollDto other = (DollDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (cost != other.cost)
			return false;
		if (itemWeight != other.itemWeight)
			return false;
		if (modelNumber == null) {
			if (other.modelNumber != null)
				return false;
		} else if (!modelNumber.equals(other.modelNumber))
			return false;
		return true;
	}

}
