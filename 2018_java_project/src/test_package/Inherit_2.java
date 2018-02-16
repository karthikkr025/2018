package test_package;

class I
	{
	public int i =20;
	public static int k =40;
	public static void sample123()
	{
		System.out.println("Sample123 Method of I");
	}
	public void sample()
    {
    	System.out.println("Sample Method of I");
    }}
	class J  extends I{
		public int j =30;
		public void sample1()
		{
			System.out.println("Sample method of J");
			System.out.println(J.k);
		}
	}
	public class Inherit_2 {
		public static void main(String[] args) {
			
			System.out.println("K="+I.k);
			I.sample123();
			I obj1 =new I();
			System.out.println("i="+obj1.i);
			obj1.sample();
			J obj2 = new J();
			obj2.sample1();
			obj2.sample();
			obj2.sample123();
			System.out.println("i="+obj2.i);
			System.out.println("j="+obj2.j);
			System.out.println("k="+obj2.k);
//Creating an Object to subclass with Reference to Parent class 
//Will Load only the Members of parent Class			
			I obj3 = new J();
		//	obj3.sample1();//We can't access the J Class Members
			obj3.sample();
			obj3.sample123();
			System.out.println("i="+obj3.i);
		//	System.out.println("j="+obj3.j); We can't access the J Class Members
			System.out.println("k="+obj3.k);
		}
	

}
