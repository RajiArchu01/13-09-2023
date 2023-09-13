package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ConvertListToTreeSet {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
		al.add(500);
		al.add(600);
		al.add(700);
		al.add(100);
		al.add(300);
		al.add(500);
		
		System.out.println(al);
		
		Set s = new TreeSet();
		s.addAll(al);
		System.out.println(s);
		
	}

}
