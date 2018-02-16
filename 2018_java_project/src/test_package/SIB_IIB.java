package test_package;

//All your static will be initialized in SIB .But you Can't declare a Variable in SIB
//SIB will be called Automatically before Executing your Main Method
//IIB will be called Only when we create an object 
//When we assign a value to static member anywhere ,that will be assigned to static pool
//When we assign a value to Non -static member ,that will be local for that Object alone 
//When we assign a value to Non -static member in IIB  , you don't need to create an object ,automatically that will 
//be assigned to default level
public class SIB_IIB {
	    int i=100;
		static int j;
		int m;
//Static Block		
		static{
			int k = 40;
			System.out.println(j);
			SIB_IIB obj1 = new SIB_IIB();
			System.out.println(obj1.i);
			int l=30;
			j=20;
			System.out.println(j);
			System.out.println("Static Block 1");
		}
		static{
			int t = 10;
			SIB_IIB obj1 = new SIB_IIB();
			System.out.println(obj1.i);
			System.out.println(j);
			j=40;
			System.out.println(j);
			System.out.println("Static Block 3");
		}
		static{
			System.out.println("Static Block 2");
		}
//Non - Static Block		
		{
			System.out.println("NonStatic Block 1");
			i=200;
			System.out.println(i);
			m=40; //Without creating an Object we can Use Non-Static Member in IIB
			System.out.println("m "+m);
			j=30;
		}
		
		{
			System.out.println(i);
			int t=10;
			System.out.println("m "+m);
			System.out.println("NonStatic Block 2");
		}
		
		static void sample()
		{
			System.out.println("Sample Method");
		}
		
		void sample1()
		{
			System.out.println("Sample1 Method");
	 		SIB_IIB obj2 = new SIB_IIB();
	//		obj2.sample1();

		}
		
		public static void main(String[] args)
		{
			System.out.println("Main Method");
			System.out.println(j);
			int j =70;
			System.out.println(j);
			SIB_IIB.sample();
			System.out.println(SIB_IIB.j);
			SIB_IIB obj1 = new SIB_IIB();
			System.out.println("=======obj1.m  "+obj1.m);
			obj1.j=25;
			System.out.println("obj1.j "+obj1.j);
			System.out.println("j "+j);
			System.out.println("SIB_IIB.j "+SIB_IIB.j);
			System.out.println("------");
			SIB_IIB Obj2 = new SIB_IIB();
			obj1.sample1();
		}
	}


//When Ever Object is created All the Global Members will be loaded 
//and Static Block will be Executed 




