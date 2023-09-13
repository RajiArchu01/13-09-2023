package org.Interview;

public class SumOfDigit {

	public static void main(String[] args) {
int no =542;
int sum=0;
while(no>0){
	int n=no%10;
	sum= sum+n;
	no = no/10;
	System.out.println(sum);
	
}
	}

}
