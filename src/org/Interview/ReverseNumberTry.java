package org.Interview;

public class ReverseNumberTry {

	public static void main(String[] args) {
     
	    int num = 12321, r = 0,a=num;
	    System.out.println(num);
	    while(num != 0) {
	      int d = num % 10;
	      r = r * 10 + d;
	      num /= 10;
	    }
	    System.out.println(r);
	    if (a==r) {
			System.out.println(r+" :is Palindrome");
		}else {
			System.out.println(r+" :is not Palindrome");
		}
	  }
	}

