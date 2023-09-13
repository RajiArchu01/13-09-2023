package org.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class ConvertListToLinkedHashSet {
	public static void main(String[] args) {
		List al = new ArrayList();
		al.add(105);
		al.add(205);
		al.add(305);
		al.add(405);
		al.add(505);
		al.add(605);
		al.add(705);
		al.add(805);
		al.add(505);
		al.add(605);
		
		System.out.println(al);
		
		Set s = new LinkedHashSet();
		s.addAll(al);
		System.out.println(s);
		
	}

}
