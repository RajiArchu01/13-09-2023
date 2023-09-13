package com.map;

import java.util.*;

public class Task2 {
	public static void main(String[] args) {
		//Create a LinkedHashMap with the below key and values and get(print) the key only in the map.
        //key    : 10,20,30,40,50,60,10,50,40
        //Values : 10,20,30,40,50,60,10,50,40

	HashMap m = new HashMap();
		
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		
		System.out.println(m);
		
		Set keyset = m.keySet();
		System.out.println(keyset);

	}

}


