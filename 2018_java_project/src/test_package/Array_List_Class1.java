package test_package;

import java.util.ArrayList;

public class Array_List_Class1 {
	public static void main(String[] args) {
		
		ArrayList list = new ArrayList();
		list.add("A"); // Store Data in the Memory Location
		list.add(1234);
		list.add(12.50);
		list.add(null);
		list.add(true);
		list.add(1234);
		
		System.out.println(list);
		System.out.println(list.get(2)); //get information from ML
		System.out.println(list.size());
		System.out.println(list.contains("A"));
		System.out.println(list.contains("B"));
		System.out.println(list.remove(2));
		System.out.println(list);
		System.out.println(list.isEmpty());
		System.out.println(list.lastIndexOf(1234));
		System.out.println(list.indexOf(1234));
		System.out.println("===============");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
  }

}
