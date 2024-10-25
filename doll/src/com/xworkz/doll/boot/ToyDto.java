package com.xworkz.doll.boot;

public class ToyDto {

	private String brand;
	private float cost;
	private long importerContactNo;
	private int recommendedAge;

	public String getBrand() {
		return brand;
	}

	public float getCost() {
		return cost;
	}

	public long getImporterContactNo() {
		return importerContactNo;
	}

	public int getRecommendedAge() {
		return recommendedAge;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public void setImporterContactNo(long importerContactNo) {
		this.importerContactNo = importerContactNo;
	}

	public void setRecommendedAge(int recommendedAge) {
		this.recommendedAge = recommendedAge;
	}

	public ToyDto(String brand, float cost, long importerContactNo, int recommendedAge) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.importerContactNo = importerContactNo;
		this.recommendedAge = recommendedAge;
	}

	@Override
	public String toString() {
		return "ToyDto [brand=" + brand + ", cost=" + cost + ", importerContactNo=" + importerContactNo
				+ ", recommendedAge=" + recommendedAge + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + Float.floatToIntBits(cost);
		result = prime * result + (int) (importerContactNo ^ (importerContactNo >>> 32));
		result = prime * result + recommendedAge;
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
		ToyDto other = (ToyDto) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Float.floatToIntBits(cost) != Float.floatToIntBits(other.cost))
			return false;
		if (importerContactNo != other.importerContactNo)
			return false;
		if (recommendedAge != other.recommendedAge)
			return false;
		return true;
	}

}
