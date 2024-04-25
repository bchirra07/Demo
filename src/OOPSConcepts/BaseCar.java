package OOPSConcepts;

public abstract class BaseCar {
	
	int wheels=4;
	
	public BaseCar()
	{
		System.out.println("BaseCar Constructor");
	}
	public abstract void model();
	
	
	public abstract void speed();
	
	public void steering()
	{
		System.out.println("It has Power Steering");
	}

}
