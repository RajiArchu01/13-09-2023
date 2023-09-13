package com.edu;

import com.edu.Education;

public class Arts extends Education{
	public void bsc() {
		System.out.println("BSC");			
	}
	public void bed() {
		System.out.println("BED");			
	}
	public void bA() {
		System.out.println("BA");			
	}
	public void bBa() {
		System.out.println("BBA");			
	}
	@Override
	public void ug() {
		System.out.println("UG override method ");			
	}
	@Override
	public void pg() {
		System.out.println("PG override method ");			
	}	
	public static void main(String[] args) {
		Arts a = new Arts();
		a.bsc();
		a.bed();
		a.bA();
		a.bBa();
		a.ug();
		a.pg();
	}

}


