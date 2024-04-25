package OOPSConcepts;

import java.util.Scanner;

public class Excep {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x and y values");
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		try {
			int result=x/y;
			System.out.println("Result "+ result);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		finally
		{
		System.out.println("Result of x/y after the exception block");
		sc.close();
	}
	}

	

}
