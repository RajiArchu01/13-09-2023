package org.staticnonstatic;

public class Task1 {
	//same class
	//Access instance varaible into non-static method---direct access
	
	int id=(10);   // instance varaible
	
	private void m1() {
		System.out.println(id);
	}
	public static void main(String[]args) {
		Task1 t= new Task1();
		t.m1();
	}

}
