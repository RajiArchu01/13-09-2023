package org.Interview;

public class ReverseTheNum {

	public static void main(String[] args) {
int no=123;
int rev=0;
while(no>0) {
	int n=no%10;
	rev=(rev*10)+n;
	no=no/10;
}
System.out.println(rev);
	}

}
