package org.set;

import java.util.TreeSet;
import java.util.Set;

public class TreeSetRemoveAll {
		public static void main(String[] args) {
			Set s = new TreeSet();
			s.add(10);
			s.add(20);
			s.add(30);
			s.add(40);
			s.add(50);
			s.add(60);
			s.add(70);
			s.add(80);
			
			System.out.println(s);
			
			Set s1 = new TreeSet();
			s1.add(100);
			s1.add(200);
			s1.add(300);
			s1.add(400);
			s1.add(500);
			s1.add(600);
			s1.add(700);
			s1.add(8000);
			System.out.println(s1);   

		    s.removeAll(s1);
			System.out.println(s);   
			
		}
	}


