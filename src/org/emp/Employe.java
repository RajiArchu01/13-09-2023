package org.emp;

public class Employe {
	public void empId(int age) {
		System.out.println(age);
	}
	public void empId(long mobile) {
		System.out.println(mobile);
	}
	public void empId(int id,String name) {
		System.out.println(id+"\n"+name);
	}
	public void empId(String email,float mark,char grade) {
		System.out.println(email+"\n"+mark+"\n"+grade);
	}
	public static void main(String[] args) {
	Employe emp = new Employe();
	emp.empId(50);
	emp.empId(9003595686l);
	emp.empId(1234,"thamena");
	emp.empId("rajibnec@",90.89f,'A');
	
	}
	

}
