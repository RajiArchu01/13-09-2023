package org.collections;

import java.util.ArrayList;

public class AddValueInTenthIndex {

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

		
	System.out.println(l);
	l.add(10, "100");
	System.out.println(l);

	}

}
