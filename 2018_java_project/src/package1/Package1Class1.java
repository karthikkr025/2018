package package1;

public class Package1Class1 {
	public int i =10;
	int j =20;
	private int k =30;
	protected int l =40;
	
	public void sample1()
	{
		System.out.println("sample1 method of package1class1 - public");
	}
	void sample2()
	{
		System.out.println("sample2 method of package1class1 - default");
	}
	private void sample3()
	{
		System.out.println("sample3 method of package1class1 - private");
	}
	protected void sample4()
	{
		System.out.println("sample4 method of package1class1 - protected");
	}
	public static void main(String[] args) {
		
		Package1Class1 obj1 = new Package1Class1();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		System.out.println(obj1.l);
	    obj1.sample1();
	    obj1.sample2();
	    obj1.sample3();
	    obj1.sample4();
		}
	
}
