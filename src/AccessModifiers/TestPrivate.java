package AccessModifiers;

public class TestPrivate {

	private String pri="Private";
	
	private void priMethod()
	{
		System.out.println("this is a private method");
	}
	
	public static void main(String[] args) {
		
		TestPrivate tp=new TestPrivate();
		System.out.println(tp.pri);
		tp.priMethod();
	}
}
