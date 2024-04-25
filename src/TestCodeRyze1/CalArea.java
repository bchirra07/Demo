package TestCodeRyze1;

import java.util.Scanner;

public class CalArea {
	public void AreaPerimRec(int len, int bre)
	{
		int l,b;
		l=len;
	     b=bre;
	     System.out.println("Area of the Rectangle ="+l*b);
	     System.out.println("Perimeter of the Rectangle="+(2*(l+b)));

		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the len and bre");
	    int len=sc.nextInt();
	    int bre=sc.nextInt();
	    CalArea ca=new CalArea();
	    ca.AreaPerimRec(len,bre);
		

	}

}
