package org.literal;

public class NonLiteral {
	public static void main(String[] args) {
		String a =new String("Nisha");
		System.out.println(a);
		int id=System.identityHashCode(a);
		System.out.println(id);
		
		String b =new String("Rengan");
		System.out.println(b);
		int id1=System.identityHashCode(b);
		System.out.println(id1);
		
		String c =new String("NishaRengan");
		System.out.println(c);
		int id2=System.identityHashCode(c);
		System.out.println(id2);
		
	}
}
