package OOPSConcepts;

public class Carmain extends Car1 {
	
	
	void brake() {
		System.out.println("I can stop my vehicle!!!");
	}

	public static void main(String[] args) {
		Carmain cc = new  Carmain();
		cc.brake();
		cc.speed();
		cc.show();
		
		Car1 cc1 = new Car1();
		cc1.show();
		cc1.speed();
		//cc1.brake();
		
		
		System.out.println("Type casting!!!");
		Car1 cc2;//reference of the parent class
		cc2= new Carmain();//upcasting
		cc2.show();
		cc2.speed();
		//cc2.brake();
		
		Carmain cc3=(Carmain)cc2;
		cc3.brake();
		cc3.show();
		cc3.speed();
		System.out.println(cc3.model);
		
		

	}

}


