package org.iterate;
import java.util.*;
public class Task3 {
	public static void main(String[] args) {
		//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop.
        //key    : !,@,#,$,%,^,&,*,(,
        //Values : 10,20,30,40,50,60,10,50,409
		
		Map m = new TreeMap();

		m.put("!","10");
		m.put("@","20");
		m.put("#","30");
		m.put("$","40");
		m.put("%","50");
		m.put("^","60");
		m.put("&","10");
		m.put("*","50");
		m.put("(","409");
		
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


