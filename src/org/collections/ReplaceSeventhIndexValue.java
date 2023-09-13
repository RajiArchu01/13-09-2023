package org.collections;

import java.util.ArrayList;

public class ReplaceSeventhIndexValue {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("10");   
		l.add("20");
		l.add("30");
		l.add("90");
		l.add("10");   
		l.add("10");
		l.add("40");
		l.add("50");
		l.add("10");

		
	System.out.println(l);
	l.set(7, "90");
	System.out.println(l);

	}
}
