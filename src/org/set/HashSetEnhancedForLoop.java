package org.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEnhancedForLoop {
		public static void main(String[] args) {
			Set s = new HashSet();
			s.add(10);
			s.add(20);
			s.add(30);
			s.add(40);
			s.add(50);
			s.add(60);
			s.add(70);
			s.add(80);
			s.add(90);
			s.add(10);
			s.add(20);
			System.out.println(s);
			
		   //for each loop
		   for(Object obj:s) {
			System.out.println(obj);   
			}   
		}
	}


