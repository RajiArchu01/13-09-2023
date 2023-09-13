package org.teacher;

public class Student {
	private void raji() {
		System.out.println("raji");
	}
	private void archu() {
		System.out.println("archu");
	}
	public static void main(String[]args) {
		Teacher t = new Teacher();
		t.thamena();
		t.poorni();
		Student s = new Student();
		s.raji();
		s.archu();
	
	}

}
