package OOPSConcepts;

import java.util.Scanner;

public class NameConditionThrows {

	static private String takeInput() throws Exception{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name");
		String name = scan.nextLine();
		if(name.equals("Bharath")) {
			Exception ex = new Exception("Access Denied");
			throw ex;
		}
		return name;
	}
	
	public static void main(String[] args) {
		String name = null;
		try {
			name = takeInput();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		System.out.println("name is " + name);

	}

}
