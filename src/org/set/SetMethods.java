package org.set;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
		public static void main(String[] args) {
			Set s = new HashSet();
			s.add("jack");
			s.add(7066595);
			s.add(true);
			s.add('r');
			s.add(50);
			System.out.println(s);
			
		   int size = s.size();
		   System.out.println(size);
		   
		   boolean addAll= s.addAll(s);
		   System.out.println(addAll);
		   
		   Set s1 = new HashSet();
			s1.add("jack");
			s1.add(7066595);
			s1.add(false);
		   
		   s.retainAll(s1);
		   System.out.println(s);
		   
		   s.removeAll(s);
		   System.out.println(s);
		   
		   //for each loop
		   for(Object obj:s1) {
			System.out.println(obj);   }
		   
		   s1.remove("jack");
		   System.out.println(s1);
		   
		   s1.clear();
		   System.out.println(s1);
		   
		   
		  
		   
		  
			
		}

	}


