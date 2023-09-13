package org.bank;


public class BankInfo extends AxisBank{
	private void saving() {
		System.out.println("saving");
	}
	private void fixed() {
		System.out.println("fixed");
	}
	public static void main(String[]args) {
		BankInfo bi = new BankInfo();
		bi.saving();
		bi.fixed();
		bi.deposit();
	}

}

