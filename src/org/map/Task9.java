package org.map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task9{
	public static void main(String[] args) {
		//Create a LinkedHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination..
        //key    : 10,20,30,40,50,60,10,50,40
        //Values : 10,20,30,40,50,60,10,50,40
		

		Map m = new LinkedHashMap();
		m.put(10,"10");
		m.put(20, "20");
		m.put(30, "30");
		m.put(40, "40");
		m.put(50, "50");
		m.put(60, "60");
		m.put(10, "10");
		m.put(50, "50");
		m.put(40, "40");
		
		System.out.println(m);
 Set<Entry<Integer, String>>Entryset=m.entrySet();
		 
		 for(Entry <Integer,String> x:Entryset){
		System.out.println(x);
	
		Integer key = x.getKey();
		System.out.println(key);
		
		String value = x.getValue();
		System.out.println(value);
	}	
	}
}
