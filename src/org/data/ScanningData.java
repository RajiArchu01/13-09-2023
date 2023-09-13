package org.data;

import java.util.Scanner;

public class ScanningData {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter EmpID: ");
		byte empId = s.nextByte();
		System.out.println(empId);

		System.out.println("Enter name:");
		String empName = s.next();
		System.out.println(empName);

		System.out.println("enter email: "); 
		String email= s.next();
		System.out.println(email);

		System.out.println("Enter empphoneno: "); 
		long empPhoneno = s.nextLong(); 
		System.out.println(empPhoneno);

		System.out.println("Enter empsalary: ");
		long empSalary = s.nextLong();
		System.out.println("Enter empSalary:");

		System.out.println("Enter empGender:");
		String empGender = s.next(); 
		System.out.println(empGender);

		System.out.println("Enter empCity:");
		String empCity = s.next(); 
		System.out.println(empCity);


	}

}
