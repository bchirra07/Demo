package ListCollections;

import java.util.Comparator;

public class sortbyModel implements Comparator<Vehicle> {

	@Override
	public int compare(Vehicle o1, Vehicle o2) {
		int x=o1.brand.compareTo(o2.brand);
		return x;
	}

}
