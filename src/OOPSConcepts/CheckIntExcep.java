package OOPSConcepts;

import java.util.Scanner;

public class CheckIntExcep {
	static private int checkEvenOdd(int x) throws Exception{
		
	    if(x%2!=0)
	    {
	    	Exception ex = new Exception("Number is ODD");
	    	throw ex;
	    }
	    else
	    {
	    	System.out.println("Number is Even");
	    }
		return x;
	}
	
    

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the Integer");
	    x= sc.nextInt();
	    
		try {
			checkEvenOdd(x);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			e.getMessage();
		}
		finally
		{
			sc.close();
			
		}
		
		
		

	}

}
