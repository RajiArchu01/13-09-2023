package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToSet {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(90);
		al.add(10);
		al.add(10);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		
		Set s = new HashSet();
		s.addAll(al);
		System.out.println(s);
		
	}

}
