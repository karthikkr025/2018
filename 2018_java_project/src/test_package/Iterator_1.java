package test_package;
//iterator is a pointer which moves Forward but not backward
import java.util.HashSet;
import java.util.Iterator;

public class Iterator_1 {
	
	public static void main(String[] args) {
		
		HashSet set1 =new HashSet();
		set1.add("A");
		set1.add(10);
		set1.add(null);
		set1.add(95.51);
		System.out.println(set1);
		System.out.println(set1.size());
		//Can't Create an Object to the Interface
		Iterator itr = set1.iterator();
		System.out.println(itr.next());
		System.out.println(itr.next());
		while(itr.hasNext()){    //checks for Next Memory location
			System.out.println(itr.next());
		}
		System.out.println(set1.size());
		
		
}

}
