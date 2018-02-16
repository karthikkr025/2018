package test_package;

public class Post_Pre_Increment_Decrement {
	
	public static void main(String[] args) {
		//Post-Increment	
			int i=1;
			int j=2;
			i=i++;
			{
				System.out.println(i++);
			System.out.println("the value of i="+i);
			System.out.println("the value of j="+j);
			}
		//Post-decrement	
			int a=1;
			int b=2;
			a=a--;
			{
			System.out.println("the value of a="+a);
			System.out.println("the value of b="+b);
			}
		//Pre-Increment	
			int m=1;
			int n=2;
			m=++n;
			{
			System.out.println("the value of m="+m);
			System.out.println("the value of n="+n);
			}
		//Pre-decrement		
			int x=1;
			int y=2;
			x=--y;
			{
			System.out.println("the value of x="+x);
			System.out.println("the value of y="+y);
			}
		      }

}
