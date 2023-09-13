package org.literal;

public class Literal {
	public static void main(String[] args) {
		String a = "Nisha";
		String b = "Rengan";
		String c = "NishaRengan";
		
		System.out.println(a);
		int id=System.identityHashCode(a);
		System.out.println(id);
		
		System.out.println(b);
		int id1=System.identityHashCode(b);
		System.out.println(id1);	
		
		System.out.println(c);
		int id2=System.identityHashCode(c);
		System.out.println(id2);		
	
	}
}
