package OOPSConcepts;

public class MainParent {

	public static void main(String[] args) {
		ParentClass pp= new ParentClass();
		pp.walk();
		pp.run();
		
		ChildClass cc=new ChildClass();
		cc.crawl();
		cc.run();
		cc.walk();
		

	}

}
