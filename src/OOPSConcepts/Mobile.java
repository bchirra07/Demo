package OOPSConcepts;

public class Mobile {
	double price=7000;
	String brand="Nokia";
	String color="Ash";
	public Mobile()
	{
		
	}
	
	public Mobile(double price,String brand,String color)
	{
		this.price=price;
		this.brand=brand;
		this.color=color;
	}
	public Mobile(double price,String brand)
	{
		this.price=price;
		this.brand=brand;
	}
	
	public Mobile(String brand,String color)
	{
		this.brand=brand;
		this.color=color;
	}
	
	void mobInfo()
	{
		System.out.println("Mobile Price "+price);
		System.out.println("Mobile Brand "+brand);
		System.out.println("Mobile color "+color);
	}
	
	void userInfo()
	{
		System.out.println("User has the Mobile "+brand);
	}
	

	public static void main(String[] args) {
		
	Mobile user1= new Mobile(20000,"Apple",
			"White");
	
	user1.userInfo();
	user1.mobInfo();
	
	Mobile user2=new Mobile(35000, "Oneplus");
	
	
	user2.userInfo();
	user2.mobInfo();
	
	Mobile user3=new Mobile(25000, "Samsung");
	user3.userInfo();
	
		

	}

}
