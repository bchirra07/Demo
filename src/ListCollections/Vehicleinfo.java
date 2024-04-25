package ListCollections;

import java.util.Objects;

public class Vehicleinfo {
	int speed;
	String model;
	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Vehicleinfo(int speed, String model) {
		super();
		this.speed = speed;
		this.model = model;
	}
	public Vehicleinfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public int hashCode() {
		return Objects.hash(model, speed);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicleinfo other = (Vehicleinfo) obj;
		return Objects.equals(model, other.model) && speed == other.speed;
	}
	@Override
	public String toString() {
		return "Vehicleinfo [speed=" + speed + ", model=" + model + "]";
	}
	

}
