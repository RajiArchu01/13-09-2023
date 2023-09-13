package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	private void vehicleNecessary() {
		System.out.println("VN");
	}
	public static void main(String[] args) {
		Vehicle vehi = new Vehicle();
		vehi.vehicleNecessary();
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		ThreeWheeler thw = new ThreeWheeler();
		thw.auto();
		FourWheeler fw = new FourWheeler();
		fw.bus();
		fw.car();
		fw.lorry();
	}

}
