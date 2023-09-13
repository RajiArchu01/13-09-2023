package org.college;

public class College {
	private void collegeName() {
		System.out.println("bnec");
	}
	private void collegeCode() {
		System.out.println("12345");
	}
	private void collegeRank() {
		System.out.println("18");
	}
	public static void main(String[] args) {
		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();
		Student stu = new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		Hostel hos = new Hostel();
		hos.hostelName();
		Dept dep = new Dept();
		dep.deptName();	
	}
}
