package org.excep;

public class Sample4 {
	// array index out of bound exception
	public static void main(String[] args) {
		int a[]= new int[2];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		System.out.println(a[2]);
		
	}

}
