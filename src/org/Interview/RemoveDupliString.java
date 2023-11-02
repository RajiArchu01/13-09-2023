package org.Interview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDupliString {

	public static void main(String[] args) {
		String s = "java selenium";
		String s1= s.replace("" , "");
		System.out.println(s1);
		String s2 = "";
		char[]ch = s1.toCharArray();
	
		Map<Character, Integer> m = new LinkedHashMap();
		for(int i=0; i<ch.length; i++) {
			if(m.containsKey(ch[i])) {
			}
			else {
				m.put(ch[i], 1);
			}
			Set<Entry<Character, Integer>> entryset = m.entrySet();
			for(Entry<Character,Integer>entry : entryset) {
				Character key = entry.getKey();
				s2=s2+key;
				System.out.println(s2);
			}
		}
    }
}