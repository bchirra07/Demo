package OOPSConcepts;

import java.util.Scanner;

public class NameCondition {

	public static void main(String[] args) {
		Scanner scan  = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = scan.nextLine();
		
		try {
			if(name.equals("Bharath")) {
				Exception ex = new Exception("Access Denied");
				throw ex;
			}
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println("name is " + name);

	}

}