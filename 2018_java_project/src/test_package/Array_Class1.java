package test_package;

public class Array_Class1 {

	int i =20;
	public static void main(String[] args) {
		String str[] = new String[5];
		str[0] ="STL";
		str[1] ="is";
		str[2] ="a";
		str[3] ="institute";
		str[4] ="in";
		str[4] ="Ejipura";
//		str[5]="bang"; index out of bound Exception
		
		System.out.println(str.length);
		System.out.print(str[0] +" ");
		System.out.print(str[1] +" ");
		System.out.print(str[2] +" ");
		System.out.print(str[3] +" ");
		System.out.println(str[4] +" ");
		
		for(int i =0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}
		
	}
}
