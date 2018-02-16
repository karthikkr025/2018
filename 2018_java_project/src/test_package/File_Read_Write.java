package test_package;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class File_Read_Write {
	
	public static void main(String[] args) throws IOException {
		
		//Create New File
		File f = new File("C:\\Users\\KarthikRaghupathy\\Desktop\\Sample.txt");
		f.createNewFile();
		System.out.println("File created");
		
		//Write on the file
		FileWriter writer = new FileWriter("C:\\Users\\KarthikRaghupathy\\Desktop\\Sample.txt");
		BufferedWriter out =new BufferedWriter(writer);
		out.write("Hello is writing");
		out.newLine(); //Move to Next line
		out.write("this is new line");
		out.flush();
		out.close();
		writer.close();
		
		//Read from File
		FileReader reader = new FileReader("C:\\Users\\KarthikRaghupathy\\Desktop\\Sample.txt");
		BufferedReader bfr = new BufferedReader(reader);
		System.out.println(bfr.read());
		System.out.println(bfr.read());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		System.out.println(bfr.readLine());
		
		//using a loop to read  a line
		String x ="";
		while ((x = bfr.readLine())!= null)
		{
			System.out.println(x);
		}
		System.out.println("file read");
		
	}

}
