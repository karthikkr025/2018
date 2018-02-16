package package2;

import package1.Package1Class1;

public class Package2Class2 {
	
	public static void main(String[] args) {
		
		Package2Class2 obj1 = new Package2Class2();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		System.out.println(obj1.l);
	    obj1.sample1();
	    obj1.sample2();
	    obj1.sample3();
	    obj1.sample4();
	    System.out.println("=======================");
	    //only public members of other package can be used 
	    Package1Class1 obj2 = new Package1Class1();
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		System.out.println(obj2.k);
		System.out.println(obj2.l);
	    obj2.sample1();
	    obj2.sample2();
	    obj2.sample3();
	    obj2.sample4();
		
	}

}
