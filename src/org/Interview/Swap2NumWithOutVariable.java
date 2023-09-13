package org.Interview;

public class Swap2NumWithOutVariable {

	public static void main(String[] args) {
		//swap two number without third variable

		int a=10;
		int b=20;
		
		System.out.println("Before swapping :: Value of a: "+a+" value of b :"+b);
		
		a=a+b;
		b=a-b;
		a=a-b;

		System.out.println("Before swapping :: Value of a: "+a+" value of b :"+b);
		
	}

}
