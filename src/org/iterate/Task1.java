package org.iterate;

import java.util.*;

public class Task1 {
	public static void main(String[] args) {
		//Create a HashMap with the below key and values and iterate it using enhanced for loop.
        //key    : 10,20,30,40,50,60,10,50,40
        //values : java,sql,oops,Sql,oracle,DB,selenium,psql,Hadoop.

	Map m = new HashMap();
	m.put("10","java");
	m.put("20", "sql");
	m.put("30","oops");
	m.put("40", "sql");
	m.put("50", "ooracle");
	m.put("60", "DB");
	m.put("10", "seleinum");
	m.put("50", "psql");
	m.put("40", "hadoop");
	
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
