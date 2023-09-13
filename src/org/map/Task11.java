package org.map;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Task11 {
	public static void main(String[] args) {
		//Create a HashTable with the below key and values and iterate it using enhanced for loop and get the key and values combination.
        //Key    : vel,Ganesh,Dinesh,Vengat,subash
        //Values : Selenium,framework,oracle,corejava,jira

		
		Map m = new Hashtable();

		m.put("vel","selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("Vengat","corejava");
		m.put("subash","jira");

		System.out.println(m);
		 Set<Entry<String, String>>Entryset=m.entrySet();
		 
		 for(Entry<String, String> x:Entryset){
		System.out.println(x);
	
		String key = x.getKey();
		System.out.println(key);
		
		String value = x.getValue();
		System.out.println(value);
	}	
	}

}
