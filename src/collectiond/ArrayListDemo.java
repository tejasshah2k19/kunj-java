package collectiond;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {

		// dynamic array
		// add -> grow
		// remove -> shrink

		// ordered => index
		// unsorted
		// duplicate

//		ArrayList list = new ArrayList();
//		ArrayList<Integer> list = new ArrayList<Integer>();
		List<Integer> list = new ArrayList<>();// 7 //non sync 
//		Vector<Integer> list = new Vector<>();// 7 -> thread , sync  

		list.add(10);
		list.add(20);
//		list.add("india");

		System.out.println(list);// toString()
		System.out.println(list.size());

		System.out.println(list.contains(3));

		// remove(0)=>remove 0th index
		// remove((Integer)0) => 0 value - element will remove
		// remove((int)0) => 0th index

		System.out.println("remove => " + list.remove(0));
		System.out.println(list);

		list.add(-5);
		list.add(50);
		System.out.println("new list => " + list);

		list.add(0, 1000);

		System.out.println("new list => " + list);
		list.set(0, 2000);
		System.out.println("new list => " + list);

//		list.addAll(list2);

//		list.addFirst(10);
//		list.addLast(10);
//		list.clear();

		System.out.println(list.get(0));// 5th index

		for (Integer x : list) {
			System.out.println(x);
		}

	}
}
