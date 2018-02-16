package test_package;

public class Test_Class1 {
	
	// Global Variable 
	
		static int i= 10; // Static global Variable 
		int j =20; // Non-static  global Variable 
		
	  public static void main(String[] args) 
		{
		 
		  int a = 30; // Local Variable  Initialization
		  a=40; // Re-initialization
		
		  System.out.println(i);//Access Static Global Variable with variable name
		  System.out.println(Test_Class1.i); // Access Static Global Variable with reference to Class name

		  
	//System.out.println(object.i);
	// Can't Access Global static variable with Reference to object name 
		  
		  
		      Test_Class1 object = new Test_Class1();
		      System.out.println(object.j); // Access Non static global variable with reference to object name

	// System.out.println(Test_Class1.j); 
	//Can't Access Non-Static Global Variable with reference to Class name
		      
		      
		      System.out.println(a); // Access Local variable with Variable Name directly 
	//System.out.println(object.a);
	//Can't Access local variable with Reference to object       
		  
		  
			System.out.println("Test Java Program"); 
			System.out.print("Print the Statement");
			System.out.println("in the Same line");
			System.out.println("Java" + "test"); 
			
			
		}

}
