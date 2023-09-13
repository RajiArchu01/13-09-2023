package org.map;

import java.util.*;

public class Task4 {
	public static void main(String[] args) {
		//Create a HashTable with the below key and values and get(print) the key only in the map.
		//Key    : vel,Ganesh,Dinesh,Vengat,subash
		//Values : Selenium,framework,oracle,corejava,jira

		Map m = new Hashtable();

		m.put("vel","selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("Vengat","corejava");
		m.put("subash","jira");

		System.out.println(m);

		Collection Values =m.values();
		System.out.println(Values);






	}

}
