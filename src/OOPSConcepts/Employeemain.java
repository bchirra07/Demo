package OOPSConcepts;

public class Employeemain {
	
	int bonus=5000;
	
	public static void main(String[] args) {
		Employee eInf= new Employee();
		System.out.println("Employee salary :"+eInf.salary);
		System.out.println("**Accessing the Superclass attribute using subclass obj**");
		System.out.println("Employee Bonus:"+eInf.bonus);
		

	}

}
