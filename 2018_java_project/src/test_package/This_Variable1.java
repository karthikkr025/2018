package test_package;

public class This_Variable1 {

	static int i ;
	static double d;
	
	This_Variable1(int i,double d)
	{
		System.out.println("Int & double Constructor");
		i=i; // local Variable i
		d=d; // local Variable d
		System.out.println("i value in cons "+i);
		System.out.println("j value in cons "+d);
	}
	void print()
	{
		System.out.println("i Value in the Print Method "+i); // Takes Global Variable
		System.out.println("i Value in the Print Method "+d); // Takes Global Variable
	}
	public static void main(String[] args) {
		This_Variable1 obj1 = new This_Variable1(10,20.50);
		obj1.print();
		System.out.println(i);
		int i =30;
		System.out.println(i);
	}
}
