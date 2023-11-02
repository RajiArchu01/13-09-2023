package org.Interview;

public class Try {

	public static void main(String[] args) {
		String str= "Ajay";
		String out = "";
		for (int i = str.length()-1; i>=0; i--) {
			char c = str.charAt(i);
			out=out+c;
		}
		System.out.print(out);
	}
	}