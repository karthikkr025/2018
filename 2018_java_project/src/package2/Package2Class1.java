package package2;

import package1.Package1Class1;
import package1.Package1Class2;

public class Package2Class1 extends Package1Class1 {
	public static void main(String[] args) {
		//Public and protected members of other package can be used
		Package2Class1 obj1 = new Package2Class1();
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
	    System.out.println("=======================");
	    Package1Class1 obj3 = new Package2Class1();
		System.out.println(obj3.i);
		System.out.println(obj3.j);
		System.out.println(obj3.k);
		System.out.println(obj3.l);
	    obj3.sample1();
	    obj3.sample2();
	    obj3.sample3();
	    obj3.sample4();
		
	}
	


}