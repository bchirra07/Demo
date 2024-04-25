package OOPSConcepts;

public class CarIn extends CarInMain{
 int wheels;
 String brand;
 
 public CarIn()
 {
	 
 }
 
  public CarIn(int wheels, String brand)
  {
	  this.wheels=wheels;
	  this.brand=brand;
  }
  

 
  public String carBrand()
  {
	  return brand;
  }
  
  int wheels()
  {
	  return wheels;
  }
  
  public void move()
  {
	  System.out.println("A car can move based on accelaration");
  }
	
	
}
