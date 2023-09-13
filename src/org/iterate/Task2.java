package org.iterate;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task2 {
	public static void main(String[] args) {
		//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop.
        //key    : 10,20,30,40,50,60,10,50,40
        //Values : 10,20,30,40,50,60,10,50,40
		
		Map m = new HashMap();
		m.put("10","10");
		m.put("20", "20");
		m.put("30","30");
		m.put("40", "40");
		m.put("50", "50");
		m.put("60", "60");
		m.put("10", "10");
		m.put("50", "50");
		m.put("40", "40");
		
		System.out.println(m);
		System.out.println(".....................................");
		
		Set keyset = m.keySet();
		System.out.println(keyset);
		
		for(Object o : keyset) {
			System.out.println(o);
			System.out.println(".....................................");
			
		Collection Values = m.values();
		System.out.println(Values);
		
		for(Object obj : Values) {
			System.out.println(obj);
		}	
		
		}
		}
	}
