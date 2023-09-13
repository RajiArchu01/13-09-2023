package org.set;

import java.util.HashSet;
import java.util.Set;

public class SetEnhancedForLoop {
		public static void main(String[] args) {
			Set s = new HashSet();
			s.add(105);
			s.add(205);
			s.add(305);
			s.add(405);
			s.add(505);
			s.add(605);
			s.add(705);
			s.add(805);
			System.out.println(s);
			
		   //for each loop
		   for(Object obj:s) {
			System.out.println(obj);   
			}   
		}
	}


