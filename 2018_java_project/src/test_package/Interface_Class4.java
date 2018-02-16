package test_package;

interface idemo5{
	void test1();
}
interface idemo6{
	void test2();
}
//For multiple inheritance we use , separator
abstract class cdemo1 implements idemo5,idemo6{
	public void test1(){
		System.out.println("test1() implemented in cdemo1");
	}
	public void test3()
	{
		System.out.println("test3() implemented in cdemo1");
	}
}
class cdemo2 extends cdemo1 implements idemo5,idemo6{
 public void test2() {
	System.out.println("test2() implemented in cdemo2");
	}
 public void test3(){
	 System.out.println("test3() implemented in cdemo2"); 
 }
 
	
}
public class Interface_Class4 {
	public static void main(String[] args) {
		System.out.println("Program Starts");
	//	cdemo1 c1 = new cdemo1(); // Objects can't be created to Abstract Class
//		c1.test1();
//		c1.test2();
		System.out.println("Program Ends");
	//	idemo6 c2 = new cdemo1();
	//	c2.test2();
		cdemo1 c3 = new cdemo2();
		c3.test1();
		c3.test2();
		c3.test3();
		idemo6 c4 = new cdemo2();
		c4.test2();
		idemo5 c5 = new cdemo2();
		c5.test1();
		
	}

}
