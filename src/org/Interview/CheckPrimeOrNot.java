package org.Interview;

public class CheckPrimeOrNot {

	public static void main(String[] args) {
		int no = 7;
		int count = 0;
		for(int i=2; i<no; i++) {
			if(no%i==0) {
				count++;
				break;
			}
		}
		if(count>0) {
			System.out.println("isPrimeNo");
		}
		else {
			System.out.println("PrimeNo");
		}
	}
}
