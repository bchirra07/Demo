package OOPSConcepts;

public class Animalmain extends Animal {
	
	
	void dance() {
		System.out.println("My animal can dance!!");
	}

	public static void main(String[] args) {
		Animalmain aa = new Animalmain();
		aa.dance();
		aa.sleep();
		aa.walk();
		System.out.println(aa.name);
		
		Animal bb ;//upcasting
		bb = new Animalmain();
		bb.sleep();
		bb.walk();
		//bb.dance();
		
		Animalmain cc2=(Animalmain)bb;
		cc2.dance();
		cc2.walk();
		cc2.sleep();
		
		
		
		

	}

}



