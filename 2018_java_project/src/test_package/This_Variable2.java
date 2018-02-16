package test_package;

public class This_Variable2 {
	
	int i ;
	static double d;
	
	This_Variable2(int i,double d)
	{
		System.out.println("Int & double Constructor");
		this.i=i; // Global i =local Variable i
		this.d=d; // global i =local Variable d
		System.out.println("i value in cons "+i);
		System.out.println("d value in cons "+d);
	}
	void print()
	{
		System.out.println("i= "+i); // Takes Global Variable
		System.out.println("d= "+d); // Takes Global Variable
	}
	public static void main(String[] args) {
		This_Variable2 obj1 = new This_Variable2(10,20.50);
		obj1.print();
		System.out.println(obj1.i);
		int i =30;
		System.out.println(i);
	}

}

//Using this Keyword you can access both Static and Non-Static Variable 
//Global variable of the Local Class 
