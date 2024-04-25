package ListCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListDemo {

	public static void main(String[] args) {
		
		List<String> list1=new ArrayList<String>();
		
		list1.add("Dog");
		list1.add("Cat");
		list1.add("Rabbit");
		list1.add("Rat");
		list1.add("Deer");
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter Animal");
		String animal=sc1.nextLine();
		list1.add(animal);
		System.out.println(list1);

		
		System.out.println("**Using For Loop**");
		
		for(String tempStr:list1)
		{
			System.out.println(tempStr);
		}
		
		System.out.println("**Using Iterator**");
		
		Iterator <String> it=list1.iterator();
		
		while(it.hasNext())
		{
			String res=it.next();
			System.out.println(res);
		}
		
		
		System.out.println("** GET METHOD **");
		System.out.println(list1.get(4));
		
		
		System.out.println("** Sorted List ***");
		Collections.sort(list1);
		for(String tempStr:list1)
		{
			System.out.println(tempStr);
		}
	}

}
