package test_package;

public class Final_Class {
	
	//Final keyword can be used for Variable - Static ,Non-Static,Local
	//Final keyword Can be used for Method & Class
	//Final variable Can't Change Value during Execution
		
		final static int a =100;
		static int i =20;
		final int j =30;
		
		public static void main(String[] args) {
			
			i = 30;
			int i =40;
			i=60;
			a=200;
			Final_Class.a =300;
			final int a= 10;
			System.out.println(Final_Class.a);
			System.out.println(a);
			a=20;
			System.out.println(a);
			Final_Class obj1 = new Final_Class();
			System.out.println(obj1.a);
			obj1.j=39;
			obj1.a=200;
			System.out.println(obj1.a);
		}
		public void sample()
		{
			System.out.println(a);
		}

}
