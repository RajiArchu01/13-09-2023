package org.collections;

import java.util.ArrayList;

public class ListForLoop {

	public static void main(String[] args) {
		ArrayList l= new ArrayList();
		l.add("105");   
		l.add("205");
		l.add("305");
		l.add("405");
		l.add("505");   
		l.add("605");
		l.add("705");
		l.add("805");
		
	System.out.println(l);
	for(int i=0; i< l.size();i++) {
		System.out.println(l.get(i));

	}

	}

}
