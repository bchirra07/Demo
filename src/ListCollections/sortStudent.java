package ListCollections;

import java.util.Comparator;

public class sortStudent implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		int x=o1.name.compareTo(o2.name);
		return x;
	}

}
