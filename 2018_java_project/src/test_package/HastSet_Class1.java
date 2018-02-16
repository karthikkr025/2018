package test_package;

import java.util.HashSet;

public class HastSet_Class1 {
	
	public static void main(String[] args) {
		
		HashSet set1 = new HashSet();
		set1.add("A"); 
		set1.add(1234);
		set1.add(12.50);
		set1.add(1234); //if we store Duplicate old data will be replaced 
		set1.add(true);
		set1.add(null);
		
		System.out.println(set1); //Not Indexed 
		System.out.println(set1.size());
		System.out.println(set1.remove("A"));
		System.out.println(set1);
		System.out.println(set1.contains("A"));
		}

}
