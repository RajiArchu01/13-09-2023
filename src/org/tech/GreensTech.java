package org.tech;

public class GreensTech extends RedTech implements BlueTech,OrangeTech,YellowTech{
	private void studentName() {
		super.bankId();
		super.bankName();
		super.books();
		super.stationary();
		super.customerId();
		super.customerName();
		this.accountNumber();
		this.ifscCode();
		this.studentId();
		this.apple();
		this.orange();
		this.car();
		this.bike();
		this.sea();
		this.sand();
		this.teacherId();
		this.teacherName();
		
		System.out.println("rose");
	}
	private void studentId() {
		System.out.println("98526");
	}
	@Override
	public void accountNumber() {
		System.out.println("Interface - accountNumber");
		
	}
	@Override
	public void ifscCode() {
		System.out.println("Interface - ifscCode");
		
	}
	@Override
	public void apple() {
		System.out.println("Interface - apple");
		
	}
	@Override
	public void orange() {
		System.out.println("Interface - orange");
		
	}
	@Override
	public void sea() {
		System.out.println("Interface - sea");
		
	}
	@Override
	public void sand() {
		System.out.println("Interface - sand");
		
	}
	
	public static void main(String[] args) {
		GreensTech greenTech = new GreensTech();
		greenTech.studentName();
		
	}

}
