package OOPSConcepts;

public class Car {
	String color;
	int wheels;
	int model;
	
	public Car()
	{
	
	}
	
	public Car(String color, int wheels, int model)
	{
		this.color=color;
		this.wheels=wheels;
		this.model=model;
	}
	
	public void carInfo()
	{
		System.out.println("Car Color :"+ color);
		System.out.println("Car wheels :"+ wheels);
		System.out.println("Car models :"+ model);
		
	}

	public static void main(String[] args) {
		
		Car c1= new Car("Midnight Black", 0,0);
		
		c1.carInfo();
		
	}

}
