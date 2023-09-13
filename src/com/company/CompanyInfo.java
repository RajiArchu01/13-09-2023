package com.company;

public class CompanyInfo {
	
	public void companyName(int age) {
		System.out.println("age is:"+age);
	}
	public void companyName(int pin,int acno) {
		System.out.println("pin is:"+pin+"\n"+"acno is:"+acno);
	}
	
	public static void main(String[] args) {
		CompanyInfo ci = new CompanyInfo();
		ci.companyName(50);
		ci.companyName(656659,6865565);

		}
}

