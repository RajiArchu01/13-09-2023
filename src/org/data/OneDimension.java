package org.data;

public class OneDimension {
	public static void main(String[] args) {
		int b[]= new int [91];
		int j = 100;
		for (int i=0; i<=90;i++) {
			b[i]=j;	
			j--;
		}

		for (int array:b) {
		    System.out.print(array+" ");		
		}
		

	}

}
