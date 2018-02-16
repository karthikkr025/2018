package test_package;
//Multi level inheritemnce
class A{
	public int i =20;
	public static int k = 40;
	public static void sample123()
	{
		System.out.println("sample123 method of A");
	}
	public void sample()
	{
		System.out.println("sample method of A");
	}
}
//sub class & super Class
class B extends  A{
	public static int k=50;
	public int i =50;
	public int j =30;
	public void sample()
	{
		System.out.println("Sample Method of B");
	}
	public void sample1()
	{
		B.k=60;
		System.out.println("Sample1 Method of B");
		System.out.println("(((((())))");
		System.out.println(B.k);
		System.out.println(A.k);
	}
	
	public static void sample123()
	{
		System.out.println("sample123 method of B");
	}
}

public class Inherit_1
{
	public static void main(String[] args) {
		System.out.println("A.k==> "+A.k);
		A.sample123();
		A obj1 = new A();
		System.out.println("i="+obj1.i);
		obj1.sample();
		B obj2 = new B();
		System.out.println("B.k==> "+B.k);
		obj2.k =70;
		System.out.println("obj2.k=> "+obj2.k);
		System.out.println("B.k=> "+B.k);
		System.out.println("A.k=> "+A.k);
		System.out.println("obj1.k=> "+obj1.k);
		obj2.sample1();
		obj2.sample();
		obj2.sample123();
		B.sample123();
		System.out.println(B.k);
		obj2.i=35;
		System.out.println("$$$$$$$$");
		System.out.println("i="+obj1.i);
		System.out.println("i="+obj2.i);
		System.out.println("j="+obj2.j);
		System.out.println("k="+obj2.k);
		System.out.println("=============");
		
		
// creating a Object to B Class & Referring A Class 
//will load only the members of Parent Class
// Only the Non- Static Method will Take it will take the child Information		
		A obj3 = new B();
		System.out.println(obj3.i);
		System.out.println(obj3.k);
		obj3.sample123();
		obj3.sample();
		
		}
}
