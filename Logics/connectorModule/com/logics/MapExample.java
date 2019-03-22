package com.logics;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String[] args) {
		
		
		Map<Employee,String> mapRef= new HashMap<Employee,String>();
		  Employee e1 = new Employee();
		  
		  e1.id=100;
		  e1.name="abc";
		  
		  Employee e2 = new Employee();
		  e2.id=100;
		  e2.name="abc";
		  
		  mapRef.put(e1,"first object");
		  mapRef.put(e2, "second object");
		  
		  for(Map.Entry<Employee,String>obj:mapRef.entrySet()) {
		  System.out.println(obj.getKey()+" "+ obj.getValue());
		  
		  }
		  
		 
		
	}

}
