package org.emp;

public class Employ {
	public void empId(int age) {
		System.out.println("age is:"+age);
	}
	public void empId(String gender) {
		System.out.println("gender is:"+gender);
	}
	public static void main(String[] args) {
		Employ e = new Employ();
		e.empId(50);
		e.empId("Female");
		}
}
