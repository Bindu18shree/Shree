package com.xworkz.watch.dto;

public class WatchDto {
	
	private String brand;
	private float cost;
	private String model;
	private int modelYear;
	private boolean isBatteryIncluded;
	
	
	public WatchDto(String brand, float cost, String model, int modelYear, boolean isBatteryIncluded) {
	
		this.brand = brand;
		this.cost = cost;
		this.model = model;
		this.modelYear = modelYear;
		this.isBatteryIncluded = isBatteryIncluded;
	}
	
	
	public String getBrand() {
		return brand;
	}
	public float getCost() {
		return cost;
	}
	public String getModel() {
		return model;
	}
	public int getModelYear() {
		return modelYear;
	}
	public boolean isBatteryIncluded() {
		return isBatteryIncluded;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setModelYear(int modelYear) {
		this.modelYear = modelYear;
	}
	public void setBatteryIncluded(boolean isBatteryIncluded) {
		this.isBatteryIncluded = isBatteryIncluded;
	}


	@Override
	public String toString() {
		return "WatchDto [brand=" + brand + ", cost=" + cost + ", model=" + model + ", modelYear=" + modelYear
				+ ", isBatteryIncluded=" + isBatteryIncluded + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + (isBatteryIncluded ? 1231 : 1237);
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + modelYear;
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
		WatchDto other = (WatchDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (isBatteryIncluded != other.isBatteryIncluded)
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (modelYear != other.modelYear)
			return false;
		return true;
	}
}
