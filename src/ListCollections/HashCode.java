package ListCollections;

public class HashCode {

	public static void main(String[] args) {
		String name ="Bharath";
		System.out.println(name.hashCode());
		System.out.println(name.hashCode());
		
		String myName="Bunny";
		System.out.println(myName.hashCode());
		
		
		Integer in =new Integer(1516207134);
		System.out.println(in.hashCode());
		
		String s1="CodeRyze";
		System.out.println(s1.hashCode());
		System.out.println(s1.hashCode());
		
		String s2= new String("CodeRyze");
		System.out.println(s1.equals(s2));
		System.out.println(s2.hashCode());

	}

}
