package org.collections;

import java.util.ArrayList;

public class ReplaceTheValue {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("100");   
		l.add("200");
		l.add("300");
		l.add("400");
		l.add("500");   
		l.add("600");
		l.add("700");
		
	System.out.println(l);
	l.set(l.indexOf("300"), "350");
	System.out.println(l);

	}

}
