package OOPSConcepts;

public class CarInMain  {
  
	String brand;
	String color;
	public CarInMain()
	{
		
	}
	
	public CarInMain(String brand, String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	public String carBrand()
	{
		return brand;
	}
	
	public void carInfor()
	{
		System.out.println("Car Information"+ brand);
	}
}
