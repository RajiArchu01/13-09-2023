package org.network;

public class Wifi {
	private void wifiName() {
		System.out.println("12345");
	}
	public static void main(String[] args) {
		Wifi wif = new Wifi();
		wif.wifiName();
		MobileData md = new MobileData();
		md.dataName();
		Lan lan = new Lan();
		lan.lanName();
		Wireless wl = new Wireless();
		wl.modemName();
	}
}
