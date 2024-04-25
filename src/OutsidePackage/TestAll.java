package OutsidePackage;

import AccessModifiers.TestProtected;
//import AccessModifiers.TestDef;
import AccessModifiers.TestPub;

public class TestAll extends TestProtected {

	public static void main(String[] args) {
		/*TestDef td=new TestDef();
		td.defMethod();
		System.out.println(td.def);*/
		
		TestPub tb =new TestPub();
		System.out.println(tb.pub);
		tb.pubMethod();
		
		//TestProtected tpp=new TestProtected();
		TestAll ta= new TestAll();
		ta.proMethod();
		System.out.println(ta.pro);
	}

}
