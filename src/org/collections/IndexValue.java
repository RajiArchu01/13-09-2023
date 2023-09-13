package org.collections;

import java.util.LinkedList;

public class IndexValue {
	public static void main(String[] args) {
		
	LinkedList l= new LinkedList();
	l.add(10);   
	l.add(20);
	l.add(30);
	l.add(90);
	l.add(10);
	l.add(10);
	l.add(40);
	l.add(50);
	l.add(10);
	for(int i=0; i<l.size(); i++)
	{
		
	//LinkedList object;
	//if( Object l.get(i)==10)
	{
	System.out.println(l.indexOf(l) );
	}
	}

	
//System.out.println(l);
//int ind = l.indexOf(10);
//int lind = l.lastIndexOf(10);
//System.out.println(ind);
//System.out.println(lind);
	}

}