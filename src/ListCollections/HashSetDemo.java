package ListCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		Student s1=new Student("Vishwa", 25);
		Student s2= new Student("Bunty", 23);
		Student s3= new Student("Rakesh", 27);
		Student s4=new Student("Prem", 25);
		Student s5=new Student("Bunty", 23);
		
		Set<Student> ss=new HashSet<Student>();
		ss.add(s1);
		ss.add(s2);
		ss.add(s3);
		ss.add(s4);
		ss.add(s5);
		Set<Student> sl=new LinkedHashSet<Student>();
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);
		
		
		Set<Student> st=new TreeSet<Student>(new sortStudent());
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		for(Student sempa:ss)
		{
			System.out.println(sempa);
		}
		System.out.println("****** HashSet ******");
		for(Student sempa1:sl)
		{
			System.out.println(sempa1);
		}
		
		System.out.println("**** Treeset *****");
		
		for(Student sempa2:st)
		{
			System.out.println(sempa2);
		}
		
		System.out.println(s5.equals(s2));

	}

}
