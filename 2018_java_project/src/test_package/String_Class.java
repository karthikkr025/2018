package test_package;

public class String_Class {

public static void main(String[] args) {
		
		String str = "The rains have started here";
		String str1 = "The rains Have started here";
		
		System.out.println(str.length());//Length of the String
		System.out.println(str.charAt(5));
		System.out.println(str.indexOf('s'));
		
		System.out.println(str.indexOf('a'));//1st Index Position of a
		System.out.println(str.indexOf("a",str.indexOf('a')+1));
		System.out.println(str.indexOf("a",str.indexOf("a",str.indexOf('a')+1)+1));
		
		System.out.println(str.indexOf("s",9));
		System.out.println(str.indexOf("Hello"));
		System.out.println(str.indexOf("star"));
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase("The rains Have started here"));
		System.out.println(str.substring(8,16));
		System.out.println("--------------");
		
		String temp[] = str.split("a");
		System.out.println(temp.length);
		for(int i = 0;i<temp.length;i++)
		{
			System.out.println(i);
			System.out.println(temp[i]);
		}
		
		
		String x="100";
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+10);
		System.out.println(x+10);
		String z="Hello";
		int i1 = Integer.parseInt(z);
		System.out.println(i1);
		}
}
//String Class ,Integer Class