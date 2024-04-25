package OOPSConcepts;

public class CarInheritMain {


	public static void main(String[] args) {
	 
		CarInMain cobj= (CarInMain) new CarIn(4, "Mercedes");
		
		cobj.carInfor();
		
		System.out.println(cobj.carBrand());

	}

}
