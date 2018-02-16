package test_package;

//if we have atleast one mehtod as Abstract then class also should be a abstract class
    abstract class Z {
	int i=10;
	static int j=20;
	abstract void test1();
	abstract int test2(); // A method which doesn't have body is called Abstract
	void test3() //Concrete Method 
	{
	System.out.println("Non-Static Method");
	}
	static void test4()
	{
	System.out.println("Static Method");
	}
	//You can a create a constructor in Abstract class
	Z() 
	{
		System.out.println("Constructor");
	}
}	
	public class Abstract_1
	{
		public static void main(String[] args) {
			Z.test4(); //Static methods can used with reference of Class Name 
		//	Z obj1=new Z(); //We Can't create a object for Abstract class
			System.out.println(Z.j);
		}
}
			

