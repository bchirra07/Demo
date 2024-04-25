package OOPSConcepts;

class Person {
	int id;
	String name;

	Person() { 
		System.out.println("hi i am the super class");
	}

	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
}

class Emp extends Person {
	float salary;
	
	Emp(){
		super();
		System.out.println("hi");
	}
	Emp(int id,String name, float salary) {
		super.id = id;
		super.name = name; // reusing parent constructor
		this.salary = salary;
	}


	void display() {
		System.out.println(id + " " + name + " " + salary);
	}
}

class TestSuperEmp {
	public static void main(String[] args) {
		Emp e1 = new Emp(1, "Zakir", 450.70f);
		e1.display();
		
		System.out.println("******************************");
	
		Emp e2 = new Emp();
		e2.display();
		
		Person pp = new Person();
	
		}

}
