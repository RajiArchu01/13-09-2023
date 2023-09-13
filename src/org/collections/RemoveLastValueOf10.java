package org.collections;

import java.util.ArrayList;

public class RemoveLastValueOf10 {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("10");   
		l.add("20");
		l.add("30");
		l.add("90");
		l.add("10");   
		l.add("10");
		l.add("40");

		
	System.out.println(l);
	l.remove(l.lastIndexOf("10"));
	System.out.println(l);

	}

}
