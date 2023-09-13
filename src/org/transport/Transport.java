package org.transport;

import org.air.Air;
import org.road.Road;
import org.water.Water;

public class Transport {
private void transportForm() {
	System.out.println("TF");
}
public static void main(String[] args) {
	Transport trans = new Transport();
	trans.transportForm();
	Air air  = new Air();
	air.aeroplane();
	air.helicopter();
	Road road = new Road();
	road.bike();
	road.bus();
	road.car();
	road.cycle();
	Water water = new Water();
	water.boat();
	water.ship();
	
	
}

}
