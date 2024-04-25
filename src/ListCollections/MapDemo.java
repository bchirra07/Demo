package ListCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> mapos=new TreeMap<String,Integer>();
		mapos.put("Berry", 8);
		mapos.put("Apple", 9);
		mapos.put("Banana",15);
		mapos.put("Berry", 20);
		mapos.put("Orange", 19);
		mapos.put("Grape", 16);
		
		Integer res=mapos.get("Berry");
		System.out.println(res);
		
		System.out.println(mapos.containsKey("Apple"));
		
		
		for(Map.Entry<String,Integer>temp:mapos.entrySet())
		{
			System.out.println("Key:"+temp.getKey()+ " , Value  "+temp.getValue());
		}
		

	}

}
