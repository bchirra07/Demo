package TestCodeRyze1;

public class SwitchEx {

	public static void main(String[] args) {
		String op="Multiply";
		int a=22;
		int b=15;
		switch(op) {
		case "add":
			      System.out.println("The sum of "+ a
			    		  + " and " + b+ " is " + (a+b));
			      break;
		case "Diff":
		      System.out.println("The Difference of "+ a
		    		  + " and " + b+ " is " + (a-b));
		      break;
		case "Multiply":
		      System.out.println("The Product of  " + a
		    		  + " and " + b + " is " + (a*b));
		      break;
		case "Div":
		      System.out.println("The Division of  " + a
		    		  + " and " + b + " is " + (a%b));
		      break;
		      
		      default:
		    	  System.out.println("Invalid Selection");
			
		}

	}

}