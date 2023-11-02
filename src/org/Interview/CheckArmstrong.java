package org.Interview;

public class CheckArmstrong {

	public static void main(String[] args) {
		int no=153;
		int temp=no;
		int arm=0;
		while(no>0) {
			int n=no%10;
			arm=arm+(n*n*n);
			no=no/10;
		}
		if(temp==arm) {
			System.out.println("armno");
		}
		else {
			System.out.println("not arm no");
		}
	}
}
