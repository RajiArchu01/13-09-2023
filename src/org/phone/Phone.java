package org.phone;

public class Phone {
	public void phoneInfo(int age, String email ) {
		System.out.println(age);
		System.out.println(email);
	}
	public void phoneInfo(String email,int acno) {
		System.out.println(email);
		System.out.println(acno);
	}
	public static void main(String[] args) {
		Phone ph = new Phone();
		ph.phoneInfo(28,"rajibnec@com");
	    ph.phoneInfo("poorni@com",45461946);
	}
}
