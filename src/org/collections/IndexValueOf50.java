package org.collections;

import java.util.LinkedList;

public class IndexValueOf50 {

	public static void main(String[] args) {
		LinkedList l= new LinkedList();
		l.add("10");   
		l.add("20");
		l.add("30");
		l.add("90");
		l.add("10");   
		l.add("10");
		l.add("40");
		l.add("50");
	System.out.println(l);
	int indexOf= l.indexOf("50");
	System.out.println(indexOf);

	}

}
