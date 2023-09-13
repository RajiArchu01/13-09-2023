package org.emp;

public class GreensTech {

		public void greensomr(int age) {
			System.out.println(age);
		}
	
		public void greensomr(long mobile) {
			System.out.println(mobile);
		}
		public void greensomr(int id,String name) {
			System.out.println(id+"\n"+name);
		}
		public void greensomr(String name,int id) {
			System.out.println(name+"\n"+id);
		}
		public void greensomr(String email,float mark,char grade) {
			System.out.println(email+"\n"+mark+"\n"+grade);
		}
		public static void main(String[] args) {
		GreensTech gt = new GreensTech();
		gt.greensomr(50);
		gt.greensomr(9003595686l);
		gt.greensomr(1234,"thamena");
		gt.greensomr("rajibnec@",90.89f,'A');
		
		}
	}

