package org.iterate;

import java.util.*;
public class Task4 {
public static void main(String[] args) {
	//Create a HashTable with the below key and values and iterate it using enhanced for loop.
    //Key    : vel,Ganesh,Dinesh,Vengat,subash
    //Values : Selenium,framework,oracle,corejava,jira
        
	Map m = new Hashtable();

	m.put("vel","selenium");
	m.put("Ganesh","framework");
	m.put("Dinesh","oracle");
	m.put("Vengat","corejava");
	m.put("subash","jira");

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
