package org.phone;

public class PhoneInfo {
	private void phoneName() {
		System.out.println("samsung");
	}
	private void phonemieiNum() {
		System.out.println("54321");
	}
	private void camera() {
		System.out.println("15mb");
	}
	private void storage() {
		System.out.println("8gb");
	}
	private void osName() {
		System.out.println("Andriod");
	}
	public static void main(String[] args) {
		PhoneInfo mob = new PhoneInfo();
		   mob.phoneName();
		   mob.phonemieiNum();
		   mob.camera();
		   mob.storage();
		   mob.osName();
	}
}
