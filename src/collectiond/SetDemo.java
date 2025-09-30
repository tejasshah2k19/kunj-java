package collectiond;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(10);
		hs.add(100);
		hs.add(20);
		hs.add(-10);
		hs.add(1000);
		hs.add(100);
		System.out.println(hs);// toString()

		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.add(10);
		ts.add(100);
		ts.add(20);
		ts.add(-10);
		ts.add(1000);
		ts.add(100);
		System.out.println(ts);// toString()

		// iterator
		// forEach

		for (Integer x : hs) {
			System.out.println(x);
		}

		System.out.println("Iterator=>");
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("size =>"+hs.size());
		
	}
}


