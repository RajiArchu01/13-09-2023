package com.college;

public class Desktop extends Computer {
	private void desktopSize() {
		System.out.println("45");
	}
public static void main(String[]args) {
	Desktop desk = new Desktop();
	desk.desktopSize();
	desk.computerModel();
}
}
