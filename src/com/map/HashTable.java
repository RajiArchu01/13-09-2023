package com.map;

import java.util.*;

public class HashTable {
	public static void main(String[] args) {
		//Description : Create a HashTable with the below key and values
        //Key    : vel,Ganesh,Dinesh,Vengat,subash
        //Values : Selenium,framework,oracle,corejava,jira

		Map m = new Hashtable();
		m.put("vel","selenium");
		m.put("ganesh", "framework");
		m.put("dinesh","oracle");
		m.put("vengat", "corejava");
		m.put("subash", "jira");
		
		System.out.println(m);
			
	}

}
