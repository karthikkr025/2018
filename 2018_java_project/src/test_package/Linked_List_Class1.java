package test_package;

import java.util.LinkedList;

public class Linked_List_Class1 {
	
public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.add("A"); // Store Data in the Memory Location
		list.add(1234);
		list.add(12.50);
		list.add(null);
		list.add(true);
		list.add(1234);

		System.out.println(list);
		System.out.println("===============");
		System.out.println(list.get(2));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(list.size());
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.indexOf(null));
		System.out.println(list.removeFirst());
		System.out.println(list);
		
    }
}

