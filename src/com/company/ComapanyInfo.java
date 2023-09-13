package com.company;

public class ComapanyInfo {
	public void companyName(float acno) {
		System.out.println("ac no is:"+acno);
	}
	public void companyName(int pin) {
		System.out.println("pin num is:"+pin);
	}
	public void companyName(int id,String name) {
		System.out.println("id is :"+id+"\n"+"Name is:"+name);
	}
	public void companyName(String email,char grade) {
		System.out.println("email is :"+email+"\n"+"garde is:"+grade);
	}
	public static void main(String[] args) {
		ComapanyInfo ci = new ComapanyInfo();
	ci.companyName(55555450f);
	ci.companyName(90035);
	ci.companyName(1234,"poorni");
	ci.companyName("rajibnec@",'c');
	
	}
	

}
