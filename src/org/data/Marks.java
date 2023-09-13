package org.data;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter studentID: "); 
		byte studentId = s.nextByte();
		System.out.println(studentId);
		
		System.out.println("Enter studentName:"); 
		String studentName = s.next(); 
		System.out.println(studentName);

        float M1,M2,M3,M4,M5;

		System.out.println("Enter mark1: "); 
		float Mark1=s.nextFloat(); 
		System.out.println(Mark1);

		System.out.println("Enter mark2: "); 
		float Mark2 = s.nextFloat(); 
		System.out.println(Mark2);

		System.out.println("Enter mark3:"); 
		float Mark3 = s.nextFloat(); 
		System.out.println(Mark3);

		System.out.println("Enter mark4:"); 
		float Mark4 = s.nextFloat(); 
		System.out.println(Mark4);

		System.out.println("Enter mark5:"); 
		float Mark5 = s.nextFloat(); 
		System.out.println(Mark5);
		float total = Mark1 + Mark2 + Mark3 + Mark4+ Mark5;
		double Marks = (total/5.0); 
		System.out.println("Total marks ="+total); 
		System.out.println("average marks ="+ Marks);
	}

}

