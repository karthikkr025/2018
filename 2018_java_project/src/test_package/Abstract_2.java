package test_package;

abstract class X {
	
	void test1()
	{
	System.out.println("Test1 Method");
	}
	abstract int test2();
	void test4()
	{
		
	}
	 static void test3()
	 {
	System.out.println("Static Method of Abstract X");
	}
}

	
	public class Abstract_2
	{
		public static void main(String[] args) {
			System.out.println("Program Starts");
			X.test3(); //Static methods can used with reference of Class Name 
			System.out.println("Program Ends");
			
		}
}

