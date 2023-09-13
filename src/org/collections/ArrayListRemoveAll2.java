package org.collections;

import java.util.ArrayList;

public class ArrayListRemoveAll2 {
	public static void main(String[] args) {
		ArrayList l1= new ArrayList();
		l1.add("10");   
		l1.add("20");
		l1.add("30");
		l1.add("40");
		l1.add("50");   
		l1.add("60");
		l1.add("70");
		l1.add("80");
		
		ArrayList l2= new ArrayList();
		l2.add("100");
		l2.add("200");
		l2.add("300");   
		l2.add("400");
		l2.add("500");
		l2.add("600");   
		l2.add("700");
		l2.add("8000");

		System.out.println(l1);
		System.out.println(l2);
		l1.removeAll(l2);
		System.out.println(l1);


}
}
