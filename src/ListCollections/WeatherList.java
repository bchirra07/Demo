package ListCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class WeatherList {

	public static void main(String[] args) {
	
		
		Weather w1=new Weather("Thursday", 6,"Chicago");
		Weather w2=new Weather("Sunday",18,"Hyderabad");
		Weather w3=new Weather("Monday",4,"Holland");
		
		List <Weather> weatherlist=new ArrayList<Weather>();
		weatherlist.add(w3);
		weatherlist.add(w1);
		weatherlist.add(w2);
		
		Collections.sort(weatherlist, new sortusingDay());
		for(Weather wsorted:weatherlist)
		{
			System.out.println(wsorted);
		}

	}

}
