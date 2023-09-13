package org.map;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Task10 {
	public static void main(String[] args) {
		//Create a TreeHashMap with the below key and values and iterate it using enhanced for loop and get the key and values combination.
        //key    : !,@,#,$,%,^,&,*,(,
        //Values : 10,20,30,40,50,60,10,50,409
		
		Map m = new TreeMap();
		m.put(10,"!");
		m.put(20,"@");
		m.put(30,"#");
		m.put(40,"$");
		m.put(50,"%");
		m.put(60,"^");
		m.put(10,"&");
		m.put(50,"*");
		m.put(409,"(");
		
		System.out.println(m);
		 Set<Entry<Integer, String>>Entryset=m.entrySet();
				 
				 for(Entry<Integer, String> x:Entryset){
				System.out.println(x);
			
				Integer key = x.getKey();
				System.out.println(key);
				
				String value = x.getValue();
				System.out.println(value);
			}	
			}

}
