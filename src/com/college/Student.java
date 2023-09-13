package com.college;

public class Student extends College{
	private void studentName() {
		System.out.println("Raji");
	}
	private void studentId() {
		System.out.println("56789");
	}
	private void studentDept() {
		System.out.println("EIE");
	}
	public static void main(String[]args) {
		Student stu = new Student();
		stu.studentName();
		stu.studentId();
		stu.studentDept();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.hostelName();
		stu.deptName();
	}
}
