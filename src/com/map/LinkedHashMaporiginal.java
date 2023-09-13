package com.map;

import java.util.HashMap;
import java.util.Map;

public class LinkedHashMaporiginal {
	public static void main(String[] args) {
		
		// Create a LinkedHashMap with the below key and values
         //key    : 10,20,30,40,50,60,10,50,40
         //Values : 10,20,30,40,50,60,10,50,40
		
		Map m = new HashMap();
		m.put(10,10);
		m.put(20, 20);
		m.put(30, 30);
		m.put(40, 40);
		m.put(50, 50);
		m.put(60, 60);
		m.put(10, 10);
		m.put(50, 50);
		m.put(40, 40);
		
		System.out.println(m);
		
		

	}

}
