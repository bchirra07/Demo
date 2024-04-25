package TestCodeRyze1;

public class ConstOverload {
	String name;
	int age;
	String college;
	public ConstOverload()
	{
		
	}
	
	public ConstOverload(String name, int age )
	{
		this.name=name;
		this.age=age;
		System.out.println("Name "+name+ " \nAge="+age);
	}
	
	public ConstOverload(String  name,int age, String college) {
		this.college=college;
		this.age=age;
		System.out.println("Name "+name+ " \nAge="+age+ "\n College"+ college);
		
	}

	public static void main(String[] args) {
		/* Difference between Method and Constructor
		 * A Method will have a return type where as Constructor will not
		 * A Constructor is used to initialize the class object but method will have specific operations
		 * 
		 */
		
		ConstOverload col=new ConstOverload("Bharath",25);
		ConstOverload cl=new ConstOverload("Satya",23, "CodeRyze");

	}

}
