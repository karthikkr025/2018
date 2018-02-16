package test_package;

import java.util.Scanner;

public class Scannerclass {
	
	int j =30;
	 public static void main(String[] args) {
		
		 Scannerclass obj = new Scannerclass();
		 System.out.println(obj.j);
		 System.out.println("Enter the No");
		 Scanner obj1 = new Scanner(System.in);
		 int x = obj1.nextInt();
		 System.out.println(x);
		 if (x%2==0)
		 {
			 System.out.println("Its an Even Number");
		 }
		 else 
		 {
			 System.out.println("Its an Odd Number");
		 }
		 clone();
	}

}


//To Pass an input to the Program during Execution - Scanner Class 
//nextint() This method returns the int scanned from the input
//System.in is an InputStream which is typically connected to keyboard input of console programs. 	
