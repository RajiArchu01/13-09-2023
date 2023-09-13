package org.Interview;

public class CheckPalindrome {

	public static void main(String[] args) {
//int no=123;
int no=12321;
int temp=no;  //123
int rev=0;
while(no>0) {
	int n=no%10;
	rev=(rev*10)+n;
	no=no/10;
}
if(temp==rev) {
System.out.println("palindrome");
}
else {
	System.out.println("not palindrome");
}		
}
}
