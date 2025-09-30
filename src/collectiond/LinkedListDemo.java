package collectiond;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.get(0));
		list.remove(0);
		System.out.println(list);
	
		list.addFirst(10);//not in ArrayList 
		list.addLast(500);//not in ArrayList 

		System.out.println(list);
		list.add(0,11);//shift
		list.set(0, 12);//overwrite 
		
		//memory allocation
		
		//ArrayList  :[10,20,30,      ] //50% 100% => 100+50 => allocate 
		//LinkedList :[10,20,30]
		
	}
}
