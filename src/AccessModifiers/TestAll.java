package AccessModifiers;

public class TestAll {

	public static void main(String[] args) {
	TestDef td=new TestDef();
	td.defMethod();
	System.out.println(td.def);
	
	TestPub tb =new TestPub();
	System.out.println(tb.pub);
	System.out.println(tb.pubMethod());

	//TestPrivate tp=new TestPrivate();
	//System.out.println(tp.pri);
	
	TestProtected tpp=new TestProtected();
	tpp.proMethod();
	System.out.println(tpp.pro);
	
	}

}
