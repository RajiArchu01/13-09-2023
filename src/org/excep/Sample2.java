package org.excep;

import java.util.Map;
import java.util.TreeMap;
 //null pointer exception
public class Sample2 {
	public static void main(String[] args) {
		Map m= new TreeMap();
		m.put("java", 10);
		m.put(null, 20);
		System.out.println(m);
		
		
	}

}
