package OOPSConcepts;

public class Bird {
	int wings=2;
	static int tail=1;
	
	public Bird()
	{
		System.out.println("No arg Constructor");
	}
	
	{
		System.out.println("I am a Non Static Block");
	}
	
	static {
		System.out.println("I am a Static Block  below the Non-static block");
	}
	
	public void fly()
	{
		System.out.println("Bird can fly");
	}
	
	public static void eat()
	{
		System.out.println("Bird Can eat");
	}
	

	public static void main(String[] args) {
	
		//Bird b1=new Bird();
		System.out.println(tail);
		//b1.fly();
		//System.out.println("Bird Wings:"+b1.wings);
		eat();

	}

}
