package day23;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
/*1. in Map values are stored under key instead of index
 *2. Key should be unique and case sensitive
 *3. value can be duplicate or null 
 *4. if we try to store multiple value using same key , we get latest value
 *5. only one null is allowed as key
 *
 */
public class Demo1 {

	public static void main(String[] args) {
	LinkedHashMap<String, String> m=new LinkedHashMap<String, String>();
	m.put("Name","Bhanu");
	m.put("Ph","9481787493");
	m.put("Ph","9845098450");
	m.put(null,"123");
	System.out.println(m);
	
	Set<String> allKeys = m.keySet();
	for(String key:allKeys) {
		System.out.println(key);//Name Ph null
	}
	
	for(String key:allKeys) {
		String v=m.get(key);
		System.out.println(v);//Bhanu 9845098450 123
	}
	
	}

}
