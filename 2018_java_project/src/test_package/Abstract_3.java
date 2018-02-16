package test_package;

abstract class M
{
	M()
	{
		System.out.println("hello Constructor");
	}
	abstract void test1();
	abstract void test2();
	void test3()
		{
			System.out.println("test3 method of Abstract C");
		}
}	
abstract class N extends M{
	void test1()
	{
		System.out.println("test1 method of class D");
	}
}	
class O extends M{
	public void test1()
	  {
		System.out.println("test1 method of class E");
	   }
	 void test2()
	   {
		System.out.println("test2 method of class E");
		}
	  void test4()
	    {
			System.out.println("test4 method of class E");
		}
    }	  
public class Abstract_3{
	public static void main(String[] args) {
		
		System.out.println("program Starts");
		O obj1 = new O();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.test4();
		System.out.println("Program Ends");
	}
}

		
