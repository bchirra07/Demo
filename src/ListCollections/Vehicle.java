package ListCollections;

import java.util.Objects;

public class Vehicle implements Comparable<Vehicle>{

	public Vehicle(String brand, int year) {
		super();
		this.brand = brand;
		this.year = year;
	}
	@Override
	public String toString() {
		return "Vehicle [brand=" + brand + ", year=" + year + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brand, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return Objects.equals(brand, other.brand) && year == other.year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	String brand;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	int year;
	@Override
	public int compareTo(Vehicle o) {
		int x= this.year-o.year;
		return x;
	}
	
	
}
