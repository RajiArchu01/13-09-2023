package org.staticnonstatic;

public class Task2 {

	//same class
		//Access non-static method into non-static method---direct access
		//iam not using the instance variables
	private void m1(int id) {
		System.out.println(id);
	}
	
	private void m2(int name) {
		System.out.println(name);
	}
	public static void main(String[]args) {
		Task2 t= new Task2();
		t.m1(20);
		t.m2(30);	
	
	
	}	

}
