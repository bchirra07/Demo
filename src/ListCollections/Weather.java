package ListCollections;

public class Weather implements Comparable<Weather> {
	
	String day;
	int temp;
	String location;
	public Weather()
	{
		super();
	}
	
	
	public Weather(String day, int temp, String location) {
		super();
		this.day = day;
		this.temp = temp;
		this.location = location;
	}


	public String getDay() {
		return day;
	}


	public void setDay(String day) {
		this.day = day;
	}


	public int getTemp() {
		return temp;
	}


	public void setTemp(int temp) {
		this.temp = temp;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public String toString() {
		return "Weather [day=" + day + ", temp=" + temp + ", location=" + location + "]";
	}


	@Override
	public int compareTo(Weather o) {
		int x= this.temp-o.temp;
		return x;
	}
	
	
	
	

}
