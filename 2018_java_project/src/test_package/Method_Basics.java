package test_package;

public class Method_Basics {
	
	public static void main(String[] args) 
	{
		System.out.println("This is Program for Method Basics");
		method2(); // Access/Call Static Method with Method name
		System.out.println(method2());
		Method_Basics.method3();// Access/Call Static Method with reference to Class name
	    Method_Basics obj1 = new Method_Basics();
		obj1.method4();//Access/Call Non-static Method with reference to object name
    	System.out.println(method2());
		System.out.println(Method_Basics.method3());
		System.out.println(obj1.method4());
    	int i = obj1.method4();
		System.out.println(i);
		method2(30);
		System.out.println(method3(true));
//Concatenation
		System.out.println("Example "+"for "+"Concatenation");
		
}
		
static void method1()
	{
		System.out.println("This is an Example for Void Mehtod ");
		}
	
	static int method2()
	{
		System.out.println("This is an Example for Return type int Method");
		return 0;
	}
	
	static boolean method3()
	{
		System.out.println("This is an Example for Return type Boolean Method ");
		return false;
	}
	
	int method4()
	{
		System.out.println("This is an Example for Non-Static Method");
		return 10;
	}
	
// Method Overloading Arguments 
// Garbage Collector 	
	
	static int method2(int a){
		
		System.out.println("Passing Function");
		return 0;
	}
	static boolean method3(boolean b){
		
		System.out.println("This is an Example for Method Overloading boolean Method");
		return false;
		
	}

}
