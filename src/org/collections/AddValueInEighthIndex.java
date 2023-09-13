package org.collections;

import java.util.ArrayList;

public class AddValueInEighthIndex {

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
	l.add(8, "80");
	System.out.println(l);

	}

}
