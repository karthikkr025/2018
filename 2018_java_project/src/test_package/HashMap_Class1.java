package test_package;

import java.util.HashMap;

public class HashMap_Class1 {
	public static void main(String[] args) {
		
		 HashMap<String,String> Map = new HashMap<String,String>();
		 Map.put("Firstname","Karthik");
		 Map.put("Lastname","KR");
		 Map.put("Location","Bangalore");
		 System.out.println(Map);
		 System.out.println(Map.get("Firstname"));
		 System.out.println(Map.remove("Lastname"));
		 System.out.println(Map);
		 System.out.println(Map.keySet());
		 System.out.println(Map.values());
		 }
}
