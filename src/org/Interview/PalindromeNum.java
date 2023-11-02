package org.Interview;

public class PalindromeNum {

	public static void main(String[] args) {

		int num = 12021, r = 0, rem, temp;
		temp = num;
		while (temp != 0)
		{
			rem = temp % 10;
			r = r * 10 + rem;
			temp /= 10;
		}
		System.out.println (num);
		String str = "Radar", reverseStr = "";
		int strLength = str.length();
		for (int i = (strLength - 1); i >=0; --i) {
			reverseStr = reverseStr + str.charAt(i);
		}

		if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
			System.out.println(str + " is a Palindrome String.");
		}
		else {
			System.out.println(str + " is not a Palindrome String.");
		}
	}
}
