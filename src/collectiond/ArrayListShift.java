package collectiond;

import java.util.ArrayList;

public class ArrayListShift {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);

		// 10 11 12 13 14
		// 14 10 11 12 13

		System.out.println(list);
		shift(list, 2);
		System.out.println(list);
	}

	static void shift(ArrayList<Integer> list, int k) {
		for (int i = 1; i <= k; i++) {
			list.add(0, list.get(list.size() - 1));
			list.remove(list.size() - 1);
		}
	}
}
