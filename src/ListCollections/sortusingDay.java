package ListCollections;

import java.util.Comparator;

public class sortusingDay implements Comparator<Weather> {

	

	@Override
	public int compare(Weather o1, Weather o2) {
		int x=o1.day.compareTo(o2.day);
		return x;
	}

}
