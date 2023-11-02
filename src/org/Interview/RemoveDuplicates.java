package org.Interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// Remove duplicates in array

		int a[] = new int [5];
		a[0]=10;
		a[1]=20;
		a[2]=10;
		a[3]=20;
		a[4]=30;
		for (int b:a) {
			System.out.println(b);
		}
		Set<Integer> s = new LinkedHashSet();
		for(int i=0; i<a.length;i++) {
			s.add(a[i]);
		}
		System.out.println(s);
	}

}
