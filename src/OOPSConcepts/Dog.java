package OOPSConcepts;

public class Dog {
	int eyes=2;
	int ears=2;
	int nose=1;
	
	public Dog()
	{
		
	}
	
	public Dog(int eyes, int ears, int nose)
	{
		this.eyes=eyes;
		this.ears=ears;
		this.nose=nose;
	}
	public Dog(int ears, int nose)
	{
		this.ears=ears;
		this.nose=nose;
	}
	public Dog(int eyes)
	{
		this.eyes=eyes;

	}
	
	void dogInfo() {
		System.out.println("No of Dog Eyes are :"+eyes);
		System.out.println("No of Dog Ears are :"+ears);
		System.out.println("No of Dog Nose are :"+nose);
	}
	
	void run()
	{
		System.out.println("Dog can Walk");
	}
	
	

	public static void main(String[] args) {
		Dog obj1=new Dog(2,2,1);
		obj1.dogInfo();
		obj1.run();
		
		
		//Object 2
		
		Dog obj2=new Dog(3,4);
	
		obj2.dogInfo();
		
		//Object 3
		
		Dog obj3=new Dog(4);
		obj3.dogInfo();
	
		
	
		

	}

}
