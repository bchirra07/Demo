package OOPSConcepts;

public class Elephant {
	int trunk=1;
	String elephantColor="";
	
	void elphantDesc()
	{
		System.out.println("No of Trunks :"+trunk);
		System.out.println("color of Elephant  "+elephantColor);
	}

	public static void main(String[] args) {
		Elephant e1=new Elephant();
		e1.elephantColor="black";
		e1.elphantDesc();
		
		Elephant e2=new Elephant();
		e2.elephantColor="brown";
		e2.elphantDesc();
		Elephant e3=new Elephant();
		e3.elephantColor="Grey";
		e3.elphantDesc();
		
		Elephant e4=new Elephant();
		e4.elephantColor="Yellow";
		e4.elphantDesc();
		
		

	}

}
