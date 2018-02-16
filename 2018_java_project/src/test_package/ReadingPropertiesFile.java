package test_package;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingPropertiesFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println(System.getProperty("user.dir"));
		Properties prop = new Properties();
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+"\\src\\test_package\\propertyfile.properties");
		prop.load(ip);
		System.out.println(prop.getProperty("Name"));
		System.out.println(prop.getProperty("Class"));
		}
}
