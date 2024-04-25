package ListCollections;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListDemoInt {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<Integer>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a num");
		int a=sc.nextInt();
		list1.add(a);
		list1.add(20);
		list1.add(16);
		list1.add(18);
		list1.add(19);
		list1.add(8);
		
		System.out.println(list1);

		
		System.out.println("**Using For Loop**");
		
		for(Integer tempStr:list1)
		{
			System.out.println(tempStr);
		}
		
		System.out.println("**Using Iterator**");
		
		Iterator <Integer> it=list1.iterator();
		
		while(it.hasNext())
		{
			int res=it.next();
			System.out.println(res);
		}
		
		
		System.out.println("** GET METHOD **");
		System.out.println(list1.get(4));
		
		
		System.out.println("** Sorted List ***");
		Collections.sort(list1);
		for(Integer tempStr:list1)
		{
			System.out.println(tempStr);
		}
		
	}

}

