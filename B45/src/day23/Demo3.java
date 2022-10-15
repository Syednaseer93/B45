package day23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class Demo3 {

	public static void main(String[] args) {
	LinkedHashMap<String, Integer> Fee=new LinkedHashMap<String, Integer>();
	Fee.put("Java",10000);
	Fee.put("Selenium",11000);
	Fee.put("Java Selenium",15000);
	Fee.put("API",10000);
	
		
	for(String key:Fee.keySet()) {
		Integer v=Fee.get(key);
		System.out.println(key+":"+v);
	}
	
	
	boolean result = Fee.containsKey("Java");
	System.out.println(result);//true
	
	result = Fee.containsKey("Python");
	System.out.println(result);//false
	
	result = Fee.containsValue(15000);
	System.out.println(result);//true
	
	result = Fee.containsValue(0);
	System.out.println(result);//false
	}

}
