package test_package;

import java.util.ArrayList;

public class Array_List_Class2 {
	public static void main(String[] args) {
		
//		String str[][] = new String [2][3];
//		String str1[] =new String[3];
//		Object arr[][] = new Object[2][3];
		
		
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		System.out.println(list.get(2));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
	}

}
