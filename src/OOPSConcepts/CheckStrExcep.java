package OOPSConcepts;

import java.util.Scanner;

public class CheckStrExcep {

	
		static private void convertString(String str) throws Exception{
			String upCase=null;
		    if(str.length()==0)
		    {
		    	Exception ex = new Exception("String is Empty");
		    	throw ex;
		    }
		    else
		    {
		    upCase=str.toUpperCase();
		    System.out.println("Converted String "+ upCase);
		    }
			//return upCase;
		}
		
	    

		public static void main(String[] args) {
			String str=null;
			Scanner sc=new Scanner(System.in);
		    System.out.println("Enter the String");
		    str= sc.nextLine();
		    
			try {
				convertString(str);
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



