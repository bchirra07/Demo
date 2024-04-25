package ListCollections;

import java.util.Comparator;

public class sortPrice implements Comparator<Ecommerce> {

	@Override
	public int compare(Ecommerce o1, Ecommerce o2) {
	  int sort=o1.price-o2.price;
		return sort;
	}

}
