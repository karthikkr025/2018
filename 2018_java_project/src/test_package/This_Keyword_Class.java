package test_package;

class C12{
	C12(){
        this(10);		
		System.out.println("Run Default Constructor of C12");
	}
	C12(int a){
		System.out.println("Run int Constructor of C12");
	}
}

public class This_Keyword_Class extends C12 {

	This_Keyword_Class(){
		this(10);
		System.out.println("No Arg Constructor of This_Keyword_Class");
	}
	This_Keyword_Class(int a){
		this(10,30.30);
		System.out.println("Int Arg Constructor of This_Keyword_Class");
	}
	This_Keyword_Class(int a,double b){
//		this(); Recursive Constructor Invocation
		System.out.println("Int & double Arg Constructor of This_Keyword_Class");
	}
	public static void main(String[] args) {
		System.out.println("program Starts");
		This_Keyword_Class obj1 = new This_Keyword_Class();
		System.out.println("Program Ends");
	}
}

//Super and this Keyword can't be used at same Constructor level