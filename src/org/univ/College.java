package org.univ;

public class College extends University{
	@Override
	public void ug() {
		System.out.println("UG override method - College ");			
	}
	@Override
	public void pg() {
		System.out.println("PG override method - College ");			
	}	
	public static void main(String[] args) {
		College a = new College();
		a.pg();
		a.ug();
	}

}


