package test_package;

public class Constructor_Class {
	
	int i =10;
	{
		System.out.println("NonStatic Block 1");
//We Don't need to refer the Non Static Members with help of Object name 		
		System.out.println(i);
	}
	{
		System.out.println("NonStatic Block 2");
	}
	static 
	{
		System.out.println("Static Block");
		Constructor_Class obj = new Constructor_Class();
//we can refer the Non static Members with help of Object Name			
		System.out.println(obj.i);
		System.out.println("Static Block 2");
	}
	Constructor_Class() 
	{
		System.out.println("Default Constructor");
		
	}
	Constructor_Class(int a)
	{
		int u = 100;
//We Don't need to refer the Non Static Members with help of Object name 		
		System.out.println(i);
		System.out.println(a);
		System.out.println("int Arg Constructor");
	}
	Constructor_Class(int a,double b)
	{
		System.out.println("int & Double Arg Constructor");
	}
	Constructor_Class(double a,int b)
	{
		System.out.println("int & Double Arg Constructor");
	}
public static void main(String[] args) {
	System.out.println("Program Starts");
	Constructor_Class obj = new Constructor_Class();
	System.out.println(obj.i);
	Constructor_Class obj1 = new Constructor_Class(100);
	new Constructor_Class(10,20.50);
	new Constructor_Class(20.50,10);
	}

}


//Static Block Execution will start before Main Execution 
//When ever object is created Non static blocks will be executed 