package org.Interview;

public class PrintOnlyNumString {

	public static void main(String[] args) {
		String s = "abc123";
		String s1="";
		for(int i=0; i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch>'0' && ch<'9') {
				s1 = s1+ch;
			}
			System.out.println(s1);

		}
	}
}
