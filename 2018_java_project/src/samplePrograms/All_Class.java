package samplePrograms;

import java.util.HashMap;

public class All_Class {
	
	static int sv =10;
	int nsv = 20;
	
	static int sm(){
//		System.out.println("static method");
		return 10;
	}
	int nsm(){
//		System.out.println("Non-static method");
		return 20;
	}
	void vm(){
//		System.out.println("void method");
	}
	static int sm(int smo){
//		System.out.println("method overloading");
		return 100;
	}
	
	public static void main(String[] args) {
		
	int lv  =30;
	
	System.out.println("static variable access by name ="+sv);
	System.out.println("static variable access by classname ="+All_Class.sv);
	
	All_Class obj1 = new All_Class();
    System.out.println("Non static variable access by object ="+obj1.nsv);
    
	System.out.println("Local variable access by name ="+lv);
	
	System.out.println("static method called by name ="+sm());
	System.out.println("static method called by classname ="+All_Class.sm());
	
	System.out.println("Non-static method called by object ="+obj1.nsm());
	
	sm(200);
	System.out.println("method overloading ="+sm(200));
	

	HashMap<String,String> map = new HashMap<String,String>();
	map.put("a","b");
	map.get("a");

	
	
	
	

	}

}