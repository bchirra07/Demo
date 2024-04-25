package OOPSConcepts;

public class Shape {
	static
	{
		System.out.println("Represents Geometric Shapes: Circle, Rectangle, Square");
	}
	
	
	public static void main(String[] args)
	{
	  Cirlce c= new Cirlce();
	  System.out.println("Area of Circle: "+c.areaCircle(4));
	  
	  Rectangle r=new Rectangle();
	  System.out.println("Area of Rectangle: "+r.areaRectangle(4, 5));
	  
	}
}

